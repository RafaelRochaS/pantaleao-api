package com.pantaleao.manager.model;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;

public record ScoreRecord(
    int scoreId,
    @NotBlank Date date,
    @NotBlank int winnerId,
    @NotBlank int loserId,
    @NotBlank int blueScore,
    @NotBlank int greenScore,
    @NotBlank int yellowScore,
    @NotBlank int templeScore,
    @NotBlank int godScore,
    @NotBlank int monumentScore,
    @NotBlank int chipScore,
    @NotBlank int moneyScore,
    @NotBlank int militaryScore,
    @NotBlank int senateScore,
    @NotBlank int totalScore,
    @NotBlank boolean isScientificVictory,
    @NotBlank boolean isMilitaryVictory,
    @NotBlank boolean isPoliticalVictory) {
}