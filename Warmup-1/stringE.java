public boolean stringE(String str) {
  char ch[]=str.toCharArray();
  int count=0;
  for(char c:ch){
    if(c=='e'){
      count++;
    }
  }
  return count>=1 &&count<=3?true:false;
}
