import java.util.regex.*;          
import java.lang.String;            
import java.time.*;                
public class StringRegexDateExample {
    public static void main(String[] args) {
        String text = "Java is fun!";
        String upperCaseText = text.toUpperCase();
        System.out.println("Uppercase Text: " + upperCaseText);
        Pattern pattern = Pattern.compile("\\bJ\\w*");
        Matcher matcher = pattern.matcher("Java is fun! JavaScript is also fun.");
        System.out.println("Words starting with 'J':");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        LocalDateTime currentDateTime = LocalDateTime.now();
        
        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current Date and Time: " + currentDateTime);
    }
}









