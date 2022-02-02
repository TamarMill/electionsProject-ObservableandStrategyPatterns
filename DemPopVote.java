import java.util.ArrayList;

public class DemPopVote implements PopVoteBehavior{
    int demVotes;
    int repVotes;
    int highestDem;

    @Override
    public void calculatePopVote(ArrayList<State> states) {
        int highestRep= states.get(0).getRepVotes();
for(int i=1;i<states.size();i++){
    if(states.get(i).getRepVotes()>highestRep){
        highestRep=states.get(i).getRepVotes();
        highestDem=states.get(i).getDemVotes();
    }
}
        for(int i=0; i<states.size();i++){
            demVotes+=states.get(i).getDemVotes();
        }
        demVotes-=highestDem;
        //subtract highest amount of repVotes from final tally
        for(int i=0; i<states.size();i++){
            repVotes+=states.get(i).getRepVotes();
        }
        repVotes-=highestRep;
        System.out.println("Popular Vote: Dem- "+ demVotes+ " Rep- "+repVotes);
    }
}
