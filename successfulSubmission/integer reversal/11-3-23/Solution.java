import java.lang.Math ;
import java.lang.* ;
class Solution {
    // creating a substring containing - at the start
    /*public String substring(String s ){
        char [] c = new char[s.length()];
        c[0] = s.charAt(s.length()-1);
        for(int i = 1; i < s.length() -1;i++){
            c[i] = s.charAt(i);
        }
        String result = new String(c);
        return result ;
    }*/
    public int reverse(int x) {
        String s = String.valueOf(x);
        
        char[] ch = new char[s.length()];
        int j = 0 ;
        for (int i= s.length() -1; i>=0 ; i--){
            
            ch[i] = s.charAt(j);
            j++; 
        }  
        String reint = new String(ch);
        int flag =0;
       if(reint.charAt(s.length()-1) == '-'){
            String subs = reint.substring(0,reint.length() -1 ) ;
            reint = subs ;
            flag =1 ;
        }
        try{int result = Integer.parseInt(reint);
        int temp = 2*result;
        if (flag == 1){
            result = result - temp;
        }
        if(result >= ((int)Math.pow(2,31)-1) || result <= -((int)Math.pow(2,31))){
            return 0;
        } 
        return result ;
        } catch (NumberFormatException e){
            return 0;
        }
        
         
        
    }
}
