public String front3(String str) {
  String a=str.length()>3?str.substring(0,3):str;
  return a+a+a;
}
