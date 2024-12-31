package com.ll.chat2412.chat;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

/**
 * packageName    : com.ll.chat2412.chat
 * fileName       : ChatMessage
 * author         : sungjun
 * date           : 2024-12-31
 * description    : 자동 주석 생성
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-12-31        kyd54       최초 생성
 */
@AllArgsConstructor
@Getter
public class ChatMessage {
    private long id;
    private String authorName;
    private String content;
    private LocalDateTime createDate;

    public ChatMessage(String authorName, String content) {
        this.id = ChatMessageIdGenerator.genNextId();
        this.authorName = authorName;
        this.content = content;
        this.createDate = LocalDateTime.now();
    }

    static class ChatMessageIdGenerator {
        private static long id = 0;

        public static long genNextId() {
            return ++id;
        }
    }
}
