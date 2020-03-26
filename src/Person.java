import Framework.GridsAndAgents.AgentPT2D;
import Framework.Util;

public class Person extends AgentPT2D<Room> {
    int patid; // patient ID or visitor for that patient
    int status; // 1 for patient, 2 for visitor,
    int numVisitors;
    int entered;
    int direction;
    int LeaveTrigger=0;

    public Person Init(int stat, int numVisitors, int id, int tick, int direction){
        this.status=stat;
        this.numVisitors=numVisitors;
        this.patid=id;
        this.entered=tick;
        this.direction=direction;
        return(this);
    }


}
