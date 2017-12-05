/*
You have been given an array A consisting of N integers. All the elements in this array A are unique.
You have to answer some queries based on the elements of this array. Each query will consist of a single integer x.
You need to print the rank based position of this element in this array considering that the array is 1 indexed.
The rank based position of an element in an array is its position in the array when the array has been sorted in ascending order.

Note: It is guaranteed that all the elements in this array are unique and for each x
belonging to a query, value 'x' shall exist in the array
 */
import java.util.*;
class BinarySearch {

    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []array = new int[n];
        for(int i = 0;i<n;i++){
            array[i] = s.nextInt();
        }
        int m = s.nextInt();
        int []query = new int[m];
        for(int j = 0;j<m;j++){
            query[j] = s.nextInt();
        }
        Arrays.sort(array);
        BinarySearch binarySearch = new BinarySearch();
        for(int j = 0;j<m;j++){
            System.out.println(binarySearch.BinarySearch(array,query[j])+1);
        }
    }

    public int BinarySearch(int []array,int key){
        int low = 0;
        int high = array.length-1;
        int mid = (int)((low + high)/2);
        while(low <= high){
            if(array[mid] == key){
                return mid;
            }
            else if(array[mid] > key){
                high = mid - 1;
            }
            else if(array[mid] < key){
                low = mid  + 1;
            }
            mid = (int)((low + high)/2);
        }
        return -1;
    }
}
