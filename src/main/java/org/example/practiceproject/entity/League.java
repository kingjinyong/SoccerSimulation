package org.example.practiceproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class League {

    @Id
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
}
