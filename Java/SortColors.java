// 75. Sort Colors

// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]

class Solution {
    
    
    public void sortColors(int[] arr) {

        int n = arr.length;
        int left = 0;  
        int right = n - 1;  
        
        int i = 0;
        while (i <= right) {
            if (arr[i] == 0) {
                for (int j = i; j > left; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[left] = 0;
                left++;
                i++;
            } else if (arr[i] == 2) {
                for (int j = i; j < right; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[right] = 2;
                right--;
            } else {
                i++;
            }
        }
        
    }
}