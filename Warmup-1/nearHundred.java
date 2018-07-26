public boolean nearHundred(int n) {
  int a= Math.abs(100-n);
  int b=Math.abs(200-n);
  return a<=10||b<=10?true:false;
}
