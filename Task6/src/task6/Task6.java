/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task6;

/**
 *
 * @author 19301261
 */
import java.util.Scanner;

public class Task6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter a number between 0-9");
        for (int i = 0; i <= 14; i++) {
            int a = sc.nextInt();
            arr[a] = arr[a] + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " has been entered " + arr[i] + " times");
        }
    }

}
