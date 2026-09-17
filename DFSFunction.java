import java.util.ArrayList;
public class DFSFunction {
    public void dfs(int node,ArrayList<Integer>[] adj,int vis[])
    {
        vis[node]=1;            //if adjacency matrix is given
        for(int x:adj[node])    /*for(int i=0;i<n;i++)  if(vis[node][i]==0)......*/
        {                        
            if(vis[x]!=1)
            {
                dfs(x,adj,vis);
            }
        }
    }
    
}
