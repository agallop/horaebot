import org.jibble.pircbot.*;

public class Horaebot extends PircBot {

  public Horaebot (String nickname) {
    super();
    this.setName(nickname);
  } 

  public void onMessage(String channel, String sender,
                       String login, String hostname, String message) {
    if (message.equalsIgnoreCase("time")) {
      String time = new java.util.Date().toString();
      sendMessage(channel, sender + ": The time is now " + time);
    }
  }
}
