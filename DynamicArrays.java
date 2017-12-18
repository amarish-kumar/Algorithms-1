/*

Dynamic Arrays HackerRank

*/
import java.io.*;
import java.util.*;

public class DynamicArrays {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Vector<Vector<Integer>> seqList = new Vector<Vector<Integer>>(n);
        for(int i = 0;i<n;i++){
            seqList.add(new Vector<Integer>());
        }
        int lastAns = 0;
        for(int i = 0;i<m;i++){
            int queryType = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int seqIndex = ((x ^ lastAns)%n);
            Vector<Integer> currSeq = seqList.get(seqIndex);
            if(queryType == 1){
                currSeq.add(y);
            }
            else{ // Query type 2
                lastAns = currSeq.get(y % currSeq.size());
                System.out.println(lastAns);
            }   
        }
    }
}