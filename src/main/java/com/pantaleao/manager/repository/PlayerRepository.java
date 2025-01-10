package com.pantaleao.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pantaleao.manager.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
