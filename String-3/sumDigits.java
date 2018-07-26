public int sumDigits(String str) {
  char ch[]=str.toCharArray();
  int sum=0;
  for(int i=0;i<ch.length;i++){
    if(Character.isDigit(ch[i])){
      sum+=Integer.parseInt(Character.toString(ch[i]));
    }
  }
  return sum;
}
