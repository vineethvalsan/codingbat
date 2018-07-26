public int countTriple(String str) {
  char ch[]=str.toCharArray();
  int count=0;
  int len=ch.length;
  for(int i=0;i<ch.length;i++){
    if(i<len-2){
      if(ch[i]==ch[i+1]&&ch[i]==ch[i+2]){
        count++;
      }
    }
  }
  return count;
}
