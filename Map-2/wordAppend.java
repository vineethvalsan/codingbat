public String wordAppend(String[] strings) {
  String res="";
  int count=0;
  Map<String,Integer>map=new HashMap<String,Integer>();
  for(int i=0;i<strings.length;i++){
    if(!map.containsKey(strings[i])){
      map.put(strings[i],1);
    }else{
      count=map.get(strings[i]);
      map.put(strings[i],count+1);
      if((count+1)%2==0){
        res+=strings[i];
      }
    }
    
  }
  return res;
}
