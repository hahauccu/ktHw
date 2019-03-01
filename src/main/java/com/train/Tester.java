package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int totalTicket ;
        int roundTicket ;
        do
        {
            System.out.println("Please enter number of tickets: ");
            totalTicket =scanner.nextInt();
            System.out.println("How many round-trip tickets: ");
            roundTicket =scanner.nextInt();
            if(totalTicket < roundTicket)
            {
                System.out.println("total ticket can not be less than round tiecket");
            }
        }while(totalTicket < roundTicket);

        Ticket ticket = new Ticket(totalTicket,roundTicket);
        ticket.conculate();

    }
}
