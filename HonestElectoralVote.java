import java.util.ArrayList;

public class HonestElectoralVote implements ElectoralVoteBehavior{
    int demElectoralVotes;
    int repElectoralVotes;
    @Override
    public void calculateElectoralVote(ArrayList<State> states) {
        this.demElectoralVotes=0;
        this.repElectoralVotes=0;
        for(int i = 0; i< states.size(); i++){
            if (states.get(i).getDemVotes() > states.get(i).getRepVotes()) {
                this.demElectoralVotes += states.get(i).getElectoralVotes();
            } else {
                this.repElectoralVotes += states.get(i).getElectoralVotes();
            }}
        System.out.println("Electoral Vote: Dem- "+ demElectoralVotes+" Rep- "+ repElectoralVotes);

    }
}
