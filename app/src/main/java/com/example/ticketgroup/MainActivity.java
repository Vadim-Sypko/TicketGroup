package com.example.ticketgroup;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ticketgroup.molel.BusTicket;
import com.example.ticketgroup.molel.BusTicketChild;
import com.example.ticketgroup.molel.BusTicketPensioners;

public class MainActivity extends AppCompatActivity {
    //создаем объект сущности взрослых объектов (стоймость,количество )
    BusTicket busTicket = new BusTicket(70,9);
    //сущность детских билетов(стоймость ,количество ,скидка)
    BusTicketChild busTicketChild = new BusTicketChild(70,11,50);
    //создаем объект сущности билетов для пенсионеров
    BusTicketPensioners busTicketPensioners = new BusTicketPensioners(70,5,30);

    //содание полей для вывода на экран нужных значений
    private TextView busTicketOut;//поле вывода общей стоймости взрослых билетов
    private TextView busTicketChildOut;//общяя стоймость дестких билетов
    private TextView busTicketPensionersOut;//общяя стоймость билетоа для пенсионеров
    private TextView busTicketTotalOut;//поле вывода стоймости всех билетов

    //вывод на экран полученых значений
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {          //создание жизненого цикла октивности
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);       //присваивание жизненому циклу активити представление активити мэйн

        //присваивание переменным активити элемент представление activity_vain
        busTicketOut = findViewById(R.id.busTicketOut);
        busTicketChildOut = findViewById(R.id.busTicketChildOut);
        busTicketPensionersOut = findViewById(R.id.busTicketPensionersOut);
        busTicketTotalOut = findViewById(R.id.busTicketTotalOut);

        //заполнение экрана
        //1(заполнение первого поля воспользовавшись  методом подсчета стоймости взрослых белетов ticketPriceALL()
        //спомошью метода Float.toString(мы конвертировали данные из типа float в String)
        busTicketOut.setText(Float.toString(busTicket.ticketPriceAll()) + " монет");
        busTicketChildOut.setText(Float.toString(busTicketChild.ticketPriceAll()) + " манет");
        busTicketPensionersOut.setText(Float.toString(busTicketPensioners.ticketPriceAll()) + " монет");
        busTicketTotalOut.setText(Float.toString(busTicket.ticketPriceAll() + busTicketChild.ticketPriceAll() + busTicketPensioners.ticketPriceAll()) + " монет");

    }
}