package com.mtag.schulungen.springboot.clientdemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.io.IOException;
import java.util.UUID;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TrusteeServerApplicationTests {

    JacksonTester<Tankvorgang> tankvorgangJacksonTester;
    JacksonTester<Ventil> ventilJacksonTester;
    @Autowired
    MockMvc mockMVC;

    @BeforeEach
    void init(){
        JacksonTester.initFields(this, new ObjectMapper());
    }


    @Test
    void testNeuerVorang() throws Exception {

        MvcResult result = mockMVC.perform(MockMvcRequestBuilders.post("/neuerVorgang")
        .contentType(MediaType.APPLICATION_JSON)
                .content(ventilJacksonTester.write(new Ventil()).getJson())
        .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
        .andReturn();
    }

    @Test
    void testAuftankenabgeschlossen() throws Exception {
        MvcResult result = mockMVC.perform(MockMvcRequestBuilders.post("/neuerVorgang")
                .contentType(MediaType.APPLICATION_JSON)
                .content(tankvorgangJacksonTester.write(new Tankvorgang()).getJson())
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
                .andExpect(status().isOk())
                .andReturn();


    }
}
