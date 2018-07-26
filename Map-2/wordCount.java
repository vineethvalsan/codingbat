public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer>map=new HashMap<String,Integer>();
  int count=0;
  for(String s:strings){
    if(!map.containsKey(s)){
      map.put(s,1);
    }else{
      count=map.get(s);
      map.put(s,count+1);
    }
  }
  return map;
}
