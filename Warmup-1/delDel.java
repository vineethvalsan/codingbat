public String delDel(String str) {
  char []ch=str.toCharArray();
  String ret="";
  int index=0;
  if(str.indexOf("del")==1){
    for(char c: ch){
      if(index<1||index>3){
        ret+=c;
      }
      index++;
    }
    
  }else{
    ret=str;
  }
  return ret;
}
