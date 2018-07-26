public boolean hasTeen(int a, int b, int c) {
  int count=0;
  if(a>=13&&a<=19){
    count++;
  }
  if(b>=13&&b<=19){
    count++;
  }
  if(c>=13&&c<=19){
    count++;
  }
  return count>=1?true:false;
}
