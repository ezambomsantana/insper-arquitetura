package com.insper.partida.equipe;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class TeamControllerTests {

    MockMvc mockMvc;

    @InjectMocks
    TeamController teamController;

    @Mock
    TeamService teamService;

    @BeforeEach
    void setup() {
        this.mockMvc = MockMvcBuilders
                .standaloneSetup(teamController)
                .build();
    }

    @Test
    void test_listTeams() throws Exception {

        Team team = new Team();
        team.setId(1);
        team.setIdentifier("time-1");

        List<Team> times = new ArrayList<>();
        times.add(team);

        Mockito.when(teamService.listTeams()).thenReturn(times);

        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get("/team"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();

        ObjectMapper om = new ObjectMapper();

        String resp = result.getResponse().getContentAsString();
        Assertions.assertEquals(om.writeValueAsString(times), resp);

    }

    @Test
    void test_saveTeam() throws Exception {

        Team team = new Team();
        team.setId(1);
        team.setName("time-1");

        ObjectMapper mapper = new ObjectMapper();
        String content = mapper.writeValueAsString(team);

        Mockito.when(teamService.saveTeam(team)).thenReturn(team);

        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.post("/team")
                        .content(content).contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();

        String resp = result.getResponse().getContentAsString();
        Assertions.assertEquals(content, resp);


    }





}
