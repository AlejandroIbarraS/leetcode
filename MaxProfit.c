class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int min=prices[0], may=prices[0];
        int profit, profitMay;
        int iMin=0, iMay=0;
        profitMay=may-min;
        for(int i=1; i<prices.size();i++){
            if(prices[i]<min){
                min=prices[i];
                iMin=i;
            }
            if(prices[i]>may || iMin>iMay){
                may=prices[i];
                iMay=i;
            }
            profit=may-min;
            if(profitMay < profit)
                profitMay=profit;
        }
        return profitMay;
    }
    
};
