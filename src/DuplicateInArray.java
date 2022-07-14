//to check duplicate element in the array
public class DuplicateInArray {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,5,6,77,7,7,8,9,9};
        int pre=0;
        for (int i = 0; i < arr.length; i++) {
            int a=arr[i];
            for (int j = 0; j < arr.length; j++) {
                if(pre==arr[j]){
                    continue;
                }
                if(i==j){
                    continue;
                }
                if(a==arr[j]){
                    System.out.print(a+" ");
                    pre=a;
                    break;
                }
            }
        }

    }
}
