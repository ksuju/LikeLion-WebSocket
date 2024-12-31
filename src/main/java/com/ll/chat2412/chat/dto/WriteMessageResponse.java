package com.ll.chat2412.chat.dto;

import com.ll.chat2412.chat.ChatMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/**
 * packageName    : com.ll.chat2412.chat.dto
 * fileName       : WriteMessageResponse
 * author         : sungjun
 * date           : 2024-12-31
 * description    : 자동 주석 생성
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-12-31        kyd54       최초 생성
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class WriteMessageResponse {
//    private List<ChatMessage> chatMessage;
    private ChatMessage chatMessage;
    // ChatMessages를 List로 받아서 처리, 편리한거 말고 뭐가 좋은지 찾아보기
//    private long id;
//    private String authorName;
//    private String content;
//    private LocalDateTime createDate;
}
