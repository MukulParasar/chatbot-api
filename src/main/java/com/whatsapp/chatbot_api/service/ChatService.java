package com.whatsapp.chatbot_api.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {
    public String getReply(String message) {
        if (message == null) {
            return "Invalid message";
        }

        message = message.toLowerCase();

        switch (message) {
            case "hi": return "Hello";
            case "bye": return "Goodbye";
            case "how are you": return "I'm a chatbot built with Spring Boot, and I'm doing great!";
            default: return "I don't understand";
        }
    }
}
