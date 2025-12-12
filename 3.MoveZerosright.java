import java.util.Arrays;
public class MoveZeros{
    public int[] moveZero(int[] nums){
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
              nums[j] = nums[i];
              j++;  
            }
        }
            while(j < nums.length){
                nums[j] =  0;
                j++;
            }
            return nums;
        }
        
        
        public static void main(String[] args){
            int[] nums ={0,2,1,0,3,0};
            MoveZeros mov = new MoveZeros();
            int[] res = mov.moveZero(nums);
            System.out.println(Arrays.toString(res));
        }
    }
