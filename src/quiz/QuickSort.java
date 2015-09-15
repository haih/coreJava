package quiz;


public class QuickSort {

	public static void main(String[] args) {
		int[] res = {3,1,4,6,2,4,8};
		sort(res, 0, res.length-1);
		for (int i : res) {
			System.out.println(i);
		}
	}
	
	public static void sort(int[] lists,int low,int high){
		if(low >= high){
			return;
		}
		if(low == high -1){
			if(lists[low] > lists[high])
				swap(lists, low, high);
			return;
		}
		int temp = lists[low];
		int left = low + 1;
		int right = high;
		while(left < right){
			while(left < right && left < high){
				if(lists[left] > temp){
					break;
				}
				left++;
			}
			while(left <= right && right > low){
				if(lists[right] <= temp){
					break;
				}
				right--;
			}
			if(left < right){
				swap(lists, right, left);
			}
		}
		System.out.println(left+"    "+right);
		swap(lists, low, right);
		sort(lists, low, right);
		sort(lists, right+1, high);
	}
	private static void swap(int[] lists,int a,int b){
		int temp = 0;
		temp = lists[a];
		lists[a] = lists[b];
		lists[b] = temp;
	}
}
