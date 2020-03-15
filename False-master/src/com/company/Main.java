package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean bFast = false;
        boolean bCheap = false;
        boolean bGood = false;

        System.out.print("Do you want it fast? (y/n) ");
        String fast  = scan.nextLine();
        if (fast.equals("y")){
            bFast = true;
        }

        System.out.print("Do you want it cheap? (y/n) ");
        String cheap = scan.nextLine();
        if (cheap.equals("y")){
            bCheap = true;
        }

        System.out.print("Do you want it to be good? (y/n) ");
        String good = scan.nextLine();
        if (good.equals("y")){
            bGood = true;
        }

        if (bFast != true && bCheap == true && bGood == true)
            System.out.println("OK, we'll make it cheap and good. But it will take a while.");
        else if (bFast == true && bCheap !=true && bGood == true)
            System.out.println("OK, we'll make it good and have it to you quickly. But it will cost you!");
        else if (bFast == true && bCheap == true && bGood != true)
            System.out.println("Ok, it will be done right away and it won't cost you much but it won't be very good!" );
        else
            System.out.println("Sorry, you can only have two.");

    }

}