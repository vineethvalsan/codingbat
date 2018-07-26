public int count7(int n) {
  int count=0;
  if(n/10==0){
    if(n%10==7){
      return 1;
    }else{
      return 0;
    }
  }
  if(n%10==7){
    count++;
  }
  n=n/10;
  return count+count7(n);
}
