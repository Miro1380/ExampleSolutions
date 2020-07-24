import java.util.Scanner;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class PercolationStats {
    int n ;
    int trials;

    // perform independent trials on an n-by-n grid
    public PercolationStats(int n, int trials){
        //Throw error if n or trials <=0.
        if(n <= 0 || trials <= 0){
            System.err.println("Illegal Argument Exception. Values must be greater than zero.");
            throw new IllegalArgumentException();
        }
        this.n = n;
        this.trials= trials;
    }

    // sample mean of percolation threshold
    public double mean(double [] values){
        return StdStats.mean(values);
    }

    // sample standard deviation of percolation threshold
    public double stddev(double [] values){
        return StdStats.stddev(values);
    }

    // low endpoint of 95% confidence interval
    public double confidenceLo(){
        //s -> std dev.
        //T - > number of trials.
        double t = 0;
        double s = 0;
        double mean = 0;
        double xLow = (1.96 * s)/Math.sqrt(t);
        return xLow;

    }

    // high endpoint of 95% confidence interval
    public double confidenceHi(){
        //s -> std dev.
        //T - > number of trials.
        //
        double t = 0;
        double s = 0;
        double mean =0 ;
        double xHgH = mean + ((1.96 * s)/Math.sqrt(t));
        return xHgH;
    }

    // test client (see below)
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Input for n values
        System.out.print("Enter n value:");
        int n = scanner.nextInt();
        //Input for number of trials
        System.out.print("Enter trials value:");
        int trials = scanner.nextInt();

        if(n <= 0 || trials <= 0){
            System.err.println("Illegal Argument Exception. Values must be greater than zero.");
            throw new IllegalArgumentException();
        }else{

            PercolationStats stats = new PercolationStats(n, trials);

        }
    }

}