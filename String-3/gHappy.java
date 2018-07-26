public boolean gHappy(String str) {
 char ch[]=str.toCharArray();
 boolean ret=false;
 int len=str.length();
 if(len==0){
   return true;
 }
 for(int i=0;i<ch.length;i++){
   if(ch[i]=='g'){
     if(i>0 && i<len-1){
       if(ch[i]==ch[i+1]||ch[i]==ch[i-1]){
         ret=true;
       }else{
         return false;
       }
     }else if(len==1&&i==0){
       return false;
     }else if(len>1&&i==0){
       if(ch[i+1]==ch[i]){
         ret=true;
       }else{
         return false;
       }
     }else if(i==len-1){
       if(ch[i-1]==ch[i]){
         ret=true;
       }else{
         return false;
       }
     }else{
       return false;
     }
   }
 }
 return ret;
}
