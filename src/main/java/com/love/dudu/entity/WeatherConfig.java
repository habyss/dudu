package com.love.dudu.entity;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class WeatherConfig implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;

    private String type;

    private Integer status;

    private String value;

    private LocalDateTime updateTime;

}