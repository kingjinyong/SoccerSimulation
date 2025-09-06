package org.example.practiceproject.repository;

import org.example.practiceproject.entity.League;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeagueRepository extends JpaRepository<League, Long> {
}
