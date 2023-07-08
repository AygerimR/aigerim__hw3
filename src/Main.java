import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double [] numbers = {2.2, 1.10, -11.2, 2.3, 3.2, -7.3,
                -2.2,- 6.5, 5.5, 3.8, 2.8, 7.7, 4.7, -2.9, -4.5,
        };

      double allFinalAnswer = 0;
      int num= 0;
      boolean negativeNumber = false;

       for (double b: numbers){
           if (!negativeNumber){
               if (b < 0){
                   negativeNumber= true;

               }
           }
           else {
               if (b >0 ){
                   allFinalAnswer += b;
                   num++;

               }
           }
       }
        System.out.println(allFinalAnswer/num);




    }
}