class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] Output=new int[n];
        int[] Perf=new int[n];
        int[] Suff=new int[n];
        Perf[0]=1;
        Suff[n-1]=1;
        for(int i=1;i<n;i++){
            Perf[i]=nums[i-1]*Perf[i-1];

        }
        for(int j=n-2;j>=0;j--){
            Suff[j]=nums[j+1]*Suff[j+1];
        }
        for(int i=0;i<n;i++){
            Output[i]=Perf[i]*Suff[i];
        }
        return Output;

        
    }
}  
