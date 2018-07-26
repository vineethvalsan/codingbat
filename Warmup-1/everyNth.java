public String everyNth(String str, int n) {
  int length=str.length();
  char charr[]=str.toCharArray();
  int index=0;
  String res="";
  for(char c:charr){
    if(index%n==0){
      res+=c;
    }
    index++;
  }
  return res;
}
