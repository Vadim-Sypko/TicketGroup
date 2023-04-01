package com.example.ticketgroup.molel;

public class BusTicketPensioners extends BusTicket {
    private float ticketPensionersDiscount; //скида для пенсионеров
     //создание пустого конструктора
    public BusTicketPensioners(){
    }

    public BusTicketPensioners(float ticketPrice, int numberOfTickets, float ticketPensionersDiscount) {
        super(ticketPrice, numberOfTickets);
        this.ticketPensionersDiscount = ticketPensionersDiscount;
    }
    public float ticketPensionersPriceALL(){
        return(getTicketPrice() * getNumberOfTickets()*(100-ticketPensionersDiscount))/100; //
    }
}
