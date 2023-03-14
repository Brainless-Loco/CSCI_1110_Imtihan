import java.util.ArrayList;

public class SkiHill {
    private String name;
    private ArrayList<SkiRun> skiRuns;
    public SkiHill(String name){
        this.name = name;
        skiRuns = new ArrayList<SkiRun>();
    }
    public String getName() {
        return name;
    }
    public ArrayList<SkiRun> getSkiRuns() {
        return skiRuns;
    }
    public void addSkiRun(SkiRun newSkiRun){
        this.skiRuns.add(newSkiRun);
    }
    public int numberSkiRuns(){
        return skiRuns.size();
    }
}
