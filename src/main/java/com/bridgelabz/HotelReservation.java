package com.bridgelabz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class HotelReservation {

    String hotelName;
    int rating;
    double regularCustomerRate;
    Scanner scanner = new Scanner(System.in);
    Hotel hotel;
    ArrayList<Hotel> HotelList = new ArrayList<Hotel>();

    public boolean addHotel() {
        System.out.println("Enter hotel name");
        String HotelName = scanner.next();
        System.out.println("Enter Hotel rating");
        int rating = scanner.nextInt();
        double regularCustomerRate = scanner.nextDouble();
        hotel = new Hotel(rating, regularCustomerRate);
        return HotelList.add(hotel);
    }

    public void printHotelList() {
        System.out.println(HotelList);
    }

    public Hotel getCheapestHotel(LocalDate startDate, LocalDate endDate) {


        Optional<Hotel> sortedHotelList = HotelList.stream().min(Comparator.comparing(Hotel::getRegularCustomerRate));
        return sortedHotelList.get();
    }
}


