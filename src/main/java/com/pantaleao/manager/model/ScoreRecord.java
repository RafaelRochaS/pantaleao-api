package com.pantaleao.manager.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class ScoreRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int scoreId;

    @Column(nullable = false)
    @NotBlank
    private Date date;

    @Column(nullable = false)
    @NotBlank
    private int winnerId;

    @Column(nullable = false)
    @NotBlank
    private int loserId;

    @Column(nullable = false)
    @NotBlank
    private int blueScore;

    @Column(nullable = false)
    @NotBlank
    private int greenScore;

    @Column(nullable = false)
    @NotBlank
    private int yellowScore;

    @Column(nullable = false)
    @NotBlank
    private int templeScore;

    @Column(nullable = false)
    @NotBlank
    private int godScore;

    @Column(nullable = false)
    @NotBlank
    private int monumentScore;

    @Column(nullable = false)
    @NotBlank
    private int chipScore;

    @Column(nullable = false)
    @NotBlank
    private int moneyScore;

    @Column(nullable = false)
    @NotBlank
    private int militaryScore;

    @Column(nullable = false)
    @NotBlank
    private int senateScore;

    @Column(nullable = false)
    @NotBlank
    private int totalScore;

    @Column(nullable = false)
    @NotBlank
    private boolean isScientificVictory;

    @Column(nullable = false)
    @NotBlank
    private boolean isMilitaryVictory;

    @Column(nullable = false)
    @NotBlank
    private boolean isPoliticalVictory;

    public void setDate(Date date) {
        this.date = date;
    }

    public void setWinnerId(int winnerId) {
        this.winnerId = winnerId;
    }

    public void setLoserId(int loserId) {
        this.loserId = loserId;
    }

    public void setBlueScore(int blueScore) {
        this.blueScore = blueScore;
    }

    public void setGreenScore(int greenScore) {
        this.greenScore = greenScore;
    }

    public void setYellowScore(int yellowScore) {
        this.yellowScore = yellowScore;
    }

    public void setTempleScore(int templeScore) {
        this.templeScore = templeScore;
    }

    public void setGodScore(int godScore) {
        this.godScore = godScore;
    }

    public void setMonumentScore(int monumentScore) {
        this.monumentScore = monumentScore;
    }

    public void setChipScore(int chipScore) {
        this.chipScore = chipScore;
    }

    public void setMoneyScore(int moneyScore) {
        this.moneyScore = moneyScore;
    }

    public void setMilitaryScore(int militaryScore) {
        this.militaryScore = militaryScore;
    }

    public void setSenateScore(int senateScore) {
        this.senateScore = senateScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public void setScientificVictory(boolean isScientificVictory) {
        this.isScientificVictory = isScientificVictory;
    }

    public void setMilitaryVictory(boolean isMilitaryVictory) {
        this.isMilitaryVictory = isMilitaryVictory;
    }

    public void setPoliticalVictory(boolean isPoliticalVictory) {
        this.isPoliticalVictory = isPoliticalVictory;
    }

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