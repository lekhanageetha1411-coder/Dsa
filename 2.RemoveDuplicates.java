import java.util.Arrays;
class RemoveDuplicates{
    public int RemoveDuplicate(int[] nums){
        int j = 0;
        for(int i = 1 ; i< nums.length;i++){
           
                if(nums[i] != nums[j]){
                    j++;
                    nums[j] = nums[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args){
        RemoveDuplicates rem = new RemoveDuplicates();
        int nums[] = {1,2,2,2,2,3,3,3,3,3,3,4,4,4};
        int r =rem.RemoveDuplicate(nums);

        System.out.println("r:"+r);

        System.out.println("modified Array:");
        
        for(int i=0;i<r;i++){
            System.out.print(" " +nums[i] );
        }
    }
}
