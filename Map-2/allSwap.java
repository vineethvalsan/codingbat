public String[] allSwap(String[] strings) {
  String res="";
  String []str=new String[strings.length];
  Map<String,Integer>map=new HashMap<String,Integer>();
  for(int i=0;i<strings.length;i++){
    String first = strings[i].substring(0,1);
    if(map.containsKey(first)){
      res=strings[i];
      str[i]=str[map.get(first)];
      str[map.get(first)]=res;
      map.remove(first);
    }else{
      map.put(first,i);
      str[i]=strings[i];
    }
  }
  return str;
}
