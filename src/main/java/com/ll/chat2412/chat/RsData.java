package com.ll.chat2412.chat;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * packageName    : com.ll.chat2412.chat
 * fileName       : RsData
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
public class RsData<T> {
    private String resultCode;
    private String msg;
    private T data;
}
