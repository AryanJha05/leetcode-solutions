class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        
        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i < knowledge.size(); i++) map.put(knowledge.get(i).get(0), knowledge.get(i).get(1));


        StringBuilder res = new StringBuilder();

        for(int i = 0; i < s.length(); i++){

            if(s.charAt(i) == '('){

                StringBuilder temp = new StringBuilder();

                i++;
                while(s.charAt(i) != ')') temp.append(s.charAt(i++));

                res.append(map.getOrDefault(temp.toString(), "?"));
            }else res.append(s.charAt(i));
        }


        return res.toString();
    }
}