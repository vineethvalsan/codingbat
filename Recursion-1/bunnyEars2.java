public int bunnyEars2(int bunnies) {
  if(bunnies==0)return 0;
  int ear=0;
  if(bunnies%2==1)
  ear+=2;
  else 
  ear+=3;
  return ear+bunnyEars2(bunnies-1);
}
