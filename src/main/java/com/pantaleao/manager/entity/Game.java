package com.pantaleao.manager.entity;

import com.pantaleao.manager.exceptions.InvalidInputException;
import com.pantaleao.manager.model.ScoreRecord;

public abstract class Game {
    protected String name;
    protected String description;

    Game(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public abstract Game validateInput(Object record) throws InvalidInputException;
}
