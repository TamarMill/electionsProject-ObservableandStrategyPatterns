import java.util.Observable;
import java.util.Observer;

public class Observer5 extends MainObserver implements Observer {
    public Observer5(Observable o) {
        o.addObserver(this);
        popVoteBehavior = new HonestPopVote();
        electoralVoteBehavior = new HonestElectoralVote();
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof ElectionObservable){
            //pull
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
        System.out.println("Display 5");
    }
}



