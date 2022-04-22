//Sorin Macaluso
//hw9
//CMPT 220 
//Problem3.java

//A double class that organizes flight data


import java.util.GregorianCalendar;
import java.util.List;
import java.util.ArrayList;

//flight class
class Flight {
    //variables
    private String flightNumber;
    private GregorianCalendar departureTime;
    private GregorianCalendar arrivalTime;
  
    //constructor for the Flight class
    Flight(String flightNumber, GregorianCalendar departureTime, GregorianCalendar arrivalTime) {
      this.flightNumber = flightNumber;
      this.departureTime = departureTime;
      this.arrivalTime = arrivalTime;
    }
    
    //getters for the FlightNumber, departureTime, and ArrivalTime
    String getFlightNumber() {
      return flightNumber;
    }
  
    GregorianCalendar getDepartureTime() {
      return departureTime;
    }
  
    GregorianCalendar getArrivalTime() {
      return arrivalTime;
    }

    //setters for the departureTime, and ArrivalTime
    void setDepartureTime(GregorianCalendar newDepartureTime){
      this.departureTime = newDepartureTime;
    }

    void setArrivalTime(GregorianCalendar newArrivalTime){
      this.arrivalTime = newArrivalTime;
    }

    //gets the flight time for a single flight
    int getFlightTime(){
      int FlightTime = (int)arrivalTime.getTimeInMillis() - (int)departureTime.getTimeInMillis();
      FlightTime = FlightTime/60000;
      return FlightTime;
    }

}

//Itinerary class
class Itinerary {
    //varaibles
    private List<Flight> flights;

    //constructor
    Itinerary(List<Flight> flights) {
      this.flights = flights;
    }

    //gets the total time from last flight to the first flights
    int getTotalTime() {

      int totalTime =  (int)flights.get(flights.size()-1).getArrivalTime().getTimeInMillis() - (int)flights.get(0).getDepartureTime().getTimeInMillis();

      return totalTime / 60000;
      }
    
    //get the total time from all the fligths combined
    int getTotalFlightTime() {
      int TotalFlightTime = 0;

      for(Flight f: flights){
        TotalFlightTime += f.getFlightTime();
      }

      return TotalFlightTime;
    }
}

public class Problem3 {
  public static void main(String[] args) {
    //building things in the classes
    List<Flight> flights = new ArrayList<>();
    flights.add(new Flight("US230",
    new GregorianCalendar(2014, 4, 5, 5, 5, 0),
    new GregorianCalendar(2014, 4, 5, 6, 15, 0)));
    flights.add(new Flight("US235",
    new GregorianCalendar(2014, 4, 5, 6, 55, 0),
    new GregorianCalendar(2014, 4, 5, 7, 45, 0)));
    flights.add(new Flight("US237",
    new GregorianCalendar(2014, 4, 5, 9, 35, 0),
    new GregorianCalendar(2014, 4, 5, 12, 55, 0)));
    Itinerary itinerary = new Itinerary(flights);
    System.out.println(itinerary.getTotalTime());
    System.out.println(itinerary.getTotalFlightTime());
    }
        
}
