package org.example.practiceproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Team {

    @Id
    @Column(name="TEAM_ID")
    private Long id;

    private String name;

    @OneToMany(mappedBy="team", fetch = FetchType.LAZY)
    private List<Player> players = new ArrayList<Player>();

    public String getName() {
        return name;
    }

    public void setName(String title) {
        this.name = title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
