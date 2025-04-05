class Electronics {
    void powerOn() {
        System.out.println("Electronic device is powered on");
    }
}
class Laptop extends Electronics {
    void code() {
        System.out.println("Laptop is used for coding");
    }
}
class Mobile extends Electronics {
    void call() {
        System.out.println("Mobile is used for calling");
    }
}
class Television extends Electronics {
    void watch() {
        System.out.println("Watching TV shows");
    }
}
public class ElectronicsStore {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Mobile mobile = new Mobile();
        Television tv = new Television();

        laptop.powerOn();
        laptop.code();

        mobile.powerOn();
        mobile.call();

        tv.powerOn();
        tv.watch();
    }
}
