public int[] squareUp(int n) {
int[] arr=new int[n*n];
for(int z=1;z<=n;z++){
  for(int j=1,i=n*z-1;j<=z;j++){
    arr[i--]=j;
  }
}
return arr;
}
