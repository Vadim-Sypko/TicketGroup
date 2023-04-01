package com.example.ticketgroup.molel;

public class BusTicketChild extends BusTicket {
    private float ticketDiscount; //скидка на детский билет
    //сщздание пустого конструктора
    public BusTicketChild(){
    }
    //создание конструктора исходных данных детского билета(стоймость,количество ,скидка

    public BusTicketChild(float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }
    //перопределение метода подсчета детски белетов
    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTickets() * (100-ticketDiscount))/100; //количесто билетов умножаем на стоймость 1 билета, на скидку и все делим на 100

    }
}

