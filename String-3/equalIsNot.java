public boolean equalIsNot(String str) {
  String newSTR = str.replace("is", ""); 
  String newSTR1 = str.replace("not", ""); 
  int is = (str.length()-newSTR.length())/2;
  int not = (str.length()-newSTR1.length())/3;
  return is==not;
  
}
