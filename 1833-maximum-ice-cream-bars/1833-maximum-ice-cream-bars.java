class Solution {
    public int maxIceCream(int[] costs, int coins) {
         int max = 0;

        for (int cost : costs) {
            max = Math.max(max, cost);
        }

        int[] freq = new int[max + 1];

        for (int cost : costs) {
            freq[cost]++;
        }

        int ans = 0;

        for (int price = 1; price <= max; price++) {

            if (freq[price] == 0)
                continue;

            int buy = Math.min(freq[price], coins / price);

            ans += buy;
            coins -= buy * price;

            if (coins < price)
                continue;
        }

        return ans;
    }
}