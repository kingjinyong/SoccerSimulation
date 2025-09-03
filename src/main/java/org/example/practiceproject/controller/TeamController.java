package org.example.practiceproject.controller;


import java.util.List;
import lombok.RequiredArgsConstructor;
import org.example.practiceproject.entity.Team;
import org.example.practiceproject.repository.TeamRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TeamController {

    private final TeamRepository teamRepository;

    @GetMapping("/team")
    public List<Team> teamList(){
        List<Team> teamList = teamRepository.findAll();
        return teamList;
    }
}
