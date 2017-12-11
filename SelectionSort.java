/*

Selection Sort

Consider an Array a of size N
Iterate from 1 to N
In ith iteration select the ith minimum and swap it with a[i]

You are given an array a, size of the array N and an integer x. 
Follow the above algorithm and print the state of the array after x iterations have been performed.

Input Format

The first line contains two integer N and x denoting the size of the array and the steps of the above algorithm to be performed respectively. 
The next line contains N space separated integers denoting the elements of the array.

Output Format

Print N space separated integers denoting the state of the array after x steps

Constraints

1=N=100

1=a[i]=100

1=x=N


*/

import java.util.Scanner;
class SelectionSort {
    public static void main(String args[] ) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int []array = new int[n];
        for(int i = 0;i<n;i++){
            array[i] = scanner.nextInt();
        }
        for(int i = 0;i<n-1;i++){
            if(x==0){
                break;
            }
            int min = i;
            for(int j = i+1;j<n;j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
            x = x - 1;
        }
        for(int i = 0;i<n;i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
