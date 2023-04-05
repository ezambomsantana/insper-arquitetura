package com.insper.partida.aposta;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.insper.partida.equipe.Team;
import com.insper.partida.equipe.TeamController;
import com.insper.partida.equipe.TeamService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class BetControllerTests {

    MockMvc mockMvc;

    @InjectMocks
    BetController betController;

    @Mock
    BetService betService;

    @BeforeEach
    void setup() {
        this.mockMvc = MockMvcBuilders
                .standaloneSetup(betController)
                .build();
    }

    @Test
    void test_listBets() throws Exception {

    }

    @Test
    void test_createBets() throws Exception {

    }

    @Test
    void test_verifyBets() throws Exception {

    }



}
