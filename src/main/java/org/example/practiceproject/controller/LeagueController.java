package org.example.practiceproject.controller;

import org.example.practiceproject.dto.Request.CreateLeagueRequest;
import org.example.practiceproject.dto.Response.CreateLeagueResponse;
import org.example.practiceproject.service.LeagueService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeagueController {
    private final LeagueService leagueService;

    public LeagueController(LeagueService leagueService) {
        this.leagueService = leagueService;
    }

    @PostMapping("/league")
    public ResponseEntity<CreateLeagueResponse> createLeague(@RequestBody CreateLeagueRequest createLeagueRequest){
        CreateLeagueResponse result = leagueService.createLeague(createLeagueRequest);
        return ResponseEntity.ok(result);
    }
}
