package org.example.practiceproject.controller;

import java.net.URI;
import java.util.List;
import org.example.practiceproject.dto.Request.CreateLeagueRequest;
import org.example.practiceproject.dto.Response.CreateLeagueResponse;
import org.example.practiceproject.dto.Response.LeagueListResponse;
import org.example.practiceproject.service.LeagueService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeagueController {
    private final LeagueService leagueService;

    public LeagueController(LeagueService leagueService) {
        this.leagueService = leagueService;
    }

    @PostMapping("/leagues")
    public ResponseEntity<CreateLeagueResponse> createLeague(@RequestBody CreateLeagueRequest createLeagueRequest){
        CreateLeagueResponse result = leagueService.createLeague(createLeagueRequest);
        URI location = URI.create("/leagues/" + result.getLeagueId());
        return ResponseEntity.created(location).body(result);
    }

    @GetMapping("/leagues")
    public ResponseEntity<List<LeagueListResponse>> getLeagues(){
        List<LeagueListResponse> result = leagueService.getLeagueList();
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
