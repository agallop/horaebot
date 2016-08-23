public class Channel implements Comparable<Channel> {
  public final String mName;
  public Vote mVote; 

  public Channel(name){
    mName = name;
  }

  public int compareTo(Channel other){
    return this.name.compareTo(other.name);
  }

  public boolean startVote(Question, answers){
    mVote = new mVote(Question, answers);
  }

  
}
