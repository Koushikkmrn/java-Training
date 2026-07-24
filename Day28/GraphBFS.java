package Day28;

import java.util.*;

public class GraphBFS{

    public static void main(String[] args){

        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();

        for(int i=0;i<4;i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);

        Queue<Integer> q=new LinkedList<>();

        boolean visited[]=new boolean[4];

        q.add(0);

        visited[0]=true;

        while(!q.isEmpty()){

            int node=q.poll();

            System.out.print(node+" ");

            for(int next:graph.get(node)){

                if(!visited[next]){

                    visited[next]=true;

                    q.add(next);

                }

            }

        }

    }

}