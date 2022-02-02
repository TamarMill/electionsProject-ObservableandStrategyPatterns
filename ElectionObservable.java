import java.util.ArrayList;
import java.util.Observable;

public class ElectionObservable extends Observable {
    private ArrayList<State> states;

    public ElectionObservable(ArrayList<State> states){
        this.states=states;

    }
    public void resultsChanged() {
        setChanged();
        //we aren't sending a data object with the notifyObservers() call. This means we are using the pull model.
        notifyObservers();
    }
    public void setResults(ArrayList<State> states) {
        this.states=states;
        resultsChanged();
    }
//we need this method because we are using the pull model.  The Observers will use it to get the list of States.
    public  ArrayList<State> getStatesData(){
        return states;
    }
}
