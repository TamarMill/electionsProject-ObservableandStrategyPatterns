import java.util.Observable;
import java.util.Observer;

public class Observer2 extends MainObserver implements Observer {

    public Observer2(Observable o) {
            o.addObserver(this);
            popVoteBehavior = new DemPopVote();
            electoralVoteBehavior = new DemElectoralVote();
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
            System.out.println("Display 2");
        }
    }


