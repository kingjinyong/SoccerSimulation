package org.example.practiceproject.service;

import org.example.practiceproject.dto.Request.CreateLeagueRequest;
import org.example.practiceproject.dto.Response.CreateLeagueResponse;
import org.example.practiceproject.entity.League;
import org.example.practiceproject.repository.LeagueRepository;
import org.springframework.stereotype.Service;

@Service
public class LeagueService {

    private final LeagueRepository leagueRepository;

    public LeagueService(LeagueRepository leagueRepository) {
        this.leagueRepository = leagueRepository;
    }

    public CreateLeagueResponse createLeague(CreateLeagueRequest createLeagueRequest){
        League league = League.from(createLeagueRequest);

        League saved = leagueRepository.save(league);

        return new CreateLeagueResponse(saved.getId(), saved.getName());
    }
}
