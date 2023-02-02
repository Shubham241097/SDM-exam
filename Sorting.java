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

    public static void insertionsort(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0){
                switch(key > arr[j]){
                    case true:
                        arr[j+1] = arr[j];
                        j--;
                        break;
                    
                    case false:
                        arr[j+1]=key;
                        break;
                }
            }
        }
    }

    public static void main(){

        Sorting sort = new Sorting();
        
        int arr[] = [10,30,40,50,20];
        sort.bubbleSort(arr);

        int arr1[] = [10,20,30,50,40];
        sort.insertionsort(arr1);

    }
}