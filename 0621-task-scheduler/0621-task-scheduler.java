class Solution {
    public int leastInterval(char[] tasks, int n) {
        

        //counting the number of tasks 
        int[] count = new int[26];

        for(char task : tasks) {
            count[task - 'A']++;
        }
        int maxf = Arrays.stream(count).max().getAsInt();
        int maxCount = 0;
        for(int i : count) {
            if(i == maxf) {
                maxCount++;
            }
        }
        int time = (maxf - 1) * (n + 1) + maxCount;
        return Math.max(tasks.length, time);
    }
}