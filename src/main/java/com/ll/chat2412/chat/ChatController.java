package com.ll.chat2412.chat;

import com.ll.chat2412.chat.dto.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * packageName    : com.ll.chat2412.chating
 * fileName       : ChatController
 * author         : sungjun
 * date           : 2024-12-31
 * description    : 자동 주석 생성
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-12-31        kyd54       최초 생성
 */

@Controller
@RequestMapping("/chat")
public class ChatController {

    private List<ChatMessage> chatMessages = new ArrayList<>();

    @PostMapping("/writeMessage")
    @ResponseBody
    public RsData<WriteMessageResponse> writeMessage(@RequestBody WriteMessageRequest writeMessageRequest) {   // 반환하는 chatMessages에 맞춰 지네릭스 설정함

        ChatMessage cm = new ChatMessage(writeMessageRequest.getAuthorName(), writeMessageRequest.getContent());
        chatMessages.add(cm);

        return new RsData("200", "메세지가 작성되었습니다.", new WriteMessageResponse(cm));
    }

    @GetMapping("/messages")
    @ResponseBody
    public RsData<MessagesResponse> messages(MessagesRequest messagesRequest) {
        List<ChatMessage> messages = chatMessages;

        if (messagesRequest.fromId() != null) {
            // for문을 통한 index 찾기
//            int index = -1;
//
//            for (int i = 0; i < messages.size(); i++) {
//                if (messages.get(i).getId() == messagesRequest.fromId()) {
//                    index = i;
//                    break;
//                }
//            }

            // Stream을 통한 index 찾기
            int index = IntStream.range(0, messages.size())
                    .filter(i -> chatMessages.get(i).getId() == messagesRequest.fromId())
                    .findFirst()
                    .orElse(-1);

            if (index != -1) {
                messages = messages.subList(index + 1, messages.size());
            }
        }

        return new RsData("200", "메시지 가져오기 성공", new MessagesResponse(messages, chatMessages.size()));
    }

    @GetMapping("/room")
    public String room() {
        return "chat/room";
    }
}
