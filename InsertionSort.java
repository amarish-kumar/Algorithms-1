/*

Insertion Sort
You have been given an A array consisting of N integers. 
All the elements in this array are guaranteed to be unique.
For each position i in the array A you need to find the position A[i] should be present in, if the array was a sorted array.
You need to find this for each i and print the resulting solution.

Input Format:

The first line contains a single integer N denoting the size of array A. 
The next line contains N space separated integers denoting the elements of array A.

Output Format:

Print N space separated integers on a single line , where the Ith integer denotes the position of A[i] if this array were sorted.

Constraints:

1=N=100

1=A[i]=100

*/

import java.util.Scanner;
class InsertionSort {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []array = new int[n];
        int []array2 = new int[n];
        for(int i = 0;i<n;i++){
            array[i] = scanner.nextInt();
            array2[i] = array[i];
        }
        for(int j = 0;j<n;j++){
            int k = j;
            int temp = array[j];
            while(k>0 && array[k-1] > temp){
                array[k] = array[k-1];
                k = k - 1;
            }
            array[k] = temp;
        }
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(array2[i]==array[j]){
                    array2[i] = j+1;
                }
            }
        }
        for(int z = 0;z < n;z++){
            System.out.print(array2[z]);
            System.out.print(" ");
        }
        System.out.println();
        /*
        for(int z = 0;z < n;z++){
            System.out.print(array[z]);
            System.out.print(" ");
        }
        System.out.println();
        */
    }
}
