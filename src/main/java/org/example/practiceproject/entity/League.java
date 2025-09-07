package org.example.practiceproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import org.example.practiceproject.dto.Request.CreateLeagueRequest;

@Entity
public class League {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="LEAGUE_ID")
    private Long id;

    private String name;

    @OneToMany(mappedBy="league", fetch= FetchType.LAZY)
    private List<Team> teams = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Team> getTeams() {
        return teams;
    }

    protected League() {
    }

    public League(String name) {
        this.name = name;
    }

    public static League from(CreateLeagueRequest createLeagueRequest) {
        if(createLeagueRequest.getName() == null || createLeagueRequest.getName().isBlank()){
            throw new IllegalArgumentException("Name cannot be null/blank");
        }

        return new League(
                createLeagueRequest.getName().trim()
        );
    }

}
