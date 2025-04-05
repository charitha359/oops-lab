interface StreamingService {
    void streamMovie(String movie);
}

class Netflix implements StreamingService {
    public void streamMovie(String movie) {
        System.out.println("Streaming " + movie + " on Netflix.");
    }
}
class AmazonPrime implements StreamingService {
    public void streamMovie(String movie) {
        System.out.println("Streaming " + movie + " on Amazon Prime.");
    }
}
public class Interface4 {
    public static void main(String[] args) {
        StreamingService s1 = new Netflix();
        StreamingService s2 = new AmazonPrime();

        s1.streamMovie("Inception");
        s2.streamMovie("Avengers");
    }
}
