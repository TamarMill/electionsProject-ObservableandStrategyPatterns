import java.util.Observable;
import java.util.Observer;

public class Observer1 extends MainObserver implements Observer {
    Observable observable;
    public Observer1(Observable o) {
        this.observable=o;
        o.addObserver(this);
        popVoteBehavior = new RepPopVote();
        electoralVoteBehavior = new RepElectoralVote();
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof ElectionObservable){
            //pull- calls the getStatesData method on the Election Observable Object
            statesData = ((ElectionObservable) o).getStatesData();
            display();
        }


    }
    public void display(){
        printDisplayType();
        performPopVote();
        performElectoralVote();
        printLegalMessage();
    }

    @Override
    public void printDisplayType() {
        System.out.println("Display 1");
    }
}
