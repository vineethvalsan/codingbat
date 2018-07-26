public String endUp(String str) {
  int length = str.length();
  String res="";
  int index=0;
  char charr[]=str.toCharArray();
  if(length>=3){
    for(char c:charr){
      if(length-index<=3){
        res+=Character.toUpperCase(c);
      }else{
        res+=c;
      }
      index++;
    }
  }else{
    res=str.toUpperCase();
  }
  return res;
}
