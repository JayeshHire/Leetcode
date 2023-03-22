class Solution {
    public boolean isMatch(String s, String p) {
        int si = 0; //index for input string parsing
        for (int pi = 0;pi < p.length() ; pi++){
            try {
                s.charAt(si);
            } catch(Exception e){
                if (p.charAt(pi-1)=='*' && p.charAt(pi)==s.charAt(si-1)){
                    return true;
                } else if(p.charAt(pi-1)=='*' && p.charAt(pi)!=s.charAt(si-1)){
                    if(p.length() == s.length() +1){
                        return false;
                    }
                    return true;
                }  
                if (p.length()>s.length()){
                    return false;
                }
                //return true;
            }
            if (s.charAt(si) == p.charAt(pi)){
                si ++ ;
                continue ;
            } else if(p.charAt(pi)=='.'){
                si++ ;
                continue;
            } else if (p.charAt(pi)=='*'){
                char var = p.charAt(pi - 1);
                int f = si;
                try{
                while(s.charAt(si)==var || var == '.'){
                    si++;
                }
                } catch (Exception e){
                    if (si == s.length()&& pi == (p.length() -1)){
                    return true ;
                }
                    
                }   
                
            } else {
                /*if (si > 0){
                    si = 0;
                }*/
                try {
                    if (p.charAt(pi + 1) != '*'){
                    return false ;
                    }
                } catch(Exception e){
                    return false;
                }
                
                 if (p.length() > s.length()){
                     continue;
                }
                
            }
        }
        
        if (si == s.length()){
            return true;
        } else {
            return false;
        }
        
    }
}
