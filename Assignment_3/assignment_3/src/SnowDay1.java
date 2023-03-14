import java.util.ArrayList;
import java.util.Scanner;

public class SnowDay1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name;
        String run_name;
        int run_level;
        int numOfSkiRuns ;

        name = in.nextLine();
        SkiHill skiHill = new SkiHill(name);

        numOfSkiRuns = in.nextInt();

        for(int i = 1; i <= numOfSkiRuns; i++){
            SkiRun skiRun;
            run_level = in.nextInt();
            run_name = in.nextLine();
            if(run_level == 1){
                skiRun = new EasyRun(run_name);
            }
            else if(run_level == 2){
                skiRun = new MediumRun(run_name);
            }
            else{
                skiRun = new HardRun(run_name);
            }
            skiHill.addSkiRun(skiRun);
        }


        System.out.printf("Welcome to "+skiHill.getName()+" !\n");
        System.out.printf("We hope you enjoy our "+ skiHill.numberSkiRuns()+" runs:\n");

        ArrayList<SkiRun> skiRuns = skiHill.getSkiRuns();

        for(int i = 0; i<skiHill.numberSkiRuns(); i++){
            SkiRun skiRun = skiRuns.get(i);

            System.out.printf(i+1+". "+skiRun.getName()+" ("+skiRun.getSymbol()+" - Level "+skiRun.getDifficultyLevel()+")\n");
        }

    }
}
