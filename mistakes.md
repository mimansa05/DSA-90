1. if in question String[] students={"Rahul 80", "Aman 75", "Priya 92"} is given
then to extract onky marks we do:

int marks[]=new int[students.length];
for(int i=0;i<students.length;i++)
{
    String parts[]=arr[i].split(" ");
    marks[i]=Integer.parseInt(parts[1]);
}

2. HashMap syntax
HashMap<Integer, Integer> hash=new HashMap<>();

hash.put("Mimansa", 90);

hash.get(key); ---> to take out value from key--> return one integer

map.containsKey(key); ----> to check if key exist or not

map.containsValue(value); ----> to check if value exist or not

frequency counting
for(char c:s.toCharArray())
{
    hash.put(c,getOrDefaukt(c,0)+1);
}

loop for keys
for(Integer key:hash.keySet())
{
    Sopln(key);
}

loop for values
for(Integer value:map.values())
{
    Sopln(value);
}

loop on key+value
for(Map.Entry<String,Integer> it:hash.entrySet())
{
    String key=entry.getKey();
    int value=entry.getValue();

    Sopln(key+" " +value);
}

hash.remove(key);
hash.size();
hash.clear();


3. List<Integer>[] adj
here adj is an array and each array contains a list

hoe to loop thorugh it?
for(int it:adj[node])

4. List<List<Integer>> adj;
here adj is a list which is storing a list

loop:
for(int it:adj.get(node))
