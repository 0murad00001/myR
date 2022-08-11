package src.Task13;

import java.util.List;
import java.util.ArrayList;

public class User {
    String username;
    List<User> subscriptions;

    public User(String username){
        this.username = username;
        List<User> subscriptions = new ArrayList<>();
    }

    public String getUsername(){
        return username;
    }

    public List<User> getSubscriptions(){
        return subscriptions;
    }

    public void subscribe(User user){
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user){
        if(subscriptions.contains(user)){
            return true;
        }
        return false;
    }

    public boolean isFriend(User user){
        if(subscriptions.contains(user) || user.subscriptions.contains(user)){
            return true;
        }
        return false;
    }

   public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this, user, text);
   }

   @Override
   public String toString(){
        return username;              //ТУТ ПОПРОБУЙ СДЕЛАТЬ this.username
   }

}
