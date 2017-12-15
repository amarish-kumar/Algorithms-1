/*


Print Array in Reverse

Given the size and the elements of array A, print all the elements in reverse order.

Input:
First line of input contains, N - size of the array.
Following N lines, each contains one integer, i{th} element of the array i.e. A[i].

Output:
Print all the elements of the array in reverse order, each element in a new line.

Constraints:

1?N?100
0?A[i]?1000

*/
import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int []array = new int[n];
    for(int i = 0;i<n;i++){
        array[i] = scanner.nextInt();        
    }
    for(int i = n-1;i>=0;i--){
        System.out.println(array[i]);        
    }
    }
}
