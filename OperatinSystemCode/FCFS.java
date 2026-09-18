
class FCFS {
    public static void main(String[] args) {

        int[] at = {0, 1, 2, 3};
        int[] bt = {5, 3, 8, 2};

        int n = at.length;

        int[] ct = new int[n];
        int[] tat = new int[n];
        int[] wt = new int[n];

        int time = 0;

        for (int i = 0; i < n; i++) {

            // CPU idle hai
            if (time < at[i]) {
                time = at[i];
            }

            time = time + bt[i];

            ct[i] = time;
            tat[i] = ct[i] - at[i];
            wt[i] = tat[i] - bt[i];
        }

        System.out.println("Waiting Time:");

        for (int i = 0; i < n; i++) {
            System.out.println("P" + i + " = " + wt[i]);
        }
    }
}