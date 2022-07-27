package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservation {

    String hotelName;
    int rating;
    double regularCustomerRate;
    Scanner scanner = new Scanner(System.in);
    Hotel hotel;
    ArrayList<Hotel> HotelList = new ArrayList<Hotel>();

    public boolean addHotel(){
        System.out.println("Enter hotel name");
        String HotelName = scanner.next();
        System.out.println("Enter Hotel rating");
        int rating = scanner.nextInt();
        double regularCustomerRate = scanner.nextDouble();
        hotel = new Hotel( hotelName,rating, regularCustomerRate);
        return HotelList.add(hotel);
    }

    public void PrintHotelList(){
        System.out.println(HotelList);
    }


}
