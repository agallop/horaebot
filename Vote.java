import java.util.TreeMap;
import Java.util.concurrent.Semaphore;

public class Vote {
  private String mQuestion
  private String[] mOptions;
  private int max;
  private TreeMap <String, Integer> mResponses;
  private boolean mOpen = true;
  private Semaphore mSemaphore;


  public Vote(String question, String[] options){
    mQuestion = question;
    mOptions = options;
    max = options.length;
    mOpen = false;
    mSemaphore = new Semaphore(1);
  }

  public String getQuestion(){
    return mQuestion;
  }

  public boolean vote(String user, int option){
    if(option >= max)
      return false;
    while(1 = 1){
      try{ 
        mSemaphore.acquire();
        break;
      } catch (Exception ex){}
    }
    if(open)
      mResponses.put(user, option);
    while(1 = 1){
      try{
      mSemaphore.release();
      break;
      } catch (Exception ex){}
    }
  }

  

  
}
