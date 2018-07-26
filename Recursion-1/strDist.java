public int strDist(String str, String sub) {
  int len=str.length();
  int firstIndex =0;
  int lastIndex=0;
  if(len==0){
    return 0;
  }else if(len==1&&str.equals(sub)){
    return 1;
  }else{
    firstIndex=str.indexOf(sub);
    lastIndex=str.lastIndexOf(sub);
    if(firstIndex!=-1)
    return lastIndex-firstIndex+sub.length();
    else{
      return 0;
    }
    
  }
}
