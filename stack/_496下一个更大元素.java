package stack;

import java.util.HashMap;
import java.util.Stack;

public class _496��һ������Ԫ�� {

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
		/*stack< >ΪʲôΪ��
		 * 
		 */
		HashMap<Integer, Integer> map=new HashMap< >();
		/*�ȶ�nums��ÿһ��Ԫ���������һ������Ԫ�أ������Щ�𰸷����ϣӳ��hashmap��
		 * �ڱ�������findnumsֱ���ҳ���
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