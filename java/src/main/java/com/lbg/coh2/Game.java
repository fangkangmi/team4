package com.lbg.coh2;

import java.util.Random;

import java.util.Random;

public class Game {
    boolean grid[][];
    int treasureSpot[] = new int[2];


    void createGrid(int length, int width){
        this.grid = new boolean[width][length];
        Random gen = new Random();
        treasureSpot[0] = gen.nextInt(0, length);
        treasureSpot[1] = gen.nextInt(0, width);
        this.grid[treasureSpot[1]][treasureSpot[0]] = true;
    }
}
