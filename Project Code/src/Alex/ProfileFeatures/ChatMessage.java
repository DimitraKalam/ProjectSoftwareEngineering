package Alex.ProfileFeatures;

public class ChatMessage {
    private String text;
    private String File;
    private ChatFeature fromChat;

    public ChatMessage returnMessages(){return null;}
    public boolean messageSent(){return true;}
    public static String successMessage(){return "Success";}
    ChatMessage(String x){
        this.text=x;
    }
}
