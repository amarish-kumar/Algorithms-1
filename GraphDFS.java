/*


Unreachable Nodes

You have been given a graph consisting of N nodes and M edges.
The nodes in this graph are enumerated from 1 to N. 
The graph can consist of self-loops as well as multiple edges. 
This graph consists of a special node called the head node. 
You need to consider this and the entry point of this graph. 
You need to find and print the number of nodes that are unreachable from this head node.

Input Format

The first line consists of a 2 integers N and M denoting the number of nodes and edges in this graph. 
The next M lines consist of 2 integers a and b denoting an undirected edge between node a and b. 
The next line consists of a single integer x denoting the index of the head node.

*Output Format *:

You need to print a single integer denoting the number of nodes that are unreachable from the given head node.

Constraints

1=N=105
1=M=105
1=x=N

*/
import java.util.*;
class GraphDFS {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][]graph = new int[n][n];
        for(int i = 0;i<m;i++){
            int a = scanner.nextInt();
            a = a - 1;
            int b = scanner.nextInt();
            b = b - 1;
            graph[a][b] = graph[a][b] + 1;
            graph[b][a] = graph[a][b];
        }
        int head = scanner.nextInt();
        head = head - 1;
        Stack<Integer> stack = new Stack<>();
        stack.push(head);
        int []visited = new int[n];
        visited[head] = 1;
        while(stack.empty()!=true){
            int top = stack.pop();
            for(int i = 0;i<n;i++){
                if(graph[top][i] > 0 && visited[i]!=1){
                    stack.push(i);
                    visited[i] = 1;
                }
            }
        }
        int count = 0;
        for(int i = 0;i<n;i++){
            if(visited[i]==1){
                count = count + 1;
            }
        }
        System.out.println(n - count);
    }
}
