interface SocialMedia {
    void postMessage(String message);
}
class Facebook implements SocialMedia {
    public void postMessage(String message) {
        System.out.println("Posting on Facebook: " + message);
    }
}
class Twitter implements SocialMedia {
    public void postMessage(String message) {
        System.out.println("Tweeting on Twitter: " + message);
    }
}
public class Interface2 {
    public static void main(String[] args) {
        SocialMedia sm1 = new Facebook();
        SocialMedia sm2 = new Twitter();

        sm1.postMessage("Hello, Facebook!");
        sm2.postMessage("Hello, Twitter!");
    }
}
