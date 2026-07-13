class Solution {
    public List<Integer> sequentialDigits(int low, int high) {

        ArrayList<Integer> res = new ArrayList<>();

        String s = "123456789";

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j < s.length(); j++) {

                int num = Integer.parseInt(s.substring(i, j + 1));

                if (low <= num && num <= high) res.add(num);
            }
        }

        Collections.sort(res);

        return res;
    }
}