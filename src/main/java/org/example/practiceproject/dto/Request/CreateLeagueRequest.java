package org.example.practiceproject.dto.Request;

public class CreateLeagueRequest {

    private String name;

    public String getName() {
        return name;
    }

    public CreateLeagueRequest(String name) {
        this.name = name;
    }
}
