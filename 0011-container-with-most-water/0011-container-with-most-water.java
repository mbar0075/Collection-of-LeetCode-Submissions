class Solution {
    public int maxArea(int[] height) {
        int n=height.length-1;
        int  firstPointer=0,secondPointer=n;
        int area=0;
        while(firstPointer<=secondPointer){
            int newArea=Math.min(height[firstPointer],height[secondPointer])*(secondPointer-firstPointer);
            area=Math.max(area,newArea);
            if(height[firstPointer]<height[secondPointer]){
                firstPointer++;
            }
            else{
                secondPointer--;
            }
        }
        return area;
    }
}