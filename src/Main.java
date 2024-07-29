import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Sum sm = new Sum();
        var test1 = sm.twoSum(new int[]{3,2,4}, 7);
        System.out.println(Arrays.toString(test1));

        var result = twoSum(new int[]{2, 7, 11, 15},9);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hashTable = new HashMap<>();
        for(int i = 0;i<nums.length;++i){
            if(hashTable.containsKey(target - nums[i])){
                return new int[]{hashTable.get(target - nums[i]),i};
            }
            hashTable.put( nums[i] , i );
        }
        return new int[0];
    }


}

