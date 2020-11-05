package arrylist;

public class _283_move_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	;
	}

}
class so{
    for (int i = 0; i < nums.length; i++) {
        if (nums[i]==0) {
            for (int j = i+1; j <nums.length; j++) {
                nums[j-1]=nums[j];
            }
            nums[nums.length-1]=0;
        }else{

        }

       
    }
    if (nums.length==0) {
        System.out.println("kong");
    }
}

}