public int countX(String str) {
  int len=str.length();
  int count=0;
  if(len==0){
    return 0;
  }
  else if(str.equals("x")){
    return 1;
  }else if(len==1){
    return 0;
  }
  String last=str.substring(len-2,len-1);
  if(last.equals("x")){
    count++;
  }
  str=str.substring(0,len-1);
  return count+countX(str);
}
