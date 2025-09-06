package org.example.practiceproject.dto.Response;

public class CreateLeagueResponse {

    private final Long leagueId;
    private final String name;

    public CreateLeagueResponse(Long leagueId, String name) {
        this.leagueId = leagueId;
        this.name = name;
    }

    public Long getLeagueId() {
        return leagueId;
    }

    public String getName() {
        return name;
    }
}
