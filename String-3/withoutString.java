public String withoutString(String base, String remove) {
  String sub="";
  String res="";
  do{
    String base1=base.toLowerCase();
    String remove1=remove.toLowerCase();
    int index = base1.indexOf(remove1);
    if(index>-1){
      sub+=base.substring(0,index);
      base = base.substring(index+remove.length());
    }else{
      sub+=base;
      base="";
    }
  }while(base.length()>0);
  return sub;
}
