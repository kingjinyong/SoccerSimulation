package org.example.practiceproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Staff {

    @Id
    @Column(name="STAFF_ID")
    private Long id;

    private String name;

    private StaffRole role;

    @ManyToOne()
    @JoinColumn(name="TEAM_ID")
    private Team team;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public StaffRole getRole() {
        return role;
    }

    public Team getTeam() {
        return team;
    }
}
