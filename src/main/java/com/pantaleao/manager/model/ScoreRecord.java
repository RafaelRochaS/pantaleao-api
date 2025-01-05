package com.pantaleao.manager.model;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;

public class ScoreRecord {
    @NotBlank
    private Date date;

    @NotBlank
    private int winnerId;

    @NotBlank
    private int loserId;

    @NotBlank
    private int blueScore;

    @NotBlank
    private int greenScore;

    @NotBlank
    private int yellowScore;

    @NotBlank
    private int templeScore;

    @NotBlank
    private int godScore;

    @NotBlank
    private int monumentScore;

    @NotBlank
    private int chipScore;

    @NotBlank
    private int moneyScore;

    @NotBlank
    private int militaryScore;

    @NotBlank
    private int senateScore;

    @NotBlank
    private int totalScore;

    @NotBlank
    private boolean isScientificVictory;

    @NotBlank
    private boolean isMilitaryVictory;

    @NotBlank
    private boolean isPoliticalVictory;

    public Date getDate() {
        return date;
    }

    public int getWinnerId() {
        return winnerId;
    }

    public int getLoserId() {
        return loserId;
    }

    public int getBlueScore() {
        return blueScore;
    }

    public int getGreenScore() {
        return greenScore;
    }

    public int getYellowScore() {
        return yellowScore;
    }

    public int getTempleScore() {
        return templeScore;
    }

    public int getGodScore() {
        return godScore;
    }

    public int getMonumentScore() {
        return monumentScore;
    }

    public int getChipScore() {
        return chipScore;
    }

    public int getMoneyScore() {
        return moneyScore;
    }

    public int getMilitaryScore() {
        return militaryScore;
    }

    public int getSenateScore() {
        return senateScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public boolean isScientificVictory() {
        return isScientificVictory;
    }

    public boolean isMilitaryVictory() {
        return isMilitaryVictory;
    }

    public boolean isPoliticalVictory() {
        return isPoliticalVictory;
    }

    private int scoreId;

    public ScoreRecord() {
    }

    public ScoreRecord(ScoreRecord scoreRecord) {
        this.date = scoreRecord.getDate();
        this.winnerId = scoreRecord.getWinnerId();
        this.loserId = scoreRecord.getLoserId();
        this.blueScore = scoreRecord.getBlueScore();
        this.greenScore = scoreRecord.getGreenScore();
        this.yellowScore = scoreRecord.getYellowScore();
        this.templeScore = scoreRecord.getTempleScore();
        this.godScore = scoreRecord.getGodScore();
        this.monumentScore = scoreRecord.getMonumentScore();
        this.chipScore = scoreRecord.getChipScore();
        this.moneyScore = scoreRecord.getMoneyScore();
        this.militaryScore = scoreRecord.getMilitaryScore();
        this.senateScore = scoreRecord.getSenateScore();
        this.totalScore = scoreRecord.getTotalScore();
        this.isScientificVictory = scoreRecord.isScientificVictory();
        this.isMilitaryVictory = scoreRecord.isMilitaryVictory();
        this.isPoliticalVictory = scoreRecord.isPoliticalVictory();
    }

    public int getScoreId() {
        return scoreId;
    }

    public void setScoreId(int scoreId) {
        this.scoreId = scoreId;
    }

}