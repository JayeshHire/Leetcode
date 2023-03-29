class Solution {
    

    public int maxArea(int[] height) {
        int Area = 0;
       for(int i =0;i<height.length ; i++){
           
            int key = height[i];
            int a = 0;
            for (int j=0 ; j<height.length ; j++){
                int b ;
                int breadth ;
                    if (i < j){
                        breadth = j - i;
                    } else {
                        breadth = i -j;
                    }
                if (key < height[j] ){
                    
                    b = key*breadth;
                   // i = j;
                } else if (key > height[j]){
                    b = height[j]*breadth;
                } else {
                    b = height[j]*breadth;
                }
                //b = height[j]*breadth;
                if (Area < b){
                    Area = b;
                }
            }
        }
        return Area;
    }
}
