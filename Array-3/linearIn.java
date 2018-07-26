public boolean linearIn(int[] outer, int[] inner) {
  int i=0;
  int j=0;
  for (i=0;i<inner.length;i++){
    for (j=0;j<outer.length;j++)
        if(inner[i]==outer[j]){
          break;
        }
    if (j==outer.length){
      return false;
    }
          
  }
  return true;
}
