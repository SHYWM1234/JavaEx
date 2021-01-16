public class FindDoubleNum
{
	public static void main(String[] args){
		int[] nums = {1, 2, 2, 4, 5, 7, 2, 10, 3};
		for(int i =1 ; i<nums.length; i++){
			for (int j=0; j<i ; j++ )
			{
				if(nums[i] ==  nums[j]){
					System.out.println(i);
					return;
				}
			}
		}
		System.out.println("NotFind!");
		
	}
}