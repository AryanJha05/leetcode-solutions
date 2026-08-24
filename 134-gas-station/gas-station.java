class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int t = 0, tank = 0, st = 0;

        for(int i = 0; i < gas.length; i++){

            int diff = gas[i] - cost[i];

            t += diff;
            tank += diff;
            
            if(tank < 0){
                st = i + 1;
                tank = 0;
            }
        }

        if(t < 0) return -1;

        return st;
    }
}