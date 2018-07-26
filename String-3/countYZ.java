public int countYZ(String str) {
  String last=str.substring(str.length()-1);
  int count=0;
  char ch[]=str.toCharArray();
  for(int i=0;i<ch.length;i++){
    char c = Character.toLowerCase(ch[i]);
    if(i!=ch.length-1 && !Character.isLetter(ch[i+1]) &&(c=='y'||c=='z')){
      count++;
    }else if(i==ch.length-1 &&(c=='y'||c=='z')){
      count++;
    }
  }
  return count;
}
