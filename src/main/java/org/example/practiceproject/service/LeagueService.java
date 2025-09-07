package org.example.practiceproject.service;

import org.example.practiceproject.dto.Request.CreateLeagueRequest;
import org.example.practiceproject.dto.Response.CreateLeagueResponse;
import org.example.practiceproject.entity.League;
import org.example.practiceproject.repository.LeagueRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly=true)
public class LeagueService {

    private final LeagueRepository leagueRepository;

    public LeagueService(LeagueRepository leagueRepository) {
        this.leagueRepository = leagueRepository;
    }

    @Transactional
    public CreateLeagueResponse createLeague(CreateLeagueRequest createLeagueRequest){

        if (leagueRepository.existsByName(createLeagueRequest.getName())) {
            throw new IllegalArgumentException("이미 존재하는 리그 이름입니다.");
        }

        League league = League.from(createLeagueRequest);

        League saved = leagueRepository.save(league);

        return new CreateLeagueResponse(saved.getId(), saved.getName());
    }
}
