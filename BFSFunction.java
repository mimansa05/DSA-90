import java.util.*;
public class BFSFunction {
    public ArrayList<Integer> bfs(ArrayList<Integer>[] adj,int n)
    {
        ArrayList<Integer> bfs=new ArrayList<>();
        int vis[]=new int[n];
        Queue<Integer> q=new LinkedList<>();
        vis[0]=1;
        q.add(0);
        while(!q.isEmpty())
        {
            int node=q.poll();
            bfs.add(node);
            for(int x:adj[node])
            {
                if(vis[x]!=1)
                {
                    vis[x]=1;
                    q.add(x);
                }
            }
        }
        return bfs;
    }
    
}
