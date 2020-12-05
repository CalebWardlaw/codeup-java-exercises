public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

//        int counter = 0;
//        do {
//            System.out.println(counter);
//            counter += 2;
//        }   while(counter <= 100);
//
        int start = 0;
        while ( start <= 100){
            start++;
         if(start%15==0){
             System.out.println(start + " Fizzbuzz");
         }
         else if (start%5 == 0){
             System.out.println(start + " Buzz");
         }
         else if (start%3 == 0){
             System.out.println(start + " Fizz");
         }
         else {
             System.out.println(start);
         }
        }
    }
}
