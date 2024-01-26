public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5, 6 ,2, 3, 9, 12, 1};

        for(int i = 0; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
