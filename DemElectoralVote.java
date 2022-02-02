import java.util.ArrayList;

public class DemElectoralVote implements ElectoralVoteBehavior{
    int demElectoralVotes;
    int repElectoralVotes;
    State chosenState;

    @Override
    public void calculateElectoralVote(ArrayList<State> states) {
        this.demElectoralVotes=0;
        this.repElectoralVotes=0;
       int mostElectoral=states.get(0).getElectoralVotes();
        for(int i=1;i< states.size();i++){
            if(states.get(i).getElectoralVotes()>mostElectoral) {
                mostElectoral = states.get(i).getElectoralVotes();
                chosenState= states.get(i);
            }
        }

        for(int i = 0; i< states.size(); i++){
            if(states.get(i)==chosenState){
                this.demElectoralVotes+=states.get(i).getElectoralVotes();
            }
            else{
                if (states.get(i).getDemVotes() > states.get(i).getRepVotes()) {
                    this.demElectoralVotes += states.get(i).getElectoralVotes();
            } else {
                this.repElectoralVotes += states.get(i).getElectoralVotes();
            }
            }
        }
        System.out.println("Electoral Vote: Dem- "+ demElectoralVotes+" Rep- "+ repElectoralVotes);
    }
}
