class Solution {
    public int smallestNumber(int n, int t) {
        
        while(true){

            int num = n;
            int pdt = 1;
            
            while(num > 0){
                pdt *= num % 10;
                num /= 10;
            }

            if(pdt % t == 0) return n;

            n++;
        }
    }
}