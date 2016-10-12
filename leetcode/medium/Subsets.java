/**
 *  Number of subsets for {1 , 2 , 3 } = 2^3.
 *
 *  Why ?
 *  Case possible outcomes for the set of subsets
 *  1   ->  Take or dont take = 2
 *  2   ->  Take or dont take = 2 
 *  3   ->  Take or dont take = 2
 *
 * Therefore, total = 2*2*2 = 2^3 = { { } , {1} , {2} , {3} , {1,2} , {1,3} , {2,3} , {1,2,3} }
 *
 * Lets assign bits to each outcome -> 1st bit to 1, 2nd bit to 2 and 3rd bit to 3
 * Take      = 1
 * Dont take = 0
 *
 * 0) 0 0 0  -> Dont take 3 , Dont take 2 , Dont take 1 = { } 
 * 1) 0 0 1  -> Dont take 3 , Dont take 2 ,      take 1 = { 1 } 
 * 2) 0 1 0  -> Dont take 3 ,      take 2 , Dont take 1 = { 2 } 
 * 3) 0 1 1  -> Dont take 3 ,      take 2 ,      take 1 = { 1 , 2 } 
 * 4) 1 0 0  ->      take 3 , Dont take 2 , Dont take 1 = { 3 } 
 * 5) 1 0 1  ->      take 3 , Dont take 2 ,      take 1 = { 1 , 3 } 
 * 6) 1 1 0  ->      take 3 ,      take 2 , Dont take 1 = { 2 , 3 } 
 * 7) 1 1 1  ->      take 3 ,      take 2 ,      take 1 = { 1 , 2 , 3 } 
 *
 * In the above logic ,Insert nums[i] only if (i >> n) & 1 == true,
 * where { i E { 0,1,2,3,4,5,6,7 }  n = Nth element in the input array }
 *
 * element 1 is inserted only into those places where 1st bit of j is 1 
 * if( i >> 0 & 1 ) ==> for above above eg. this is true for sl.no.( i ) = 1 , 3 , 5 , 7 
 *
 * element 2 is inserted only into those places where 2nd bit of j is 1 
 * if( i >> 1 & 1 ) ==> for above above eg. this is true for sl.no.( i ) = 2 , 3 , 6 , 7
 *
 * element 3 is inserted only into those places where 3rd bit of j is 1 
 * if( i >> 2 & 1 ) ==> for above above eg. this is true for sl.no.( i ) = 4 , 5 , 6 , 7 
 *
 * Time complexity : O(n*2^n) , for every input element loop traverses the whole solution set length i.e. 2^n
 *
 * Company tags: Amazon, Uber, Facebook.
 *
 * @author thumike
 * @author leet_nik
 */
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
    	Arrays.sort(nums);
    	int totalLen = (int) Math.pow(2, nums.length);
    	List<List<Integer>> subsets = new ArrayList<>(totalLen);
    	for (int i = 0; i < totalLen; i++) {
    		List<Integer> subset = new LinkedList<>();
    		for (int n = 0; n < nums.length; n++) {
    			if ((i >> n & 1) == 1) {
    				subset.add(nums[n]);
    			}
    		}
    		subsets.add(subset);
    	}
    	return subsets;
    }
}
