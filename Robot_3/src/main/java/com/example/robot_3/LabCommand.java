package com.example.robot_3;

import javafx.event.Event;

import java.io.IOException;

public abstract class LabCommand {

    protected String nome;

    protected String cognome;
    protected int diff;

    LabCommand(String nome, String cognome){

        this.nome = nome;
        this.cognome = cognome;

    }

    abstract void loadLab(Event event) throws IOException;

}
