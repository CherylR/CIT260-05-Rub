
/***
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 ***/
package individualprojects;

import java.util.Scanner;

/***
 * @author cheryl
 ***/
public class Lesson3Lab {
        /***
         * Lesson 3 individual assignment - two primitive variables, two math operators, /n
         * one relational or logical operator, type casting and two character escape sequences
         ***/
    String playerName;
    String welcome;
        String level;
        int num1;
        int num2;
        double answer;

        Lesson3Lab() {
                String welcome = "Please enter a player name to begin game";
                String level = "Beginner";/* for the purpose of this lab we have chosen beginner*/
                /* random whole numbers up to 10 will appear for num1 and num2*/
                num1 = (int)(Math.random()*10);
                num2 = (int)(Math.random()*10);
        }

    public void getPlayerName(){
                Scanner input = new Scanner(System.in);
                System.out.print("Enter your player name: ");/*Player enters their name*/
                playerName = input.next();
    }

    public void DisplayLevelInfo(){
         System.out.println("Please choose level: Beginner, Intermediate or Advanced level");
    }

    public void getLevel(){
                Scanner input = new Scanner(System.in);
        System.out.print("Enter your level: ");
        level = input.next();
    }

    public void getAnswer(){
                Scanner input = new Scanner(System.in);
                System.out.print("Enter your answer here: ");
                answer = input.nextDouble();
    }
    
    /* a random equation will display and the player will be promted to answer.\n
    If player answers correctly a message is displayed and another equation appears.\n
    If player answers incorrectly a different message appears and player is given \n
    another equation to try.*/

        public void displayQuestion(){
                System.out.println(num1 + " x " + num2 + " = ");
        }

        public void checkAnswer() {
                if(answer == num1 * num2) {
                        System.out.println("Correct Answer! Great Job!!\n");
                }
                else {
                        System.out.println("Sorry, incorrect answer.\n The answer was \"" + num1 * num2 + "\"");
                }
        }

        public static void main(String args[]) {
                Lesson3Lab ob1 = new Lesson3Lab();
                ob1.getPlayerName();
                ob1.displayQuestion();
                ob1.getAnswer();
                ob1.checkAnswer();

                Lesson3Lab ob2 = new Lesson3Lab();
                ob2.displayQuestion();
                ob2.getAnswer();
                ob2.checkAnswer();
        }
}
