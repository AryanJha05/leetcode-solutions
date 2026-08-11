class Solution {
    public int findLucky(int[] arr) {

        int mx = 0;
        for(int x : arr) mx = Math.max(mx, x);

        int[] freq = new int[mx + 1];
        for(int x : arr) freq[x]++;

        int lucky = -1;

        for(int i = 1; i < freq.length; i++) if(freq[i] == i) lucky = i;

        return lucky;
    }
}