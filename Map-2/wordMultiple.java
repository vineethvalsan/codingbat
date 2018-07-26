public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String,Integer>map=new HashMap<String,Integer>();
  Map<String,Boolean>map1=new HashMap<String,Boolean>();
  for(String s :strings){
    map.put(s,map.containsKey(s)?map.get(s)+1:1);
  }
  for(Map.Entry<String,Integer>entry:map.entrySet()){
    if(entry.getValue()>1){
      map1.put(entry.getKey(),true);
    }else{
      map1.put(entry.getKey(),false);
    }
  }
  return map1;
}
