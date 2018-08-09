/**
 * 主要為二分查找法，分為high與low指標，並求出中心點，由中心點去跟high或low比較找出排序位置，並移動指標與中心點再次查找。
 * @author black
 *
 */
public class Solution {
	public int search(int[] nums, int target) {
		if(nums==null) return 1;
		int high = nums.length-1;
		int low = 0;
		while(low<=high)
		{
			int mid = (high+low) / 2;
			if(target<nums[mid])
			{
				if(nums[mid]<nums[high])	//右側排序
				{
					high = mid -1;
				}
				else if(target<nums[low])
				{
					low = mid +1;
				}
				else
					high = mid -1;
			}
			else if(target>nums[mid])
			{
				if(nums[mid]>nums[low])	//左側排序
				{
					low = mid +1;
				}
				else if(target>nums[high])
				{
					high = mid -1;
				}
				else
					low = mid +1;
			}
			else
				return mid;
		}
        return -1;
    }
}
