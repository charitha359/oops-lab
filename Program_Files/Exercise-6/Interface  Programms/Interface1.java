interface Doctor {
    void consult();
}
class Cardiologist implements Doctor {
    public void consult() {
        System.out.println("Consulting a Cardiologist for heart issues.");
    }
}
class Dermatologist implements Doctor {
    public void consult() {
        System.out.println("Consulting a Dermatologist for skin problems.");
    }
}
public class Interface1 {
    public static void main(String[] args) {
        Doctor d1 = new Cardiologist();
        Doctor d2 = new Dermatologist();

        d1.consult();
        d2.consult();
    }
}
