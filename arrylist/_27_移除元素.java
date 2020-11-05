package arrylist;
class solution27{
	/*
	 * 双指针法
	 */
	public int removeElement( int [] nums ,int val) {
		int i=0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j]!=val) {
				nums[i]=nums[j];
				i++;
				
			}
			
			
		}
		return i;
				
	}
}
public class _27_移除元素 {
/*
 * 
给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。

不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。

元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

example1.
给定 nums = [3,2,2,3], val = 3,

函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。

你不需要考虑数组中超出新长度后面的元素 *
 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {0,1,1,2,3,5};
int[]b= {1,1,1,1,2,2,3,5};
solution27 solution21=new solution27();
System.out.println(solution21.removeElement(a, 1));
System.out.println(solution21.removeElement(b,1 ));
	}

}

