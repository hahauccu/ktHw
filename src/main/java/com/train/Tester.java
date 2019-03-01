package com.train;

import java.util.Scanner;

public class
Tester {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int totalTicket =0;
        int roundTicket =0;
        int totalTicketInput=0;
        int roundTicketInput=0;
        while(totalTicket < roundTicket || roundTicketInput != -1 && totalTicketInput!= -1)
        {
            System.out.println("Please enter number of tickets: ");
            totalTicketInput = scanner.nextInt();

            System.out.println("How many round-trip tickets: ");
            roundTicketInput = scanner.nextInt();

            if(roundTicketInput != -1 && totalTicketInput!= -1)
            {
                if(totalTicketInput < roundTicketInput)
                {
                    System.out.println("total ticket can not be less than round tiecket");
                }
                else
                {
                    roundTicket +=roundTicketInput;
                    totalTicket +=totalTicketInput;

                }
            }
        }


        Ticket ticket = new Ticket(totalTicket,roundTicket);
        ticket.conculate();

    }
}
