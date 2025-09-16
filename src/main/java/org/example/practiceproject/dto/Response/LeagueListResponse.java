package org.example.practiceproject.dto.Response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.practiceproject.entity.League;

@Getter
@AllArgsConstructor
public class LeagueListResponse {
    private String leagueName;

    public static LeagueListResponse craeteLeague(League league){
        return new LeagueListResponse(
                league.getName()
        );
    }
}
