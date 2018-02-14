package com.structuralpattern.facade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FlightBooker {

        public List<Flight> getFlightNamesFor(Date to, Date from) {
            return new ArrayList<Flight>();
        }

        public class Flight {
            private String fligthDesc;

            public Flight() {
            }

            @Override
            public String toString() {
                return "Flight{" +
                        " fligthDesc='" + fligthDesc + '\'' +
                        '}';
            }
        }
}
