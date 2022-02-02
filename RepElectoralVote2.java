import java.util.ArrayList;

public class RepElectoralVote2 implements ElectoralVoteBehavior{
    int demElectoralVotes;
    int repElectoralVotes;
    @Override
    public void calculateElectoralVote(ArrayList<State> states) {
        this.demElectoralVotes=0;
        this.repElectoralVotes=0;
        State state = null;
        int smallestLead=Integer.MAX_VALUE;

        for(int i = 0; i< states.size(); i++){

            if(states.get(i).getDemVotes()-states.get(i).getRepVotes()>0 && states.get(i).getDemVotes()-states.get(i).getRepVotes()<smallestLead){
                smallestLead=states.get(i).getDemVotes()-states.get(i).getRepVotes();
                state=states.get(i);
            }
        }
        if(state != null){
        int dividedVotes = state.getElectoralVotes()/2;

        if(state.getElectoralVotes()%2 != 0){
            this.repElectoralVotes += 1;
        }
        this.demElectoralVotes += dividedVotes;
        this.repElectoralVotes += dividedVotes;
        }

        for(int i = 0; i< states.size(); i++) {
            if (states.get(i) != state) {
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
