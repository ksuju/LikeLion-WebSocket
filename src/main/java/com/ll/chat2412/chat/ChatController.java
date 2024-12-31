package com.ll.chat2412.chat;

import com.ll.chat2412.chat.dto.WriteMessageResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
    public RsData<List<ChatMessage>> writeMessage() {   // 반환하는 chatMessages에 맞춰 지네릭스 설정함

        // 기존
//        new ChatMessage(1,"강성준", "와", LocalDateTime.now());

        // ChatMessage 클래스 수정 후
        ChatMessage ch = new ChatMessage("영희", "우와");
        chatMessages.add(ch);

        ChatMessage ch2 = new ChatMessage("철수", "우와와");
        chatMessages.add(ch2);

        return new RsData<List<ChatMessage>>("200", "메세지가 작성되었습니다.", chatMessages);
    }

    @GetMapping("/writeMessage")
    @ResponseBody
    public String getMessage() {
        return "Get 응답입니다.";
    }

}
