class Solution {
    public String longestCommonPrefix(String[] strs) {

        // Edge case: if the input array is null or empty, return empty string
        if (strs == null || strs.length == 0) return "";

        // Assume the first string as the initial prefix
        // We’ll keep shortening this until it fits all strings
        String prefix = strs[0];

        // Loop through all strings from the second one onward
        for (int i = 1; i < strs.length; i++) {

            // Check if the current string starts with the prefix
            // indexOf(prefix) == 0 means the prefix is at the beginning
            // If not, keep shortening the prefix from the end
            while (strs[i].indexOf(prefix) != 0) {

                // Remove the last character from prefix
                // Example: if prefix = "flower" → becomes "flowe" → "flow" → "flo" → ...
                prefix = prefix.substring(0, prefix.length() - 1);

                // Optional safety: stop if prefix becomes empty
                if (prefix.isEmpty()) return "";
            }
        }

        // When loop ends, the remaining prefix is the longest common prefix
        return prefix;
    }
}
