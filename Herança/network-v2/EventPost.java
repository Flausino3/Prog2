public class EventPost extends Post {
    
    private String event;

    public EventPost(String author, String newEvent){
        super(author);
        this.event = newEvent;
    }

    public String getEvent()
    {
        return event;
    }

    public void printShortSummary(){
        System.out.println("Event post from " + getUserName());
    }

}
