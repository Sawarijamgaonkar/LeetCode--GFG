class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int[] prefVow = new int[words.length + 1];

        for (int i = 0; i < words.length; i++) {
            char first = words[i].charAt(0);
            char last = words[i].charAt(words[i].length() - 1);
            if (isVowel(first, vowels) && isVowel(last, vowels)) {
                prefVow[i + 1] = prefVow[i] + 1;
            } else {
                prefVow[i + 1] = prefVow[i];
            }
        }

        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            res[i] = prefVow[r + 1] - prefVow[l];
        }

        return res;
    }

    private boolean isVowel(char c, char[] vowels) {
        for (char vowel : vowels) {
            if (c == vowel) {
                return true;
            }
        }
        return false;
    }
} 