package arrylist;
class solution27{
	/*
	 * ˫ָ�뷨
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
public class _27_�Ƴ�Ԫ�� {
/*
 * 
����һ������ nums ��һ��ֵ val������Ҫ ԭ�� �Ƴ�������ֵ���� val ��Ԫ�أ��������Ƴ���������³��ȡ�

��Ҫʹ�ö��������ռ䣬������ʹ�� O(1) ����ռ䲢 ԭ�� �޸��������顣

Ԫ�ص�˳����Ըı䡣�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�

example1.
���� nums = [3,2,2,3], val = 3,

����Ӧ�÷����µĳ��� 2, ���� nums �е�ǰ����Ԫ�ؾ�Ϊ 2��

�㲻��Ҫ���������г����³��Ⱥ����Ԫ�� *
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

