public class SkiRun {
    private String name;
    private String symbol;
    private int difficultyLevel;
    public SkiRun(String name, String symbol, int difficultyLevel){
        this.name = name;
        this.symbol = symbol;
        this.difficultyLevel = difficultyLevel;
    }
    public String getName(){
        return this.name;
    }
    public  String getSymbol(){
        return this.symbol;
    }
    public int getDifficultyLevel(){
        return this.difficultyLevel;
    }
}
