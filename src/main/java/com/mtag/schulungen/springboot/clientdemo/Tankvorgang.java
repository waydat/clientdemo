package com.mtag.schulungen.springboot.clientdemo;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

@Component
public class Tankvorgang {

    UUID uuid;
    BigDecimal betrag;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
