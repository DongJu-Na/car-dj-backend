package com.car.ndj.domain.game.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameMessage {
    private String type;     // chat, move, ai-sync
    private String sender;
    private String content;
    private double x;
    private double z;
    private double rotation;
    private String color;
}