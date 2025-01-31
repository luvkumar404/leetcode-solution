public class Stock{

    public static int maxProfit(int prices[]) {
        int n=prices.length;
        int buyprice=prices[0];
        int profit=0;

        for(int i=0;i<n;i++){
            if(buyprice > prices[i]){
                buyprice=prices[i];
            }
            profit=Math.max(profit, prices[i]-buyprice);
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.print("Maximum Profit: "+ maxProfit(prices));
    }
}