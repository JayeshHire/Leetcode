class Solution {
    public int myAtoi(String s) {
        String sample = new String();
        for (int i = 0 ; i<s.length() ; i++){
            if (s.charAt(i) != ' '){
                if(s.charAt(i) == '-'){
                    sample += '-';
                } else if (s.charAt(i) == '+'){
                   sample += '+';
                } else {
                    String p = new String();
                    p = Character.toString(s.charAt(i));
                        try {
                            Integer.parseInt(p);
                        } catch (NumberFormatException e){
                            break ;
                        }
                    sample += s.charAt(i);
                    
                }
            } else if (sample.length() > 1 ){
                break;
            }
        }
        int result = 0;
        try {
            
            
            result = Integer.parseInt(sample);

            return result ;
        }  catch (Exception e){
            try{
                long t = Long.parseLong(sample);
            if (t < -(long)Math.pow(2,31)){
                result = -((int)Math.pow(2,31) + 1) ;
            } else if(t > (long)(Math.pow(2,31) -1) ){
                result = (int)Math.pow(2,31);
            }
            } catch (NumberFormatException f){
                return 0;
            } catch (Exception g){
                if (sample.charAt(0) == '-'){
                    result = -((int)Math.pow(2,31) + 1) ;
                } else {
                    result = (int)Math.pow(2,31);
                }
                
            }
            //System.out.println(e);
           
        } finally {
            return result ;
        }
        
        }
}
