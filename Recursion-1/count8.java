public int count8(int n) {
  int rem=n%10;
  int count=0;
  if(n/10==0){
    return n%10==8?1:0;
  }else{
    if(rem==8){
      count++;
      if((n/10)%10==8){
        count++;
      }
    }
  }
  n=n/10;
  return count+count8(n);
}
