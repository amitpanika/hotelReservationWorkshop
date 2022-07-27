package com.bridgelabz;

import java.time.LocalDate;
import java.time.Month;

public class HotelReservationMain {
    public static void main(String[] args) {
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel();
        hotelReservation.addHotel();
        hotelReservation.addHotel();
        hotelReservation.printHotelList();

        // ****** here i m defining end and start date........

        LocalDate startDate = LocalDate.of(2021, Month.SEPTEMBER, 10);
        LocalDate endDate = LocalDate.of(2021, Month.SEPTEMBER, 11);

       //  ****** Calling method..........

        Hotel hotel = hotelReservation.getCheapestHotel(startDate, endDate);
        System.out.println("The cheapest hotel is : \n " + hotel);


    }
}
