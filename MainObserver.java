import java.time.LocalDateTime;
import java.util.ArrayList;

public abstract class MainObserver {
    PopVoteBehavior popVoteBehavior;
    ElectoralVoteBehavior electoralVoteBehavior;
    ArrayList<State> statesData;
    public MainObserver(){

    }
    public abstract void printDisplayType();
    public static void printLegalMessage(){
        System.out.println(" All reports are purely observational and not legally binding in any way. Current Time: "+ LocalDateTime.now().getHour()+ ": "+ LocalDateTime.now().getMinute());
    }
    public void performPopVote(){
        popVoteBehavior.calculatePopVote(statesData);
    }
    public void performElectoralVote(){
        electoralVoteBehavior.calculateElectoralVote(statesData);
    }
}
