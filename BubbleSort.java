/*

You have been given an array A of size N. You need to sort this array non-decreasing oder using bubble sort. 
However, you do not need to print the sorted array. 
You just need to print the number of swaps required to sort this array using bubble sort.

Input Format :

The first line consists of a single integer N
denoting size of the array. The next line contains N
space separated integers denoting the elements of the array.

Output Format Print the required answer in a single line

Constrains : 
1=N=100
1=a[i]=100

*/
import java.util.*;
class BubbleSort {
    public static void main(String args[] ) throws Exception {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []array = new int[n];
        for(int k = 0;k<n;k++){
            array[k] = scanner.nextInt();
        }
        int count = 0;
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    count = count + 1;
                }
            }
        }
        System.out.println(count);
    }
}
