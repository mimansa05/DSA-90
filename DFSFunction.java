import java.util.ArrayList;
public class DFSFunction {
    public void dfs(int node,ArrayList<Integer>[] adj,int vis[])
    {
        vis[node]=1;
        for(int x:adj[node])
        {
            if(vis[x]!=1)
            {
                dfs(x,adj,vis);
            }
        }
    }
    
}
