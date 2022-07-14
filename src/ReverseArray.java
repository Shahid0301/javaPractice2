//to reverse an array
public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,2,34,5,5346,6,4,5};
        int temp;

        for (int i = 0; i < arr.length/2; i++) {
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        for (int i:arr
             ) {
            System.out.print(i+" ");
        }
    }
}
