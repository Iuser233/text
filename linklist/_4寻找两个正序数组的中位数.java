package linklist;

import java.text.BreakIterator;

/**
 * 
 * @param args
 */
class text4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//�Ƚ���������ϲ�
    	int []nums;
    	int m=nums1.length;
    	int n=nums2.length;
    	nums=new int[m+n];
//���ж�nums1��nums2��û��һ��Ϊ�ա��еĻ�ֱ�Ӹ�����һ����Ԫ�ظ�����ż�����λ��
    	if (m==0) {
			if (n%2==0) {
				return (nums2[n/2-1]+nums2[n/2])/2.0;
				
			}else {
				return nums2[n/2];
			}
			
		}
    	if (n==0) {
			if (m%2==0) {
				return (nums1[n/2-1]+nums1[n/2])/2.0;
				
			}else {
				return nums1[n/2];
			}
			
		}
    	int count=0;
    	int i=0;
    	int j=0; 	//��������nnums2��ָ��
    //2.��nums1��2���鶼��Ϊ��ʱ���Ƚ����������Ϊһ�����飬�ڽ�����ż����
   //2.1nums1Ϊ��ʱ
    	while (count!=(m+n)) {
			if (i==m) {
				while (j!=n) {
					nums[count++]=nums2[j++];
				}
				break;
				}
	//2.2nums2Ϊ��		
			if (j==n) {
				while (i!=m) {
					nums[count++]=nums1[i++];
				}
				break;
				}
	//2.3nums1\2d����Ϊ��,��������������ִ�С�ֱ�Ž�nums��
if (nums1[i]<nums2[j]) {
nums[count++]=nums[i++];

}	
else {
nums[count++]=nums2[j++];
}

			
		}
    	//2.4�ж���ż�������λ��
    	if (count%2==0) {
    		return (nums[count/2-1]+nums[count/2])/2.0;
    		
    	}else {
    		return nums[count/2];
    	}
    	
    	
    }
}
public class _4Ѱ�����������������λ�� {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(7/2);
	}
int [] a= {1,3,5,7,9};
int [] b= {2,4,6,8,10};
text4 t4=new text4();

}
