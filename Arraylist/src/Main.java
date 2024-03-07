import java.time.LocalDate;  

  
public class Main {  
    public static void main(String[] args) {  
         
  
        // Assume user input for simplicity  
        String eventID = "EV001";  
        String eventName = "Birthday Party";  
        String eventVenue = "Home";  
        LocalDate eventDate = LocalDate.now(); // Current date for simplicity  
  
        Event event = new Event(eventID, eventName, eventVenue, eventDate);  
  
        // User interactions (for demonstration purposes)  
        event.addParticipant("A");  
        event.addParticipant("B");  
        event.removeParticipant("A");  
        event.updateParticipant("B", "C");  
        System.out.println(event.findParticipant("C"));  
        System.out.println("Total participants: " + event.getParticipantCount());  
  
        event.organizeEvent();
    }
    }
