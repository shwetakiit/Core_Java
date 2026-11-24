package kumari.shweta.collections;

import java.util.Arrays;

public class SeparateZero {

    public static void main(String[] args) {
         int arr[] = {23,99,0,45,0,12,0,67};
         int arr1[]=new int[arr.length];
         //int count=0;
      int count= (int) Arrays.stream(arr).filter(i->i==0).count();
     /*    for(int i=0;i<arr.length;i++){
             if(arr[i]==0){
                 count++;
             }
         }*/

         for(int i=0;i<arr.length;i++){
           if(arr[i]!=0){
               arr1[count]=arr[i];
               count++;
           }


         }
         for(int i=0;i<arr.length;i++){
             System.out.print(arr1[i]+" ,");
         }


        //o/p int arr[] = {0,0,0,23,99,45,12,67};
    }
}
