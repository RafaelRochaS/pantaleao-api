package com.pantaleao.manager.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
public class ScoreRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int scoreId;

    @Column(nullable = false)
    @NotNull
    private Date date;

    @Column(nullable = false)
    @NotNull
    @Min(0)
    @Max(100)
    private Integer winnerId;

    @Column(nullable = false)
    @NotNull
    @Min(0)
    @Max(100)
    private Integer loserId;

    @Column(nullable = false)
    @NotNull
    @Min(0)
    @Max(100)
    private Integer blueScore;

    @Column(nullable = false)
    @NotNull
    @Min(0)
    @Max(100)
    private Integer greenScore;

    @Column(nullable = false)
    @NotNull
    @Min(0)
    @Max(100)
    private Integer yellowScore;

    @Column(nullable = false)
    @NotNull
    @Min(0)
    @Max(100)
    private Integer templeScore;

    @Column(nullable = false)
    @NotNull
    @Min(0)
    @Max(100)
    private Integer godScore;

    @Column(nullable = false)
    @NotNull
    @Min(0)
    @Max(100)
    private Integer monumentScore;

    @Column(nullable = false)
    @NotNull
    @Min(0)
    @Max(100)
    private Integer chipScore;

    @Column(nullable = false)
    @NotNull
    @Min(0)
    @Max(100)
    private Integer moneyScore;

    @Column(nullable = false)
    @NotNull
    @Min(0)
    @Max(100)
    private Integer militaryScore;

    @Column(nullable = false)
    @NotNull
    @Min(0)
    @Max(100)
    private Integer senateScore;

    @Column(nullable = false)
    @NotNull
    @Min(0)
    @Max(200)
    private Integer totalScore;

    @Column(nullable = false)
    @NotNull
    private Boolean isScientificVictory;

    @Column(nullable = false)
    @NotNull
    private Boolean isMilitaryVictory;

    @Column(nullable = false)
    @NotNull
    private Boolean isPoliticalVictory;

    public void setDate(Date date) {
        this.date = date;
    }

    public void setWinnerId(Integer winnerId) {
        this.winnerId = winnerId;
    }

    public void setLoserId(Integer loserId) {
        this.loserId = loserId;
    }

    public void setBlueScore(Integer blueScore) {
        this.blueScore = blueScore;
    }

    public void setGreenScore(Integer greenScore) {
        this.greenScore = greenScore;
    }

    public void setYellowScore(Integer yellowScore) {
        this.yellowScore = yellowScore;
    }

    public void setTempleScore(Integer templeScore) {
        this.templeScore = templeScore;
    }

    public void setGodScore(Integer godScore) {
        this.godScore = godScore;
    }

    public void setMonumentScore(Integer monumentScore) {
        this.monumentScore = monumentScore;
    }

    public void setChipScore(Integer chipScore) {
        this.chipScore = chipScore;
    }

    public void setMoneyScore(Integer moneyScore) {
        this.moneyScore = moneyScore;
    }

    public void setMilitaryScore(Integer militaryScore) {
        this.militaryScore = militaryScore;
    }

    public void setSenateScore(Integer senateScore) {
        this.senateScore = senateScore;
    }

    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    public void setScientificVictory(Boolean isScientificVictory) {
        this.isScientificVictory = isScientificVictory;
    }

    public void setMilitaryVictory(Boolean isMilitaryVictory) {
        this.isMilitaryVictory = isMilitaryVictory;
    }

    public void setPoliticalVictory(Boolean isPoliticalVictory) {
        this.isPoliticalVictory = isPoliticalVictory;
    }

    public Date getDate() {
        return date;
    }

    public Integer getWinnerId() {
        return winnerId;
    }

    public Integer getLoserId() {
        return loserId;
    }

    public Integer getBlueScore() {
        return blueScore;
    }

    public Integer getGreenScore() {
        return greenScore;
    }

    public Integer getYellowScore() {
        return yellowScore;
    }

    public Integer getTempleScore() {
        return templeScore;
    }

    public Integer getGodScore() {
        return godScore;
    }

    public Integer getMonumentScore() {
        return monumentScore;
    }

    public Integer getChipScore() {
        return chipScore;
    }

    public Integer getMoneyScore() {
        return moneyScore;
    }

    public Integer getMilitaryScore() {
        return militaryScore;
    }

    public Integer getSenateScore() {
        return senateScore;
    }

    public Integer getTotalScore() {
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

    public Integer getScoreId() {
        return scoreId;
    }

    public void setScoreId(Integer scoreId) {
        this.scoreId = scoreId;
    }
}