class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
  for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        int temp;
        boolean condition=false;
        int check=0;
    while(!condition){
        check=0;
        for(int i=0;i<n+m-1;i++){
            if(nums1[i]>nums1[i+1]){
                temp=nums1[i];
                nums1[i]=nums1[i+1];
                nums1[i+1]=temp;
            }else{
                check++;
            }
            
        }
       if(check==n+m-1)
        condition=true;
    } 
    }
}
