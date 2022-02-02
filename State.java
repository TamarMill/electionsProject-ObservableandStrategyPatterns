public class State {
    int demVotes;
    int repVotes;
    int electoralVotes;
    public State(){

    }
    public void setDemVotes(int demVotes){
        this.demVotes=demVotes;
    }
    public void setRepVotes(int repVotes){
        this.repVotes=repVotes;
    }
    public void setElectoralVotes(int electoralVotes){
        this.electoralVotes=electoralVotes;
    }
    public int getDemVotes(){
        return demVotes;
    }
    public int getRepVotes(){
        return repVotes;
    }
    public int getElectoralVotes(){
        return electoralVotes;
    }

}
