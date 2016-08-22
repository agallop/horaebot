import org.jibble.pircbot.*;

public class HoraebotMain {

  /* Arguments
     arg0: Nickname
     arg2: OAuth token
     arg3 and up: Channel to join
   */
  public static void main(String [] args) throws Exception {
    

    if(args.length < 3){
      System.err.println("Argument Error (Should add more detail to this error message...)");
      System.exit(-1);
    }

    //starting bot
    Horaebot bot = new Horaebot(args[0]);

    // Enable debugging output.
    bot.setVerbose(true);

    try {
      bot.connect("irc.chat.twitch.tv", 6667, args[1]);
    } catch (NickAlreadyInUseException e) {
      System.err.println("Nickname is currently in use");
    } catch (IrcException e) {
      System.err.println("Server did not accept connection");
      e.printStackTrace();
    } finally {
      for(int i = 2; i < args.length; i++)
        bot.joinChannel("#" + args[i]);
    }
  }
}
