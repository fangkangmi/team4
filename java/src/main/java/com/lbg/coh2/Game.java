package com.lbg.coh2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
    boolean grid[][];
    int treasureSpot[] = new int[2];
    int playerPosition[] = new int[2];


    void createGrid(int length, int width){
        this.grid = new boolean[width][length];
        Random gen = new Random();
        treasureSpot[0] = gen.nextInt(length);
        treasureSpot[1] = gen.nextInt( width);
        this.grid[treasureSpot[1]][treasureSpot[0]] = true;
    }

    void createPlayer(int length, int width){
        Random gen = new Random();
        int rand = gen.nextInt(4);
        switch (rand){
            case 0:
                playerPosition[0] =0;
                playerPosition[1] = gen.nextInt( width);
                break;
            case 1:
                playerPosition[0] =length;
                playerPosition[1] = gen.nextInt( width);
                break;
            case 2:
                playerPosition[1] =0;
                playerPosition[0] = gen.nextInt( length);
                break;
            case 3:
                playerPosition[1] =width;
                playerPosition[0] = gen.nextInt( length);
                break;
        }
    }

    void start(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the length of the grid");
        int length = sc.nextInt();
        System.out.println("Please input the width of the grid");
        int width = sc.nextInt();
        createGrid(length,width);
        createPlayer(length,width);
    }


}
