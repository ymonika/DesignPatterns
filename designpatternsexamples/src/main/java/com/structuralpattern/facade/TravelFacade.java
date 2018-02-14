package com.structuralpattern.facade;

import java.util.Date;

public class TravelFacade {

    private HotelBooker hotelBooker;
    private FlightBooker flightBooker;

    public TravelFacade() {
        this.hotelBooker = new HotelBooker();
        this.flightBooker = new FlightBooker();
    }

    public void getFlightsAndHotels(Date to, Date from) {
        hotelBooker.getHotelNamesFor(to, from);
        flightBooker.getFlightNamesFor(to, from);
    }

}
