public class Solution {
    public int addDigits(int num) {
        int temp=0,sum=0;
        
        while(num>0)
        {
            sum+=num%10;
            num/=10;
            if(sum>9)
            {
            sum%=10;
            sum++;
            }
            
        }
        return sum;
    }
}
