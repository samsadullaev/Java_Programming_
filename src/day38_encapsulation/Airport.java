package day38_encapsulation;

public class Airport {
    public static void main(String[] args) {

        FlightTicket ticket1 = new FlightTicket("first", "chicago", "Virginia");
        System.out.println(ticket1.getType());
        System.out.println(ticket1.getArrival());
        System.out.println(ticket1.getDeparture());

        FlightTicket ticket2 = new FlightTicket("flying", "New York", "Canada");
       // System.out.println(ticket2.setType("economy")); why this way dont work
      //  ticket2.setType("economy");
        System.out.println(ticket2.getType());


    }
}
