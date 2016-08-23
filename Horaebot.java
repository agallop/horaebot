import org.jibble.pircbot.*;

public class Horaebot extends PircBot {

  int shutUpCountDown = 0;

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
      if(shutUpCountDown == 0){
        sendMessage(channel, "SHUT UP REVLOBOT");
        shutUpCountDown = 5;
      }
    
      shutUpCountDown--;
    }
    else if (sender.equals("nightbot")) {
      if(shutUpCountDown == 0){
                    sendMessage(channel, "SHUT UP NIGHTBOT");
        shutUpCountDown = 5;
      }
    
      shutUpCountDown--;
    }
    else if (message.toLowerCase().contains("weed") || message.toLowerCase().contains("blunt")){
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

