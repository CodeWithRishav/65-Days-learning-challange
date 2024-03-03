/*
 Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1, 2, 3, 1]
Output: true
Example 2:
Input: nums = [1, 2, 3, 4]
Output: false
Example 3:
Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
Output: true
Constraints:
• 1 <= nums . lengtth <= 105
• -109 <= nums [ i ] <= 109
*/

public class ContainsDuplicate {
    public static boolean duplicates(int num[]){
        for(int i=0;i<num.length;i++){
            for (int j=i+1;j<num.length;j++){
                if( num[i]==num[j] ){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num[] = {1,2,3,4};
        int num1[]= {1, 2, 3, 4};
        int num2[]={1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(duplicates(num));
        System.out.println(duplicates(num1));
        System.out.println(duplicates(num2));
    }
}





/*
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        // Iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            // Compare the current element with all subsequent elements
            for (int j = i + 1; j < nums.length; j++) {
                // If a pair with the same value is found, return true
                if (nums[i] == nums[j]) {
                    return true; // Duplicate found
                }
            }
        }
        // If no duplicates are found after checking all pairs, return false
        return false; // No duplicates found
    }

    public static void main(String[] args) {
        // Example arrays
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        // Testing the containsDuplicate method with example arrays
        System.out.println(containsDuplicate(nums1)); // Output: true
        System.out.println(containsDuplicate(nums2)); // Output: false
        System.out.println(containsDuplicate(nums3)); // Output: true
    }
}

*/