package Alex.ProfileFeatures;

import java.util.*;

public class ChatFeature {
   private ArrayList <ChatMessage> messages = new ArrayList<>();
   private List <Profile> users = new ArrayList<Profile>();

   public ArrayList <ChatMessage> returnChats(){ return messages;}
   public void  newMessage(ChatMessage x){

      messages.add(x);
   }

   public List<Profile> getUsers() {
      return users;
   }

   public void setUsers(List<Profile> users) {
      this.users = users;
   }
   ChatFeature(List<Profile>x){
      users=x;

   }
}
