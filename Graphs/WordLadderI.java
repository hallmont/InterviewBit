public class Solution {

	public int ladderLength(String start, String end, ArrayList<String> dictV ) {
        Set<String> reached = new HashSet<String>();
        reached.add(start);
        dictV.add(end);
        int distance = 1;
        while (!reached.contains(end)) {
            Set<String> toAdd = new HashSet<String>();
            for (String each : reached) {
                for (int i = 0; i < each.length(); i++) {
                    char[] chars = each.toCharArray();
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        chars[i] = ch;
                        String word = new String(chars);
                        if (dictV.contains(word)) {
                            toAdd.add(word);
                            dictV.remove(word);
                        }
                    }
                }
            }
            distance++;
            if (toAdd.size() == 0) return 0;
            reached = toAdd;
        }
        return distance;
    }
}
