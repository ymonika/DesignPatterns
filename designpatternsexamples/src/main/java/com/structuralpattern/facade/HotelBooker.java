package com.structuralpattern.facade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelBooker {

    public List<Hotel> getHotelNamesFor(Date to, Date from) {
        return new ArrayList<Hotel>();
    }

    public class Hotel {
        private String hotelName;

        public Hotel() {
        }

        @Override
        public String toString() {
            return "Hotel{" +
                    " hotelName='" + hotelName + '\'' +
                    '}';
        }
    }
}
