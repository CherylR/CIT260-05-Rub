
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cheryl
 */
public class exceptionTest {

    public static void main(String[] a) {
        Scanner input = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        while (true) {
            try {
                System.out.println("Please enter a number");
                int i = input.nextInt();
                System.out.println(array[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Number out of bounds");
            }
        }
    }
}
