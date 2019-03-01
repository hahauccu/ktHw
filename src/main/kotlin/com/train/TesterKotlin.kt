package com.train

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`);
    var totalTicket:Int;
    var roundTicket:Int;
    do
    {
        println("Please enter number of tickets: ");
        totalTicket =scanner.nextInt();
        println("How many round-trip tickets: ");
        roundTicket =scanner.nextInt();
        if(totalTicket < roundTicket)
        {
            println("total ticket can not be less than round tiecket");
        }
    }while(totalTicket < roundTicket);
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
        print("Totle tickets : " + totalTicket + "\nRound tip : "+ roundTicket + "\nTotal : " + total );
    }
}