class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        // Frequency map for the pattern
        Map<Character, Integer> m = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        // Build the frequency map of pattern 'p'
        for (char c : p.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        int i = 0, j = 0;
        int k = p.length();

        // 'count' tracks how many characters still need to be matched
        int count = m.size();

        // Slide the window over string s
        while (j < s.length()) {

            char ch = s.charAt(j);

            // If character exists in the pattern, reduce its frequency
            if (m.containsKey(ch)) {
                m.put(ch, m.get(ch) - 1);

                // When the freq becomes zero, this character is fully matched
                if (m.get(ch) == 0)
                    count--;
            }

            // Expand window until window size reaches size of pattern
            if (j - i + 1 < k) {
                j++;
            } 
            // When window size matches the pattern size
            else if (j - i + 1 == k) {

                // If all characters matched (count == 0), record starting index
                if (count == 0)
                    ans.add(i);

                // Now we will slide the window → remove the leftmost character
                char start = s.charAt(i);

                // If the character going out is part of the pattern
                if (m.containsKey(start)) {

                    // Restore its frequency because it's no longer in the window
                    m.put(start, m.get(start) + 1);

                    // If freq becomes 1, it means this character is now unmatched again
                    if (m.get(start) == 1)
                        count++;
                }

                // Slide the window
                i++;
                j++;
            }
        }

        return ans;
    }
}
