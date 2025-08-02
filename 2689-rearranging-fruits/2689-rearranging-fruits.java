
class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        long res = 0;
        TreeMap<Integer, Integer> b1 = new TreeMap<>();
        TreeMap<Integer, Integer> b2 = new TreeMap<>();

        for (int i : basket1)
            b1.put(i, b1.getOrDefault(i, 0) + 1);
        for (int i : basket2)
            b2.put(i, b2.getOrDefault(i, 0) + 1);

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        for (Map.Entry<Integer, Integer> m : b1.entrySet()) {
            int key = m.getKey();
            int val1 = m.getValue();
            int val2 = b2.getOrDefault(key, 0);
            int total = val1 + val2;

            if (total % 2 == 1)
                return -1;

            int half = total / 2;
            if (val1 > half) {
                for (int i = 0; i < val1 - half; i++)
                    l1.add(key);
            } else if (val2 > half) {
                for (int i = 0; i < val2 - half; i++)
                    l2.add(key);
            }

            b2.remove(key);
        }

        for (Map.Entry<Integer, Integer> m : b2.entrySet()) {
            int val = m.getValue();
            if (val % 2 == 1)
                return -1;
            for (int i = 0; i < val / 2; i++)
                l2.add(m.getKey());
        }

        if (l1.size() != l2.size())
            return -1;

        Collections.sort(l1);
        Collections.sort(l2, Collections.reverseOrder());

        int globalMin = Math.min(Arrays.stream(basket1).min().getAsInt(),
                Arrays.stream(basket2).min().getAsInt());

        for (int i = 0; i < l1.size(); i++) {
            res += Math.min(2 * globalMin, Math.min(l1.get(i), l2.get(i)));
        }

        return res;
    }
}