import java.util.ArrayList;

public class Main {
    public static void main (String[] args){


        ArrayList<State> states= new ArrayList<State>();
        State NY = new State();
        State NJ = new State();
        State CA = new State();
        State AZ= new State();
        State OH= new State();

        states.add(NY);
        states.add(NJ);
        states.add(CA);
        states.add(AZ);
        states.add(OH);


        NY.setDemVotes(100);
        NY.setRepVotes(200);
        NY.setElectoralVotes(5);

        NJ.setDemVotes(300);
        NJ.setRepVotes(200);
        NJ.setElectoralVotes(7);

        CA.setDemVotes(500);
        CA.setRepVotes(600);
        CA.setElectoralVotes(9);

        AZ.setDemVotes(50);
        AZ.setRepVotes(100);
        AZ.setElectoralVotes(10);

        OH.setDemVotes(400);
        OH.setRepVotes(200);
        OH.setElectoralVotes(8);


        ElectionObservable observable = new ElectionObservable(states);

        Observer1 observer1 = new Observer1(observable);
        Observer2 observer2 = new Observer2(observable);
        Observer3 observer3 = new Observer3(observable);
        Observer4 observer4 = new Observer4(observable);
        Observer5 observer5 = new Observer5(observable);

        observable.setResults(states);






        System.out.println("Make Changes");

        NY.setDemVotes(70);
        NY.setRepVotes(20);
        NY.setElectoralVotes(2);

        NJ.setDemVotes(200);
        NJ.setRepVotes(300);
        NJ.setElectoralVotes(10);

        CA.setDemVotes(500);
        CA.setRepVotes(60);
        CA.setElectoralVotes(7);

        AZ.setDemVotes(70);
        AZ.setRepVotes(80);
        AZ.setElectoralVotes(14);

        OH.setDemVotes(300);
        OH.setRepVotes(100);
        OH.setElectoralVotes(3);

        observable.setResults(states);

        System.out.println("Make Changes");

        NY.setDemVotes(90);
        NY.setRepVotes(30);
        NY.setElectoralVotes(6);

        NJ.setDemVotes(500);
        NJ.setRepVotes(600);
        NJ.setElectoralVotes(19);

        CA.setDemVotes(300);
        CA.setRepVotes(600);
        CA.setElectoralVotes(70);

        AZ.setDemVotes(700);
        AZ.setRepVotes(180);
        AZ.setElectoralVotes(25);

        OH.setDemVotes(300);
        OH.setRepVotes(10);
        OH.setElectoralVotes(13);

        observable.setResults(states);

        System.out.println("Make Changes");

        NY.setDemVotes(90);
        NY.setRepVotes(91);
        NY.setElectoralVotes(6);

        NJ.setDemVotes(500);
        NJ.setRepVotes(501);
        NJ.setElectoralVotes(19);

        CA.setDemVotes(300);
        CA.setRepVotes(200);
        CA.setElectoralVotes(70);

        AZ.setDemVotes(100);
        AZ.setRepVotes(180);
        AZ.setElectoralVotes(25);

        OH.setDemVotes(100);
        OH.setRepVotes(1);
        OH.setElectoralVotes(13);

        observable.setResults(states);





    }
}
