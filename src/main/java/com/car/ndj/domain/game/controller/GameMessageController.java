package com.car.ndj.domain.game.controller;


import com.car.ndj.domain.game.dto.GameMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class GameMessageController {

    private final SimpMessagingTemplate messagingTemplate;


    @MessageMapping("/game/chat")
    public void handleChat(GameMessage message) {
        messagingTemplate.convertAndSend("/topic/chat", message);
    }

    @MessageMapping("/game/move")
    public void handleCarMovement(GameMessage message) {
        log.info(message.toString());
        messagingTemplate.convertAndSend("/topic/move", message);
    }

    @MessageMapping("/game/ai-sync")
    public void syncAICars(GameMessage message) {
        messagingTemplate.convertAndSend("/topic/ai", message);
    }

}
