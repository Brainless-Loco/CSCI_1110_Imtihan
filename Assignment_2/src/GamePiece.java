public class GamePiece {
    private  String symbol = "";

    public GamePiece(String symbol){
        this.symbol = symbol;
    }

    public String getSymbol(){
        return this.symbol;
    }

    public String toString(){
        return this.symbol;
    }
}
