package trialProj;
import java.util.*;
import java.io.*;

public class BFSGraph {
	
	private int V; //number of vertices
	private LinkedList<Integer> adj[] ; //adjacency list
	
	BFSGraph(int v){
		V = v;
		adj  = new LinkedList[v];
		for(int i =0 ; i < v ; ++i) {
			adj[i] = new LinkedList();
		}
	}
	
	void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	void BFS(int s) {
		boolean visited[] = new boolean[V];
		//create a queue
		LinkedList<Integer> queue = new LinkedList<Integer>();
		//mark the current node as visited
		visited[s] = true;
		queue.add(s);
		
		while(queue.size() != 0) {
        //dequque vertex from queue and print
			s = queue.poll();
			System.out.print(s + " ");
			//get all adjacent vertices of the dequeued vertex s
			// if adjacent not visited, then mark as visited and enqueue it
			Iterator<Integer> i = adj[s].listIterator();
			while(i.hasNext()) {
			int  n = i.next();
			if(!visited[n]) {
				visited[n] = true;
						queue.add(n);
			}
			}
			}
	}
	
	public static void main(String args[]) {
		BFSGraph g = new BFSGraph(4);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,2);
		g.addEdge(2,0);
		g.addEdge(2,3);
		g.addEdge(3,3);
		
		System.out.println("Breadth first traversal form vertex 2 ");
		
		g.BFS(2);
		
	}
}
