public String changeXY(String str) {
  String res = "";
  
  if(str.length()<1){
    return str;
    
  }else {
    res+=str.charAt(0)=='x'?'y':str.charAt(0);
  }
  return res+changeXY(str.substring(1));
}
