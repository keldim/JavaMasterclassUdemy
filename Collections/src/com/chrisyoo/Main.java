package com.chrisyoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Theater theater = new Theater("Olympian", 8, 12);


        if (theater.reserveSeat("D12")) {
            System.out.println("Please pay for D12" );
        } else {
            System.out.println("Seat already reserved");
        }


        if (theater.reserveSeat("D12")) {
            System.out.println("Please pay for D12" );
        } else {
            System.out.println("Seat already reserved");
        }

        if (theater.reserveSeat("B13")) {
            System.out.println("Please pay for B13" );
        } else {
            System.out.println("Seat already reserved");
        }

        List<Theater.Seat> reverseSeats = new ArrayList<Theater.Seat>(theater.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);


        List<Theater.Seat> priceSeats = new ArrayList<Theater.Seat>(theater.getSeats());
        priceSeats.add(theater.new Seat("B00", 13.00));
        priceSeats.add(theater.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theater.PRICE_ORDER);
        printList(priceSeats);

//	    List<Theater.Seat> seatCopy = new ArrayList<Theater.Seat>(theater.seats);
//        //refers to the arraylist in theater, the change you make to seatCopy will be reflected in the arraylist
//
//        printList(seatCopy);


//        seatCopy.get(1).reserve();


//        Collections.shuffle(seatCopy);
//        System.out.println("Printing seatCopy");
//        printList(seatCopy);
//        System.out.println("Printing theater.seat");
//        printList(theater.seats);
//
//
//        Theater.Seat minSeat = Collections.min(seatCopy);
//        Theater.Seat maxSeat = Collections.max(seatCopy);
//        System.out.println("Min seat number is " + minSeat.getSeatNumber());
//        System.out.println("Max seat number is " + maxSeat.getSeatNumber());
//
//        sortList(seatCopy);
//        System.out.println("Printing sorted seatCopy");
//        printList(seatCopy);
//
//
//        List<Theater.Seat> newList = new ArrayList<Theater.Seat>(theater.seats.size());
//        Collections.copy(newList, theater.seats);


//      theater.getSeats();

//	    if (theater.reserveSeat("B13")) {
//            System.out.println("Please Pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }

//        if (theater.reserveSeat("H11")) {
//            System.out.println("Please Pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
    }

    public static void printList (List<Theater.Seat> list) {
        for (Theater.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("=============================================================");

    }





}
