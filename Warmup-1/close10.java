public int close10(int a, int b) {
  int ret=0;
  int rema= Math.abs(10-a);
  int remb=Math.abs(10-b);
  if(rema==remb)return ret;
  else
  return rema>remb?b:a;
}
