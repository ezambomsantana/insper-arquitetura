package com.insper.partida.equipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping
    public List<Team> listTeams() {
        return teamService.listTeams();
    }

    @PostMapping
    public Team saveTeam(@RequestBody Team team) {
        return teamService.saveTeam(team);
    }

    @DeleteMapping("/{identifier}")
    public void deleteTeam(@PathVariable String identifier) {
        teamService.deleteTeam(identifier);
    }


}
