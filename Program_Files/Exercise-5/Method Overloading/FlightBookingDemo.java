class FlightBooking {
    void bookTicket(String name) {
        System.out.println("Ticket booked for: " + name);
    }
    void bookTicket(String name, String seatClass) {
        System.out.println("Ticket booked for: " + name + " in " + seatClass + " class.");
    }
    void bookTicket(String name, String seatClass, String mealPreference) {
        System.out.println("Ticket booked for: " + name + " in " + seatClass + " class with " + mealPreference + " meal.");
    }
}
public class FlightBookingDemo {
    public static void main(String[] args) {
        FlightBooking booking = new FlightBooking();
        
        booking.bookTicket("Alice");
        booking.bookTicket("Bob", "Business");
        booking.bookTicket("Charlie", "Economy", "Vegetarian");
    }
}
