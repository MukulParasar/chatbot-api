package com.whatsapp.chatbot_api.controller;

import com.whatsapp.chatbot_api.model.MessageRequest;
import com.whatsapp.chatbot_api.model.MessageResponse;
import com.whatsapp.chatbot_api.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {

    @Autowired
    private ChatService chatService;

    @PostMapping("/webhook")
    public MessageResponse handleMessage(@RequestBody MessageRequest request) {

        // Logging incoming message
        System.out.println("Incoming message: " + request.getMessage());

        String reply = chatService.getReply(request.getMessage());

        return new MessageResponse(reply);
    }
}
