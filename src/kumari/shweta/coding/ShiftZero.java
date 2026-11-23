package kumari.shweta.coding;

public class ShiftZero {

    //TC --> O(N) SC ->O(1)
    public static void shiftZeroLeft(int arr[]) {
        int index = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                arr[index--] = arr[i];
            }
        }
        while (index >= 0) {
            arr[index--] = 0;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void shiftZeroRight(int arr[]){
       int index=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]!=0){
               arr[index++]=arr[i];
           }
       }

       while(index<arr.length){
           arr[index++]=0;
       }

       for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
       }

    }
    public static void main(String[] args) {
        int arr[] = {23, 99, 0, 45, 0, 12, 0, 67};
        System.out.println("Shift all zero left side ");
        shiftZeroLeft(arr);
       int arr1[]={1,0,13,12,0,20,1,2,0};
        System.out.println("Shift all zero right side");
        shiftZeroRight(arr1);

    }
}
