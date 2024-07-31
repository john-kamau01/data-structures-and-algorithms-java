public class ReverseArray{
    // Function to print an array
    public static void printArray(int[] arr){
        int arrLength = arr.length;
        for(int i = 0; i < arrLength; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function to reverse an array
    public static void reverseArray(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args){
        int[] myArray = {4, 5, 1, 8, 10};
        System.out.println("Before Reversing:");
        printArray(myArray);
        System.out.println("After Reversing:");
        reverseArray(myArray, 0, myArray.length - 1);
        printArray(myArray);
    }
}