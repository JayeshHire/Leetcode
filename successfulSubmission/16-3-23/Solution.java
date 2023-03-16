class Solution {
    public boolean isPalindrome(int x) {
        String p = Integer.toString(x);
        String reverseP = new String();
        for (int i = p.length() - 1; i>= 0 ;i--){
            reverseP += p.charAt(i);
        }
        int flag = 0;
       // int c = p.length() -1 ;
        if (p.length() % 2 == 0){
        for (int j =0 ; j< p.length()/2  ; j++){
            if (p.charAt(j) != reverseP.charAt(j)){
                flag = 1;
                break;
            }
            //c--;
        }
        } else {
            for (int j =0 ; j <= (int)(p.length()/2); j++){
                if(p.charAt(j)!=reverseP.charAt(j)){
                    flag = 1;
                    break;
                }
               // c --;
            }
        }
        if (flag == 0){
            return true;
        }
        return false;
    }
}
