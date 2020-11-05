package stack;

import java.util.HashMap;
import java.util.Stack;

public class _496下一个更大元素 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,2,3};
int []b= {1,2,3,4,6,8,9};
	solution496 so1=new solution496();
	so1.nextGreatElement(a, b);
	
	}

}


class solution496{
	public  int[] nextGreatElement(int[] findNums,int[] nums) {
		Stack<Integer> stack= new Stack< >();
		/*stack< >为什么为空
		 * 
		 */
		HashMap<Integer, Integer> map=new HashMap< >();
		/*先对nums中每一个元素求出其下一个更大元素，随后将这些答案放入哈希映射hashmap中
		 * 在遍历数组findnums直接找出答案
		 */
		int []res = new int [findNums.length];
		/*
		 * 
		 */
		for (int i = 0; i < nums.length; i++) {
			while (!stack.empty()&&nums[i]>stack.peek()) {
				map.put(stack.pop(), nums[i]);
			}
		}
		while (!stack.empty()) {
			map.put(stack.pop(), -1);
			
		}
		for (int i = 0; i < findNums.length; i++) {
			res [i] =map.get(findNums[i]);
			
		}
		return res;
		 
	}
}