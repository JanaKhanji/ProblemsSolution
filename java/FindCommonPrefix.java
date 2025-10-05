// https://leetcode.com/problems/longest-common-prefix/

class FindCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        boolean isCommon = true;
        int index = 0;
        String commonPrefix = "";
        while(isCommon && index < strs[0].length()) {
            commonPrefix = strs[0].substring(0, index + 1);

            for(String el: strs) {
                if (!el.startsWith(commonPrefix)) {
                    isCommon = false;
                    return commonPrefix.substring(0, commonPrefix.length() - 1);
                }
            }
            index++;

        }
        return commonPrefix;
    }     
}