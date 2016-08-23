import org.jibble.pircbot.*;

public class Horaebot extends PircBot {

  public Horaebot (String nickname) {
    super();
    this.setName(nickname);
  }

  public void onMessage(String channel, String sender,
                       String login, String hostname, String message) {

    System.out.println(sender);
    if (message.equalsIgnoreCase("time")) {
      String time = new java.util.Date().toString();
      sendMessage(channel, sender + ": The time is now " + time);
    }
    else if (sender.equals("revlobot")) {
      sendMessage(channel, "SHUT UP REVLOBOT");
    }
    else if (message.contains("weed") || message.contains("blunt")){
      sendMessage(channel, "https://www.facebook.com/complexmagSPORTS/videos/833739746756700/");
    }
    else if (sender.equals("horaeshio") && message.equals("!sleep")){
      for(String chan : getChannels()){
        sendMessage(chan, "Going to sleep ResidentSleeper");
      }
      try {
        Thread.sleep(2000);
        disconnect();
      } catch (Exception ex) {}
    }
  }
 
}

