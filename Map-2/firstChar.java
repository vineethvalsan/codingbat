public Map<String, String> firstChar(String[] strings) {
  int count=0;
  String res="";
  Map<String,String>map=new HashMap<String,String>();
  for(String s:strings){
    String first=s.substring(0,1);
    if(!map.containsKey(first)){
      map.put(first,s);
    }else{
      res=map.get(first);
      map.put(first,res+s);
    }
  }
  return map;
}
