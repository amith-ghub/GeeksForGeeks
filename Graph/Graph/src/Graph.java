import java.util.ArrayList;
/**
 * http://www.geeksforgeeks.org/depth-first-traversal-for-a-graph/
 * 
 */

/**
 * @author rakshith
 *
 */
public class Graph {
	
	private int vertices;
	private int edges;
	private ArrayList<ArrayList<Integer>> adjList;
	
	Graph(int vertices, int edges){
		this.vertices = vertices;
		this.edges = edges;
		adjList = new ArrayList<>();
		for(int i=0; i<vertices; i++){
			adjList.set(i, new ArrayList<Integer>()) ;
		}
	}
	
	public void addEdge(int v1, int v2){
		this.getAdjList().get(v1).add(v2);
		this.edges++;
	}
	
	public void addSymmetricEdge(int v1, int v2){
		this.getAdjList().get(v1).add(v2);
		this.getAdjList().get(v2).add(v1);
		this.edges += 2;
	}

	public ArrayList<ArrayList<Integer>> getAdjList() {
		return adjList;
	}

	public int getVertices() {
		return vertices;
	}

	public void setVertices(int vertices) {
		this.vertices = vertices;
	}

	public int getEdges() {
		return edges;
	}

	public void setEdges(int edges) {
		this.edges = edges;
	}

	public void DFS(int startVertex) {
		boolean[] visited = new boolean[this.vertices];
		
	}
	
	
}
