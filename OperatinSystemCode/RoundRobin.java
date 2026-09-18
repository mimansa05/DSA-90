import java.util.*;

class RoundRobin {
    public static void main(String[] args) {

        int[] at = {0, 1, 2, 3};
        int[] bt = {5, 3, 8, 2};

        int quantum = 2;

        int n = at.length;

        int[] rem = bt.clone();
        int[] ct = new int[n];
        int[] tat = new int[n];
        int[] wt = new int[n];

        Queue<Integer> q = new LinkedList<>();

        boolean[] added = new boolean[n];

        int time = 0;
        int completed = 0;

        // Start with processes that arrive at 0
        for (int i = 0; i < n; i++) {
            if (at[i] <= time) {
                q.add(i);
                added[i] = true;
            }
        }

        while (completed < n) {

            // If queue empty, move time to next arrival
            if (q.isEmpty()) {

                time++;

                for (int i = 0; i < n; i++) {
                    if (!added[i] && at[i] <= time) {
                        q.add(i);
                        added[i] = true;
                    }
                }

                continue;
            }

            int idx = q.poll();

            int run = Math.min(quantum, rem[idx]);

            rem[idx] -= run;
            time += run;

            // Add newly arrived processes
            for (int i = 0; i < n; i++) {
                if (!added[i] && at[i] <= time) {
                    q.add(i);
                    added[i] = true;
                }
            }

            if (rem[idx] > 0) {
                q.add(idx);
            } else {
                ct[idx] = time;

                tat[idx] = ct[idx] - at[idx];
                wt[idx] = tat[idx] - bt[idx];

                completed++;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println("P" + i +
                    " CT=" + ct[i] +
                    " TAT=" + tat[i] +
                    " WT=" + wt[i]);
        }
    }
}