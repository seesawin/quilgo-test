public class Test02 {
    /*
    Given an integer array nums, and it contains two elements that sum up to a specific number target. Design a method (function) to find them.

    You can assume that there is always exactly one solution.The order of the result does not matter.

    Example:
    Input: nums = [1, 4, 7, 23, 9], and target = 13.
    Output: {4, 9}, because 4 + 9 = 13.
     */
    public static void main(String[] args) throws Exception {
        int[] nums = {1, 4, 7, 23, 9};
        int[] test = Test02.test(nums, 32);
        if (test == null) {
            System.out.println("there are no result");
        } else {
            System.out.println(test[0] + "," + test[1]);
        }
    }

    public static int[] test(int[] nums, int target) throws Exception {
        if (nums == null || nums.length == 0) {
            throw new Exception("nums is empty");
        }
        if (nums.length < 2) {
            throw new Exception("nums's length must be at least 2 element");
        }
        Integer firstValue;
        Integer SecondValue;
        for (int i = 0; i < nums.length; i++) {
            firstValue = nums[i];
            if (i + 1 == nums.length) {
                return null;
            }
            for (int j = i + 1; j < nums.length; j++) {
                SecondValue = nums[j];
                if (firstValue + SecondValue == target) {
                    int[] resultArr = {firstValue, SecondValue};
                    return resultArr;
                }
            }
        }
        return null;
    }
}
