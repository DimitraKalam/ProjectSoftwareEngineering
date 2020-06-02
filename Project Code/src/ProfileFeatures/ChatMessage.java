package ProfileFeatures;

public class ChatMessage {
    private String text;
    private String File;
    private ChatFeature fromChat;
    private Employee sender;

    public ChatMessage returnMessages(){return null;}
    public boolean messageSent(){return true;}
    public static String successMessage(){return "Success";}
    public ChatMessage(String x, Employee y){
        this.text=x;
        this.sender=y;
    }

    public Employee getSender() {
        return sender;
    }

    public String getText() {
        return text;
    }
}
