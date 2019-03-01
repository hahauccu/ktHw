package com.train;

public class Ticket {
    int totalTicket;
    int roundTicket;

    public Ticket(int singelTicket, int roundTicket) {
        this.totalTicket = singelTicket;
        this.roundTicket = roundTicket;
    }

    public void conculate()
    {
        int total=0;
        total += (totalTicket - roundTicket) * 1000;
        total += roundTicket * 1800;
        System.out.print("Totle tickets : " + totalTicket + "\nRound tip : "+ roundTicket + "\nTotal : " + total );
    }

}
