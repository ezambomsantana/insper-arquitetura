package com.insper.partida.equipe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class TeamServiceTests {

    @InjectMocks
    TeamService teamService;

    @Mock
    TeamRepository teamRepository;


    @Test
    void test_listTeams() {
        Mockito.when(teamRepository.findAll()).thenReturn(new ArrayList<>());

        List<Team> resp = teamService.listTeams();

        Assertions.assertEquals(0, resp.size());
    }

    @Test
    void test_listTeamsNotEmpty() {

        Team team = getTeam();

        List<Team> lista = new ArrayList<>();
        lista.add(team);

        Mockito.when(teamRepository.findAll()).thenReturn(lista);

        List<Team> resp = teamService.listTeams();

        Assertions.assertEquals(1, resp.size());
        Assertions.assertEquals(1, resp.get(0).getId());
    }


    @Test
    void test_saveTeam() {


        Team team = getTeam();

        Mockito.when(teamRepository.save(team)).thenReturn(team);
        Team resp = teamService.saveTeam(team);

        Assertions.assertEquals(1, resp.getId());
        Assertions.assertEquals("time-1", team.getIdentifier());
        Assertions.assertEquals(team, resp);

    }

    @Test
    void test_getTeam() {

        Team team = getTeam();

        Mockito.when(teamRepository.findByIdentifier("time-1")).thenReturn(team);

        Team resp = teamService.getTeam("time-1");

        Assertions.assertEquals(1, resp.getId());

    }

    @Test
    void test_deleteTeam() {

        Team team = getTeam();

        Mockito.when(teamRepository.findByIdentifier("time-1")).thenReturn(team);

        Mockito.doNothing().when(teamRepository).delete(team);

        teamService.deleteTeam("time-1");

        Mockito.verify(teamRepository, Mockito.times(1))
                .delete(team);
    }

    @Test
    void test_deleteTeamNull() {

        Mockito.when(teamRepository.findByIdentifier("time-1")).thenReturn(null);

        // Mockito.doNothing().when(teamRepository).delete(team);

        teamService.deleteTeam("time-1");

    }



    private static Team getTeam() {
        Team team = new Team();
        team.setId(1);
        team.setIdentifier("time-1");
        team.setName("Time 1");
        return team;
    }


}
