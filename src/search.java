/**
 * 給一個整數陣列和一個整數，傳回該整數在陣列中的位置，或無位置則傳回-1。
 * 假設該陣列照升冪排序，且有一處旋轉
 * 如（即[0,1,2,4,5,6,7]可能變為[4,5,6,7,0,1,2]）。
 * 陣列中不存在重複
 * 運行時間複雜度必須是O（log n）
 * @author black
 *
 */
public class search {
	public static void main(String [] args){
		Solution Solution = new Solution();
		int [] result = {5,1,3};
		System.out.println(Solution.search(result, 3));
	}
}
