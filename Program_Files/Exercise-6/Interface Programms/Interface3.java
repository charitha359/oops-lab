interface RideService {
    void bookRide(String pickup, String destination);
}
class Uber implements RideService {
    @Override
    public void bookRide(String pickup, String destination) {
        System.out.println("Uber ride booked from " + pickup + " to " + destination);
    }
}
class Ola implements RideService {
    @Override
    public void bookRide(String pickup, String destination) {
        System.out.println("Ola ride booked from " + pickup + " to " + destination);
    }
}
public class Interface3 {
    public static void main(String[] args) {
        RideService r1 = new Uber();
        RideService r2 = new Ola();

        r1.bookRide("Home", "Airport");
        r2.bookRide("Office", "Mall");
    }
}
