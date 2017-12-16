/*

Micro and Queue

Micro just purchased a queue and wants to perform N operations on the queue. The operations are of following type:

E x : Enqueue x in the queue and print the new size of the queue.
D : Dequeue from the queue and print the element that is deleted and the new size of the queue separated by space. If there is no element in the queue then print -1 in place of deleted element.
Since Micro is new with queue data structure, he need your help.

Input:
First line consists of a single integer denoting N

Each of the following N lines contain one of the operation as described above.

Output:
For each enqueue operation print the new size of the queue. And for each dequeue operation print two integers, deleted element (-1 , if queue is empty) and the new size of the queue.

Constraints:
1=N=100 
1=x=100

*/
import java.util.Scanner;
class QueueUsingArrays {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []queue = new int[n];
        int front = -1;
        int rear = -1;
        for(int i = 0;i<n;i++){
            char op = scanner.next().charAt(0);
            int num = 0;
            if(op=='E'){
                num = scanner.nextInt();
                queue[++front] = num;
                System.out.println(front - rear);
            }
            else if(op=='D'){
                if(front!=rear){
                    System.out.print(queue[++rear]);
                    System.out.print(" ");
                    System.out.println(front - rear);
                }
                else{
                    System.out.print(-1);
                    System.out.print(" ");
                    System.out.println(front - rear);
                    rear = front = -1;
                }
            }
        }
    }
}
