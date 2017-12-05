/*

You have been given an array of size N consisting of integers. In addition you have been given an element M you need to
find and print the index of the last occurrence of this element M in the array if it exists in it, otherwise print -1.
Consider this array to be 1 indexed.

 */

import java.util.*;
class LinearSearch {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int [] array = new int[n];
        for(int i = 0;i<n;i++){
            array[i] = s.nextInt();
        }
        int z = -2;
        for(int i = 0;i<n;i++){
            if(array[i]==m){
                z = i;
            }
        }
        System.out.println(z+1);

    }
}
