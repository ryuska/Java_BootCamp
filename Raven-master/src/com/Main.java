package com;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        int response_counter=0;
        Scanner scan = new Scanner(System.in);

        Raven r1 = new Raven();
        Invoice i1 = new Invoice();

        int question_counter=0;
        int session_counter=0;

        String[] str;

        System.out.println("Please enter your personal contact information");
        System.out.println("NAME:");
        i1.setName(scan.nextLine());
        System.out.println("Please enter your house number and street name: ");
        i1.setAddress_line_1(scan.nextLine());
        System.out.println("Please enter your city, state, and zip code: ");
        i1.setAddress_line_2(scan.nextLine());
        System.out.println("Good morning, how are you today?");

        boolean quit = false;

        while (!quit) {
            System.out.println("Please enter your response or Q to quit:");
            String response = scan.nextLine();

            str = response.split(" ");

            if (response.equalsIgnoreCase("Q")) {
                quit = true;
                System.out.println("Good buy!");
            } else {

                System.out.println(r1.getResponse(str));
                question_counter++;
                session_counter=1;
            }
        }
        i1.getDescription(question_counter, session_counter);
    }
}















