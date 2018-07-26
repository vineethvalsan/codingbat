public String missingChar(String str, int n) {
  char[] array = str.toCharArray();
  int index=0;
  String str1="";
  for (char ch : array) {
    if(index!=n){
      str1+=ch;
    }
    index++;
  }
  return str1;
}
