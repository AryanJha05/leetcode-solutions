class Solution {

    public int convert(String date){

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int tDays = Integer.parseInt(date.substring(3,5));
        int months = Integer.parseInt(date.substring(0,2));

        for(int i = 0; i < months - 1; i++) tDays += days[i];

        return tDays;

    }

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {

        int a1 = convert(arriveAlice), a2 = convert(leaveAlice), b1 = convert(arriveBob), b2 = convert(leaveBob);

        int st = Math.max(a1, b1), ed = Math.min(a2, b2);

        return Math.max(0, ed - st + 1);
    }
}