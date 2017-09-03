package leecode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {

	
public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<nums1.length;i++){
        	map.put(nums1[i], -1);
        }
        for(int num:nums2){
        	while(!stack.isEmpty()&&stack.peek()<num){
        		System.out.println(stack.peek()+" "+num);
        		map.put(stack.pop(), num);
        	}
        	stack.push(num);
        }
        for(int i=0;i<nums1.length;i++){
        	nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }
public static void main(String[] args) {
	int[] test1 = new int[]{4,1,2};
	int[] test2 = new int[]{1,3,4,2};
	System.out.println(new NextGreaterElement().nextGreaterElement(test1, test2)[1]);
}
}
