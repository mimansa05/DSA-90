
class SRTF {
    public static void main(String[] args) {

        int[] at = {0, 1, 2, 3};
        int[] bt = {5, 3, 8, 2};

        int n = at.length;

        int[] rem = bt.clone();
        int[] ct = new int[n];
        int[] tat = new int[n];
        int[] wt = new int[n];

        int completed = 0;
        int time = 0;

        while (completed < n) {

            int idx = -1;
            int minRem = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {

                if (at[i] <= time && rem[i] > 0) {

                    if (rem[i] < minRem) {
                        minRem = rem[i];
                        idx = i;
                    }
                }
            }

            // CPU idle
            if (idx == -1) {
                time++;
                continue;
            }

            // Execute for 1 unit
            rem[idx]--;
            time++;

            // Process completed
            if (rem[idx] == 0) {
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