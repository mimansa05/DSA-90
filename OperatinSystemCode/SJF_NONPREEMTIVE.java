
class SJF_NONPREEMTIVE {
    public static void main(String[] args) {

        int[] at = {0, 1, 2, 3};
        int[] bt = {5, 3, 8, 2};

        int n = at.length;

        boolean[] done = new boolean[n];

        int[] ct = new int[n];
        int[] tat = new int[n];
        int[] wt = new int[n];

        int completed = 0;
        int time = 0;

        while (completed < n) {

            int idx = -1;
            int minBT = Integer.MAX_VALUE;

            // Find shortest job among arrived processes
            for (int i = 0; i < n; i++) {

                if (!done[i] && at[i] <= time) {

                    if (bt[i] < minBT) {
                        minBT = bt[i];
                        idx = i;
                    }
                }
            }

            // No process has arrived yet
            if (idx == -1) {
                time++;
                continue;
            }

            // Execute process completely
            time += bt[idx];

            ct[idx] = time;
            tat[idx] = ct[idx] - at[idx];
            wt[idx] = tat[idx] - bt[idx];

            done[idx] = true;
            completed++;
        }

        for (int i = 0; i < n; i++) {
            System.out.println("P" + i +
                    " CT=" + ct[i] +
                    " TAT=" + tat[i] +
                    " WT=" + wt[i]);
        }
    }
}