import java.util.ArrayList;

public class HonestPopVote implements PopVoteBehavior{
    int demVotes;
    int repVotes;
    @Override
    public void calculatePopVote(ArrayList<State> states) {
        for(int i=0; i<states.size();i++){
            demVotes+=states.get(i).getDemVotes();
        }
        for(int i=0; i<states.size();i++){
            repVotes+=states.get(i).getRepVotes();
        }

        System.out.println("Popular Vote: Dem- "+ demVotes+ " Rep- "+repVotes);
    }
}
