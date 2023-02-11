package com.example.robot_3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProxyFileScoreboard implements IFile{

    File scoreboard;
    String nome;
    String cognome;
    int punt;

    ProxyFileScoreboard(String filename,String nome,String cognome,int punt){
        scoreboard = new File(filename);
        this.nome = nome;
        this.cognome = cognome;
        this.punt = punt;
    }

    @Override
    public void open() throws IOException {

        scoreboard.createNewFile();

    }

    @Override
    public void close() throws IOException{

    }

    @Override
    public Boolean write() throws IOException{

        Scanner sc = new Scanner(scoreboard);
        ArrayList<String> lineStrings = new ArrayList<>();
        int lines = 0;
        if (sc.hasNextLine()){
            while(sc.hasNextLine()){
                lines++;
                lineStrings.add(sc.nextLine());
            }

        }
        else{

        }
        return true;

    }

    @Override
    public ArrayList<String> read() throws IOException{

        Scanner sc = new Scanner(scoreboard);
        ArrayList<String> lineStrings = new ArrayList<>();
        int lines = 0;
        if (sc.hasNextLine()){
            while(sc.hasNextLine()){
                lines++;
                lineStrings.add(sc.nextLine());
            }
        }
        else
            lineStrings.add("Nessun punteggio trovato - Che ne dici di entrare nelle leggende?");
        return lineStrings;
    }

}
