package Day28;

import java.util.*;

public class GraphDFS{

    static void dfs(int node,boolean visited[],ArrayList<ArrayList<Integer>> graph){

        visited[node]=true;

        System.out.print(node+" ");

        for(int next:graph.get(node)){

            if(!visited[next]){

                dfs(next,visited,graph);

            }

        }

    }

    public static void main(String[] args){

        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

        for(int i=0;i<4;i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);

        boolean visited[]=new boolean[4];

        dfs(0,visited,graph);

    }
}