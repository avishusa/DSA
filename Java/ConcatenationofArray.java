class Solution {
    public int[] getConcatenation(int[] arr) {
        int[] arra = new int[2 * arr.length];
        for (int i = 0; i < arr.length; i++) {
            arra[i] = arr[i]; 
            arra[i + arr.length] = arr[i]; 
        }
        return arra;
    }
        
    }
