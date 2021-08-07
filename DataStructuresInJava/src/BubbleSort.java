
public class BubbleSort {
	public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
	
	public static void main(String[] args) {
			
			int array[] = {10,21,13,4,5};
			
			bubbleSort(array);
			
			for(int i=0;i<array.length ; i++) {
				System.out.println(array[i]);
			}
		}
}
