package com.pantaleao.manager.repository;

import com.pantaleao.manager.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, Integer>, ScoreRecordCustomRepository {
}
