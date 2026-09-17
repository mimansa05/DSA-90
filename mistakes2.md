1. for graphs
(a). if you want to store a list in the array 
adj[1] → [2, 3]
adj[2] → [1, 4]
adj[3] → [1]
adj[4] → [2]
adj[5] → []

code:
int n----> number of nodes
int m----> number of edges
ArrayList<Integer>[] adj=new ArrayList[n+1];
for(i=0;i<n;i++)
{
    adj[i]=new ArrayList<>();
}
for(int i=0;i<m;i++)
{
    int u=sc.nextInt();
    int v=sc.nextInt();
    adj[u].add[v];
    adj[v].add[u];// this will not come for directed graph
}

2. If you want to store in adjacency matrix form
int adj[][]=new int[n+1][m+1];
for(int i=0;i<m;i++)
{
    int u=sc.nextInt();
    int v=sc.nextInt();
    adj[u][v]=1;
    adj[v][u]=1;
}

3. For checking connected components always use visited array