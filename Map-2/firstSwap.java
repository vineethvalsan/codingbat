public String[] firstSwap(String[] strings) {
  String res="";
  String []str=new String[strings.length];
  Map<String,Integer>map=new HashMap<String,Integer>();
  for(int i=0;i<strings.length;i++){
    String first = strings[i].substring(0,1);
    if(map.containsKey(first)&&map.get(first)!=-1){
      res=strings[i];
      str[i]=str[map.get(first)];
      str[map.get(first)]=res;
      map.put(first,-1);
    }else if(map.containsKey(first)){
      map.put(first,-1);
      str[i]=strings[i];
    }else{
      map.put(first,i);
      str[i]=strings[i];
    }
  }
  return str;
}
