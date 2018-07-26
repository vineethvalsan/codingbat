public int sumDigits(int n) {
  if(n/10==0)
    return n;
  int rem=n%10;
  n=n/10;
  return rem+sumDigits(n);
  
}
