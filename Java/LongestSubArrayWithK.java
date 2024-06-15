public class LongestSubArrayWithK {public static void main(String[] args) {
    int[] arr={2,0,-1,0,0,6};
    int sum=0;
    int j=0;
    int len=0;
    int k=6;
    int tempa=0;
    
    for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
        // System.out.println(sum);
        if(sum>k){
            while(sum>k){
            sum=sum-arr[j];
            j++;
            }
            // System.out.println(j+"--> "+sum);
        }
        if(sum==k){
            int temp=i-j+1;
            //  System.out.println("Temp"+temp);
            if(temp>len){
                len=temp;
                
            }
            // System.out.println("Length"+len);
        }
        tempa=i;
    }
    if(j<arr.length){
        while(j<arr.length){
            sum=sum-arr[j];
            j++;
        
        if(sum==k){
            int temp=tempa-j+1;
            //  System.out.println("Temp"+temp);
            if(temp>len){
                len=temp;
                
            }
        }
        }
        
    }
    // System.out.println("Final--"+len);
}
}
