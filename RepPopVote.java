import java.util.ArrayList;

public class RepPopVote implements PopVoteBehavior {

    int demVotes;
    int repVotes;


    @Override
    public void calculatePopVote(ArrayList<State> states) {
    for(int i=0; i<states.size();i++){
    demVotes+=states.get(i).getDemVotes();
  }

     int dem = (int) (demVotes*.05);
     demVotes = demVotes-dem;

     for(int i=0; i<states.size();i++){
            repVotes+=states.get(i).getRepVotes();
        }

     System.out.println("Popular Vote: Dem- "+ demVotes+ " Rep- "+repVotes);



    }
}
