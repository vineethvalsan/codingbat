public String startOz(String str) {
  char arr[]=str.toCharArray();
  String res="";
  if(arr.length>0){
    if(arr[0]=='o'){
    res+=arr[0];
    }
    if(arr.length>=2 && arr[1]=='z'){
        res+=arr[1];
    }
    if(res=="oz"){
      res="oz";
    }
  }
  
  return res;
}
