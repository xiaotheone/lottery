/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotterynumber;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Steven
 */
public class LotteryNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      //scanner user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the minimum value: ");
        int min = keyboard.nextInt();
        System.out.println("Enter the Maximum value: ");
        int max = keyboard.nextInt();
        System.out.println("Enter the number of values you want to generate: ");
        int number = keyboard.nextInt();
        //generate 10 unique values and store them in a set;
        Set <Integer> a = new HashSet();
        while(a.size() < number)
        {
        a.add(lottery(min, max));
        }
        System.out.println(a);
    }
    public static int lottery(int min , int max )
    {
     int lucky;
     Random ran = new Random();
     lucky = ran.nextInt(max+1-min)+min;
     return lucky;
    }
}
