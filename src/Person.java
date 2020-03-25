import Framework.GridsAndAgents.AgentPT2D;

public class Person extends AgentPT2D<Room> {
    int patid; // patient ID or visitor for that patient
    int status; // 1 for patient, 2 for visitor,
    int numVisitors;
    int entered;

    public Person Init(int stat, int numVisitors, int id, int tick){
        this.status=stat;
        this.numVisitors=numVisitors;
        this.patid=id;
        this.entered=tick;
        return(this);
    }


}