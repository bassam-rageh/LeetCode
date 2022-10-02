class Solution {
    public int romanToInt(String s) {
      int x = 0;
      for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)=='I'){
          if(i<s.length()-1 && (s.charAt(i+1)=='V'||s.charAt(i+1)=='X')){
            x-=1;
          }else{
            x+=1;
          }
        }else if(s.charAt(i)=='V'){
          x+=5;
        }else if(s.charAt(i)=='X'){
          if(i<s.length()-1 && (s.charAt(i+1)=='L'||s.charAt(i+1)=='C')){
            x-=10;
          }else{
            x+=10;
          }
        }else if(s.charAt(i)=='L'){
          x+=50;
        }else if(s.charAt(i)=='C'){
          if(i<s.length()-1 && (s.charAt(i+1)=='D'||s.charAt(i+1)=='M')){
            x-=100;
          }else{
            x+=100;
          }
        }else if(s.charAt(i)=='D'){
          x+=500;
        }else if(s.charAt(i)=='M'){
          x+=1000;
        }
      }
      return x;
    }
}