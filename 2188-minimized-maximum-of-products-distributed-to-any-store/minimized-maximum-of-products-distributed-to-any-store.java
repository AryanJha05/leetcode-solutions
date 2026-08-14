class Solution {

    public boolean isValid(int[] q, int pdt, int n) {
        int stores = 0;

        for (int x : q) stores += Math.ceil((double)x / pdt);

        return stores <= n;
    }

    public int minimizedMaximum(int n, int[] quantities) {
        int m = quantities.length;

        int l = 1, r = 0;
        for (int q : quantities) r = Math.max(r, q);

        int res = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (isValid(quantities, mid, n)) {
                res = mid;
                r = mid - 1;
            } else l = mid + 1;
        }

        return res;
    }
}
