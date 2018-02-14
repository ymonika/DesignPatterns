package com.structuralpattern.facade;

import java.util.Date;

public class FacadeDemo {

    public static void main(String[] args) {
        TravelFacade travelFacade = new TravelFacade();
        travelFacade.getFlightsAndHotels(new Date(), new Date());
    }
}
