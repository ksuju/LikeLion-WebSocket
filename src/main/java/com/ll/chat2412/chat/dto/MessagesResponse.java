package com.ll.chat2412.chat.dto;

import com.ll.chat2412.chat.ChatMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * packageName    : com.ll.chat2412.chat.dto
 * fileName       : MessageResponse
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
public class MessagesResponse {
    private List<ChatMessage> chatMessages;
    private int totalCount;
}
