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
public class lesson6lab {

    public static void main(String args[]) {
        int[] ageOfPlayers = {18, 20, 21, 17, 16, 18, 19, 22, 25, 15};
        int sum = 0;
        for(int x : ageOfPlayers){
           sum+= x; 
        }
       int avg = sum/ageOfPlayers.length;
        System.out.println("The average player age is " + avg);
    }

}
