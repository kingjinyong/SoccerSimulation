package org.example.practiceproject.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Player {

    @Id
    @Column(name="PLAYER_ID")
    private Long id;

    @ManyToOne()
    @JoinColumn(name="TEAM_ID")
    private Team team;

    private String name;

    private Integer overall;

    private Position position;

    protected Player() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getOverall() {
        return overall;
    }

    public Position getPosition() {
        return position;
    }

    public Team getTeam() {
        return team;
    }
}

