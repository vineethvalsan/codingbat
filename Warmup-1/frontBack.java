public String frontBack(String str) {
  String s="";
  if(str.length()>0){
    char [] array=str.toCharArray();
    char temp = array[0];
    array[0]=array[array.length-1];
    array[array.length-1]=temp;
    
    for(char ch :array){
      s+=ch;
    }
  }
  return s;
}
