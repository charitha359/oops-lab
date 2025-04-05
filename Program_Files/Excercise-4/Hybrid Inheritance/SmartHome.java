class SmartDevice {
    void connectToWiFi() {
        System.out.println("Connected to WiFi.");
    }
}
class SmartLight extends SmartDevice {
    void turnOnLight() {
        System.out.println("Smart light turned on.");
    }
}
class SmartSpeaker extends SmartDevice {
    void playMusic() {
        System.out.println("Playing music.");
    }
}
class SmartAssistant extends SmartSpeaker {
    SmartLight smartLight; 
SmartAssistant(SmartLight light) {
        this.smartLight = light;
    }

    void voiceCommand(String command) {
        System.out.println("Processing voice command: " + command);
        if (command.equalsIgnoreCase("turn on light")) {
            smartLight.turnOnLight();
        }
    }
}
public class SmartHome {
    public static void main(String[] args) {
        SmartLight light = new SmartLight();
        SmartAssistant assistant = new SmartAssistant(light);

        assistant.connectToWiFi();
        assistant.playMusic();
        assistant.voiceCommand("turn on light");
    }
}