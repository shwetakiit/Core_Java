package kumari.shweta;

import java.util.stream.IntStream;

/*
  Print pattern using java stream
 */
public class PrintPattern {

    public static void main(String[] args) {
        //Traditional approach
        for(int i=1;i<=5;i++){
            for(int j=5;j>=1;j--){
                if(j<=i){
                 System.out.print(i);
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        System.out.println("Using Stream API "+"\n");
        int n=5;
      IntStream.rangeClosed(1,n).forEach(i->{
            IntStream.range(0,n-i).forEach(j->System.out.print("*")); //0 to 5-1  end exclusive 0 to 3  total 4 *
            IntStream.rangeClosed(1,i).forEach(j->System.out.print(i));
            System.out.println();
      });
    }


}
