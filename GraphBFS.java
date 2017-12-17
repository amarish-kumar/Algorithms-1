/*

Level Nodes

You have been given a Tree consisting of N nodes. 
A tree is a fully-connected graph consisting of N nodes and N-1 edges. 
The nodes in this tree are indexed from 1 to N. 
Consider node indexed 1 to be the root node of this tree. 
The root node lies at level one in the tree. 
You shall be given the tree and a single integer x . 
You need to find out the number of nodes lying on level x.

Input Format

The first line consists of a single integer N denoting the number of nodes in the tree. 
Each of the next n-1 lines consists of 2 integers a and b denoting an undirected edge between node a and node b. 
The next line consists of a single integer x.

Output Format

You need to print a single integers denoting the number of nodes on level x.

Constraints

1=N=105
1=a,b=N

Note
It is guaranteed that atleast one node shall lie on level x

*/
import java.util.*;
class GraphBFS {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][]graph = new int[n][n];
        for(int i = 0;i<n-1;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            a = a - 1;
            b = b - 1;
            graph[a][b] = graph[b][a] =  1;
        }
        int x = scanner.nextInt();
        Queue<Integer> queue= new LinkedList<>();
        queue.add(0);
        queue.add(-1);
        int []visited = new int[n];
        visited[0] = 1;
        int count = 0;
        int prev = 0;
        while(queue.isEmpty()!=true && x!=0){
            int top = queue.remove();
            if(top!=-1){
                count = count + 1;
                for(int i = 0;i<n;i++){
                    if(graph[top][i]==1 && visited[i]==0){
                        queue.add(i);
                        visited[i] = 1;
                    }
                }
            }else{
                x--;
                prev = count;
                count = 0;
                queue.add(-1);
            }
        }
        System.out.println(prev);
    }
}
