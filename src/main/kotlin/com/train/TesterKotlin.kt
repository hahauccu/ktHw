package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`);
    var totalTicket=0;
    var roundTicket=0;
    var roundTicketInput=0;
    var totalTicketInput=0;


    while(totalTicket < roundTicket || roundTicketInput != -1 && totalTicketInput!= -1)
    {
        println("Please enter number of tickets: ");
        totalTicketInput = scanner.nextInt();

        println("How many round-trip tickets: ");
        roundTicketInput = scanner.nextInt();

        if(roundTicketInput != -1 && totalTicketInput!= -1)
        {
            if(totalTicketInput < roundTicketInput)
            {
                println("total ticket can not be less than round tiecket");
            }
            else
            {
                roundTicket +=roundTicketInput;
                totalTicket +=totalTicketInput;

            }
        }
    }
    val ticket = TicketKt(totalTicket,roundTicket);
    ticket.conculate();

5
}

class TicketKt(var totalTicket: Int , var roundTicket: Int )
{
    fun conculate()
    {
        var total=0;
        total += (totalTicket - roundTicket) * 1000;
        total += roundTicket * 1800;
        print("Totle tickets : $totalTicket\nRound tip : $roundTicket\nTotal : $total" );
    }
}