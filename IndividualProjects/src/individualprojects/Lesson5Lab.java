/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualprojects;

/**
 *
 * @author cheryl
 */
/**
 * * create a for loop
 */
public class Lesson5Lab {

    public static void main(String args[]) {
        String partsOfMinesweeper[] = {"board", "player", "mine", "flag", "levels", "cells"};
        System.out.print("There are several parts to the game Minesweeper, a few of those are ");
        displayData(partsOfMinesweeper);
    }

    public static void displayData(String[] dataArray) {
        
        for (int i = 0; i < dataArray.length; i++) {
            System.out.print(dataArray[i] + ((i < dataArray.length - 1) ? ", " : "."));
        }
    }
    //public static void test
}
