package org.example.practiceproject.dto.Request;

public class CreateLeagueRequest {

    private final String name;

    public String getName() {
        return name;
    }

    public CreateLeagueRequest(String name) {
        this.name = name;
    }
}
