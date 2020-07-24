import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {
    int[][] grid;
    int n;

    // creates n-by-n grid, with all sites initially blocked
    //0 blocked/full and 1 is open
    //Constructor throws illegalArgumentException if n <= 0;
    public Percolation(int n) {
        if(n <= 0){
            throw new IllegalArgumentException();
        }
        this.grid = new  int[n][n];
        this.n = n;

    }

    //TODO fix upper out of bounds range if

    // opens the site (row, col) if it is not open already
    public void open(int row, int col){
        if(row < 0 || col < 0){
            throw new IllegalArgumentException();
        }else if(row > n || col > n){
            throw new IllegalArgumentException("Arguments are out of bounds. Too large.");
        }
        //Subtract one to make top left row and col index (1,1)
        //E.g. If (1,1) is passed then its translated to (0,0)
        int r = row - 1;
        int c = col -1;
        //Checks value of site. If 0, closed. If 1 open.
        if(grid[r][c] == 0){
            //Open site if not already open. Change site to 1.
            grid[r][c] = 1;
        }else System.out.println("Site already open");
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col){
        //Check site row, col if open then 1 true
        if(row < 0 || col < 0){
            throw new IllegalArgumentException();
        }
        else if(row > n || col > n){
            throw new IllegalArgumentException("Arguments are out of bounds. Too large.");
        }
        // else 0 and false
        return grid[row - 1][col - 1] == 1;
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col){

        //Check range of row and col must be > 0;
        if(row < 0 || col < 0){
            throw new IllegalArgumentException();
        }
        else if(row > n || col > n){
            throw new IllegalArgumentException("Arguments are out of bounds. Too large.");
        }
        return grid[row - 1][col - 1] == 0;
    }

    // returns the number of open sites
    public int numberOfOpenSites(){
        int openSites = 0;
        for(int row = 0 ; row < grid.length;row++){
            for(int col = 0 ; col < grid[row].length; col++){
                if(grid[row][col] == 1){
                    openSites++;
                }
            }
        }
        return openSites;
    }

    // does the system percolate?
    //TODO Check criteria for percolate.
    //TODO Virtual node at top and bottom instead of iterating through all???
    public boolean percolates(){
        double perc = 0;
        double size = 0;
        for(int row = 0; row < grid.length;row++){
            for(int col = 0 ; col < grid[row].length;col++){
                if(grid[row][col] == 1){
                    perc++;

                }
                size ++;
            }
        }
        return perc / size > .50 ;
    }

    // test client (optional)
    public static void main(String[] args){
        Percolation perc = new Percolation(5);

        System.out.println("Initial: "+ perc.numberOfOpenSites());

        //perc.open(1,4);
        //perc.open(2,3);
        //perc.open(4,1);
        perc.open(1,1);
        perc.open(5,5);
        perc.open(3,3);
        //perc.open(3,3);
        System.out.println("After opening: "+perc.numberOfOpenSites());



        System.out.println(perc.isFull(1,4));
        System.out.println(perc.isFull(5,5));
        System.out.println("Percolation: "+ perc.percolates());
        perc.printGrid();
    }

    public void printGrid(){
        for(int row = 0 ; row < grid.length; row++){
            for(int col = 0; col < grid[row].length; col++){
                System.out.print(grid[row][col]+ " ");
            }
            System.out.println();
        }

    }
}
