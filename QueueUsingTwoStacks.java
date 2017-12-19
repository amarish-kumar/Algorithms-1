/*

In this challenge, you must first implement a queue using two stacks. Then process queries, where each query is one of the following 3 types:

    1 x: Enqueue element into the end of the queue.
    2: Dequeue the element at the front of the queue.
    3: Print the element at the front of the queue.


*/
import java.io.*;
import java.util.*;

public class QueueUsingTwoStacks{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        Stack <Integer>stackOne = new Stack<Integer>();
        Stack <Integer>stackTwo = new Stack<Integer>();    
        int top = 0;
        boolean flag = true;
        for(int i = 0;i<q;i++){
            int a;
            a = scanner.nextInt();
            if(a==1){
                int ele = scanner.nextInt();
                stackOne.push(ele);
            }
            else if(a==2){
                if(stackTwo.empty()==true){
                    while(stackOne.empty()==false)
                        stackTwo.push(stackOne.pop());
                }
                stackTwo.pop();
            }
            else if(a==3){
                if(stackTwo.empty()==true){
                    while(stackOne.empty()==false)
                        stackTwo.push(stackOne.pop());
                    
                }
                System.out.println(stackTwo.peek());
            }
        }
    }
}