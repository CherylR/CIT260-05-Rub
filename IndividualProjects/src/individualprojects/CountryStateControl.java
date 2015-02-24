/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualprojects;

import java.util.Scanner;

/**
 *
 * @author cheryl
 */
public class CountryStateControl {

    Scanner input;
    String state;
    String country;

    public CountryStateControl() {
        input = new Scanner(System.in);
        
    }

    public void getState() {

        this.state = input.next();
        this.state = this.state.toUpperCase().trim();
    }

    public void getCountry() {

        this.country = input.next();
    }

    public void stateResponse() {
        if (state.equals("NA")) {
            System.out.println("Dear citizen of " + country + "," + "thank you for helping us track other countries where our game is being played");
        } else if (state.equals("MA") || state.equals("VT") || state.equals("ME") || state.equals("NH") || state.equals("RI") || state.equals("CT")) {
            System.out.println("Welcome to a fellow New Englander, thanks for playing our game");
        } else if (state.equals("ID")) {
            System.out.println("Hello Idaho, I'm a online student at BYUI, thanks for playing the game we designed in CIT260");
        } else {
            System.out.println("Thank you for playing our game. This version was designed by a group of students at BYU-Idaho in CIT260 class the winter of 2015.");

        }
    }

    public static void main(String args[]) {
        CountryStateControl ob1 = new CountryStateControl();
        ob1.getState();
        ob1.getCountry();
        ob1.stateResponse();
    }
}
