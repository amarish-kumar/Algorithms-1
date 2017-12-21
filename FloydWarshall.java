    /*
Indian National Olympiad in Informatics 2014

Nikhil’s slogan has won the contest conducted by Drongo Airlines and he is entitled to a free ticket between any two destinations served by the airline. All cities served by Drongo Airlines can be reached from each other by some sequence of connecting flights. Nikhil is allowed to take as many connecting flights as needed, but he must take the cheapest route between his chosen destinations.

Each direct flight between two cities has a fixed price. All pairs of cities connected by direct flights have flights in both directions and the price is the same in either direction. The price for a sequence of connecting flights is the sum of the prices of the direct flights along the route.

Nikhil has information about the cost of each direct flight. He would like to maximize the value of his prize, so he would like to choose a pair of cities on the network for which the cost of the cheapest route is as high as possible.	
   
   */
    import java.util.Scanner;
    public class FloydWarshall {
    	public static void main(String []args){
    		Scanner scanner = new Scanner(System.in);
    		int n = scanner.nextInt();
    		int f = scanner.nextInt();
    		int [][]graph = new int[n][n];
    		for(int i = 0;i<n;i++){
    			for(int j = 0;j<n;j++){
    				if(i==j)
    					graph[i][j] = 0;
    				else
    					graph[i][j] = 9999999;
    			}
    		}
    		for(int i = 0;i<f;i++){
    			int a = scanner.nextInt();
    			int b =scanner.nextInt();
    			a = a - 1;
    			b = b - 1;
    			graph[a][b] = scanner.nextInt();
    			graph[b][a] = graph[a][b];
    		}
    		int [][]newArray = new int[n][n];
    		for(int k = 0;k<n;k++){
    			for(int i = 0;i<n;i++){
    				for(int j = 0;j<n;j++){
    					newArray[i][j] = Math.min(graph[i][j],graph[i][k] + graph[k][j]);
    				}
    			}
    			for(int i = 0;i<n;i++){
    				for(int j = 0;j<n;j++){
    					graph[i][j] = newArray[i][j];
    				}
    			}
    		}
    		int min = -99999999;
    		for(int i = 0;i<n;i++){
    			for(int j = 0;j<n;j++){
    				if(min < graph[i][j])
    					min = graph[i][j];
    			}
    		}
    		System.out.println(min);
    		
    	}
    } 