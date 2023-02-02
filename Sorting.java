public class Sorting{

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-i-1;j++){

                if(arr[j] > arr[j+1]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

    public static void main(){

        Sorting bubble = new Sorting();
        
        int arr[] = [10,30,40,50,20];
        bubble.bubbleSort(arr);

    }
}