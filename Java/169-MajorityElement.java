
// 169. Majority Element

// Given an array nums of size n, return the majority element.

// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

 

// Example 1:

// Input: nums = [3,2,3]
// Output: 3
// Example 2:

// Input: nums = [2,2,1,1,1,2,2]
// Output: 2

class Solution {
    public int majorityElement(int[] arr) {

         
        int c=0;
       int el=-1;
       int c1=0;
       
       for(int i=0;i<arr.length;i++){
           if(c==0){
               c=1;
               el=arr[i];
           }else if(arr[i]==el){
               c++;
           }else{
               c--;
           }
       }
       for(int i=0;i<arr.length;i++){
           if(arr[i]==el){
               
           c1++;
           }
       }
       if(c1>arr.length/2){
           return el;
       }else{
        return -1;
       }
}

        
    
}
 