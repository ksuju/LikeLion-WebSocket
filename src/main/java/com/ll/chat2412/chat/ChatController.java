package com.ll.chat2412.chat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @PostMapping("/writeMessage")
    @ResponseBody
    public String writeMessage() {
        return "Post 응답입니다.";
    }

    @GetMapping("/writeMessage")
    @ResponseBody
    public String getMessage() {
        return "Get 응답입니다.";
    }

}
