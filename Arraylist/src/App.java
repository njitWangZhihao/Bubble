import java.time.LocalDate;  
import java.util.ArrayList;   
  
class Event {  
    private String eventID;  
    private String eventName;  
    private String eventVenue;  
    private LocalDate eventDate;  
    private ArrayList<String> eventParticipants;  
  
    public Event(String eventID, String eventName, String eventVenue, LocalDate eventDate) {  
        this.eventID = eventID;  
        this.eventName = eventName;  
        this.eventVenue = eventVenue;  
        this.eventDate = eventDate;  
        this.eventParticipants = new ArrayList<>();  
    }  
  
    // Getters and Setters  
    public String getEventID() {  
        return eventID;  
    }  
  
    public void setEventID(String eventID) {  
        this.eventID = eventID;  
    }  
  
    public String getEventName() {  
        return eventName;  
    }  
  
    public void setEventName(String eventName) {  
        this.eventName = eventName;  
    }  
  
    public String getEventVenue() {  
        return eventVenue;  
    }  
  
    public void setEventVenue(String eventVenue) {  
        this.eventVenue = eventVenue;  
    }  
  
    public LocalDate getEventDate() {  
        return eventDate;  
    }  
  
    public void setEventDate(LocalDate eventDate) {  
        this.eventDate = eventDate;  
    }  
  
    public ArrayList<String> getEventParticipants() {  
        return eventParticipants;  
    }  
  
    public void setEventParticipants(ArrayList<String> eventParticipants) {  
        this.eventParticipants = eventParticipants;  
    }  
  
    public void addParticipant(String participant) {  
        eventParticipants.add(participant);  
    }  
  
    public void removeParticipant(String participant) {  
        eventParticipants.remove(participant);  
    }  
  
    public void updateParticipant(String oldParticipant, String newParticipant) {  
        int index = eventParticipants.indexOf(oldParticipant);  
        if (index != -1) {  
            eventParticipants.set(index, newParticipant);  
        } else {  
            System.out.println("Participant not found.");  
        }  
    }  
  
    public String findParticipant(String participant) {  
        if (eventParticipants.contains(participant)) {  
            return "Participant found.";  
        } else {  
            return "Participant not found.";  
        }  
    }  
  
    public int getParticipantCount() {  
        return eventParticipants.size();  
    }  
  
    @Override  
    public String toString() {  
        return "Event{" +  
                "eventID='" + eventID + '\'' +  
                ", eventName='" + eventName + '\'' +  
                ", eventVenue='" + eventVenue + '\'' +  
                ", eventDate=" + eventDate +  
                ", eventParticipants=" + eventParticipants +  
                '}';  
    }  
  
    public void organizeEvent() {  
        // This is a placeholder for organizing the event  
        System.out.println("Organizing the event...");  
    }  
}  
  
