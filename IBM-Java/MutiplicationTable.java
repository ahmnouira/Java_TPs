/* print the mutiplication table for a given number */

public class MutiplicationTable {

    public static void multiTable(int nb) {
        System.out.println("----- Table of " + nb + " -----");
        for (int muti = 0 ; muti <= 10; muti ++ ) {
            System.out.println(nb + " * " + muti + " = " + nb * muti);
        }

        System.out.println();
    }

    public static void main(String[] args) {
       
        for(int nbs = 0; nbs <= 10; nbs ++ ) {
            multiTable(nbs);
        }

    }
    
}