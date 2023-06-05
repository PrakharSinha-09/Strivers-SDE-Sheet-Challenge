//https://www.codingninjas.com/codestudio/problems/maximum-subarray-sum_8230694?challengeSlug=striver-sde-challenge&leftPanelTab=0
//Solved Using Kadane's algo.

public class maxSubarraySum {
    public static long maxSubarraySum(int[] arr, int n) {
        long  maxi=Long.MIN_VALUE;
        int sum=0;

        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(sum>maxi){
                maxi=sum;
            }

            if(sum<0){
                sum=0;
            }
        }

        //Considering the sum of the empty subarray
        if (maxi < 0) maxi = 0;
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr={1,2,7,-4,3,2,-10,9,1};
        int n=arr.length;
        long ans=maxSubarraySum(arr, n);
        System.out.println(ans);
    }
}
