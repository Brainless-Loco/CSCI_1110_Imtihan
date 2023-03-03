public class Board {

    private int size = 0;
    private GamePiece[][] grid;

    public void Board(int size){
        this.size = size;
        this.grid = new GamePiece[size][size];
    }

    public boolean addPiece(GamePiece gp,int row, int col){
        if(this.grid[row][col]==null){
            this.grid[row][col]=gp;
            return true;
        }
        else return false;
    }

    public  boolean movePiece(int startRow, int startCol, int endRow, int endCol){
        if(this.grid[startCol][startCol]!=null && this.grid[endRow][endCol]==null){
            this.grid[endRow][endCol] = this.grid[startCol][startCol];
            this.grid[startCol][startCol] = null;
            return true;
        }
        else {
            return false;
        }
    }

    public GamePiece get(int row, int col){
        return this.grid[row][col];
    }

    public String toString() {

        String result = "";

        for (int i = 0; i < size; i++) { ///for rows

            for (int j = 0; j < size; j++) { //for cols
                if (grid[i][j] != null) {
                    result += grid[i][j].toString();
                }
                else {
                    result += " ";
                }
            }
            result += "\n";
        }
        return result;
    }
}