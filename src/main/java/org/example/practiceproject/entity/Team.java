package org.example.practiceproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {

    @Id
    @Column(name="TEAM_ID")
    private Long id;

    private String name;

    @ManyToOne()
    @JoinColumn(name="LEAGUE_ID")
    private League league;

    @OneToMany(mappedBy="team", fetch=FetchType.LAZY)
    private List<Staff> staff = new ArrayList<>();

    @OneToMany(mappedBy="team", fetch = FetchType.LAZY)
    private List<Player> players = new ArrayList<Player>();

    protected Team(){

    }

    public Long getId() {
        return id;
    }

    public League getLeague() {
        return league;
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Staff> getStaff() {
        return staff;
    }
}
