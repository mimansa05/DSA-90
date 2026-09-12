1. if in question String[] students={"Rahul 80", "Aman 75", "Priya 92"} is given
then to extract only marks we do:

int marks[]=new int[students.length];
for(int i=0;i<students.length;i++)
{
    String parts[]=students[i].split(" ");
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

5. loop for each string
for(char c: s.toCharArray())

6. filling array
Arrays.fill(arr,0);

7. Sorting array
Arrays.sort(arr);

8. Copy an array
int copy[]=Arrays.copyOf(arr,arr.length);

9. Binary Search
Arrays.binarySearch(arr,target);

10. Convert char[] to string
String s= new String(arr);

11. Check
s.contains("abc");
s.startsWith("a");

12. Split
String arr[]=s.split(" ");

13. String Builder
StringBuilder sb = new StringBuilder();
sb.append(1);
sb.charAt(i);
sb.setCharAt(i,'x'); ----> change character
sb.deleteCharAt(i); ------>delete
sb.reverse();
sb.length();
String s= sb.toString();

14. Character
Character.isLetter(c);
Character.isDigit(c);

15. ASCII
int c=c-'a';
char c=(char)('a'+x)---> reverse

16. ArrayList
ArrayList<Integer> arr=new ArrayList<>();
arr.add(10);
arr.get(i);
arr.set(i,20);
arr.remove(i);
list.remove(Integer.valueOf(10));
arr.size();
arr.contains(x);
Collections.sort(arr);
Collections.reverse(arr);
Integer n[]=arr.toArray(new Integer[0]);

17. HashSet
HashSet<Integer> set= new HashSet<>():
set.add(x);
set.contains(x);
set.remove(x);
set.size();
loop---> for(int x: set)
{

}

18. Stack/Queue
stack.push(x);
stack.pop();
stack.peek();
stack.size();
stack.isEmpty();
Queue<Integer> q = new LinkedList<>();
q.offer(x);
q.poll();
q.peek();
q.isEmpty();

19. Deque---> Imp for sliding window concept
Deque<Integer> dq = new ArrayDeque<>();
dq.addFirst(x);
dq.addLast(x);

dq.removeFirst();
dq.removeLast();

dq.peekFirst();
dq.peekLast();

20. Pair
Queue<int[]> q=new LinkedList<>();
q.offer(new int[]{row,col});
int cur[]=q.poll();
int row=curr[0];
int col=cur[1];
List<List<Integer>> adj = new ArrayList<>();
result.add(new ArrayList<>());
result.get(i).add(x);

21. Collections sort
Collections.sort(list,Collection.reverseOrder());

22. Comparator
Custom sorting---> Arrays.sort(arr,(a,b)->a-b);
descending-----> Arrays.sort(arr,(a,b)->b-a);
Objects/list----> list.sort((a,b)->a-b);

23. Frequency array of lowercase alphabets
int[] freq = new int[26];

for(char c : s.toCharArray())
{
    freq[c - 'a']++;
}

24. Array<->list
Integer[] arr = {1, 2, 3};
List<Integer> list = Arrays.asList(arr);

Integer[] arr = list.toArray(new Integer[0]);

25. return statement
return new int[]{a,b};

26. Prefix sum
int arr[]={2,6,3,4,7}
prefixsum[]={2,8,11,15,22}
how?
prefixsum[0]=arr[0];
for(int i=0;i<arr.length;i++)
{
    prefixsum[i]=prefix[i-1]+arr[i];
}

if range sum then:---> for this part first create a prefix array then iterate through it
if(left==0)
{
    sum=prefix[right];
}
else
{
    sum=prefix[r]-prefix[l-1];
}
