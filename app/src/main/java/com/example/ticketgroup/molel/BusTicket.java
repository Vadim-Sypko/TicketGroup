package com.example.ticketgroup.molel;

public class BusTicket {
    // задание полей сущности
    private String departurePoint; // место отправления
    private String arrivalPoint; // место прибытия
    private String departureDate; // время отправления
    private String arrivalDate; // время прибытия
    private String travelTime; // время пути
    private int distance; // расстояние пути
    private float ticketPrice; // стоимость взрослого билета
    private int numberOfTickets; // количество билетов
    //создание пустого конструктора
    public BusTicket(){

    }
    //создание конструктора исходных данных
    public BusTicket(float ticketPrice, int numberOfTickets) {
        this.ticketPrice = ticketPrice;  //стоймость взрослого билета
        this.numberOfTickets = numberOfTickets;   //количество билетов
    }
     //метод подсчета стоймости взрослых билетов
    public float ticketPriceAll(){
        return ticketPrice * numberOfTickets;  // умножаем колл во билетов на стоймость одного билета
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}
