public int maxSpan(int[] nums) {
  int max[]=new int[nums.length];
  int maxi=0;
  for(int i=0;i<nums.length;i++){
    for(int j=0;j<nums.length;j++){
      if(nums[i]==nums[j]){
        max[i]=j-i+1;
      }
    }
  }
  if(nums.length>0){
    maxi=max[0];
    for(int z=0;z<max.length;z++){
      if(maxi<max[z]){
        maxi=max[z];
      }
    }
  }
  
  return maxi;
}
