import java.util.ArrayList;

public class RepElectoralVote implements ElectoralVoteBehavior{
    int demElectoralVotes;
    int repElectoralVotes;
    @Override
    public void calculateElectoralVote(ArrayList<State> states) {
        this.demElectoralVotes=0;
        this.repElectoralVotes=0;
        for(int i = 0; i< states.size()-1; i++){
            if (states.get(i).getDemVotes() > states.get(i).getRepVotes()) {
                this.demElectoralVotes += states.get(i).getElectoralVotes();
            } else {
                this.repElectoralVotes += states.get(i).getElectoralVotes();
            }}

        //always assume the fifth state is republican
        this.repElectoralVotes+=states.get(4).getElectoralVotes();
        System.out.println("Electoral Vote: Dem- "+ demElectoralVotes+" Rep- "+ repElectoralVotes);

    }
}
