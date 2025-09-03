package org.example.practiceproject.repository;

import org.example.practiceproject.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository  extends JpaRepository<Team,Integer> {

}
