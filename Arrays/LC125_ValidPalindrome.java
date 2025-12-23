// initial solution -  runtime 14ms in leetcode
class Solution {

    public static boolean isPelindrome(String s){
        
        int left = 0;
        int right = s.length()-1;


        while(left<right){
            if(s.charAt(left) != s.charAt(right))
                return false;

            left ++;
            right--;
        }
        
        return true;
    }
}



//  optimal - runtime 2ms in leetcode

// class Solution {
//     public boolean isPalindrome(String s) {

//         int left = 0;
//         int right = s.length()-1;

//         while(left<right){

//             while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
//                 left++;
//             }

//             while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
//                 right--;
//             }

//             if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
//                 return false;

//             }
//             left++;
//             right--;
//         }
        
        
//         return true;
        
//     }
// }


/*
Difference
 Although both solutions are O(n), preprocessing the string using regex creates extra string objects and requires additional passes. The two-pointer approach processes characters in place, avoids regex overhead, and uses O(1) extra space, making it more efficient in practice.
 
LeetCode measures:
Execution time
Memory usage
Regex + extra strings → higher time & memory bars


So you pay for:
Regex engine overhead
Extra memory allocation
Extra traversal(s)
Still O(n), but with a large constant factor
 
 */