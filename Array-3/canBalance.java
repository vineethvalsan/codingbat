public boolean canBalance(int[] nums) {
  int len=nums.length;
  boolean res=false;
  int sum1=0;
  for(int i=0;i<len;i++){
    int sum2=0;
    sum1+=nums[i];
    for(int j=len-1;j>=0;j--){
      sum2+=nums[j];
      if(sum1==sum2 && Math.abs(j-i)==1){
        return true;
      }
    }
  }
  return false;
}
