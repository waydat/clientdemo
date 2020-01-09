package com.mtag.schulungen.springboot.clientdemo;

import java.math.BigDecimal;
import java.util.UUID;

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
