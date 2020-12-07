import java.util.Scanner;
//Class Name
public class MethodsExercises {
//        static class Add {
//            int c;
//            //Method Name, Why are we using void? Because it's not static?
//            void addition(int x, int y) {
//                c = x + y;
//            }
//        }
//        //Static class .. it is an inner class aka nested
//        static class Sub {
//            int c;
//            void subtraction(int x, int y) {
//                c = x - y;
//            }
//        }
//        static class Mul {
//            int c;
//            void multiplication(int x, int y) {
//                c = x * y;
//            }
//        }
//        static class Div {
//            float b;
//            void division(float x, float y) {
//                b = x / y;
//            }
//        }
//        static class Mod {
//            int c;
//            void modulus(int x, int y) {
//                c = x%y;
//            }
//        }
//
    public static void main(String[] args) {
        getInteger(1, 15);
        showFactorial();
//        int a, b;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first number");
//        //first number input
//        a = sc.nextInt();
//        System.out.println("Enter second number");
//        //second number input
//        b = sc.nextInt();
//
//        //The "r" character is interchangeable
//        Add r = new Add();
//        //Calling the method
//        r.addition(a, b);
//        System.out.println("Addition : " + r.c);
//
//        Sub s = new Sub();
//        s.subtraction(a, b);
//        System.out.println("Subtraction : " + s.c);
//
//        Mul m = new Mul();
//        m.multiplication(a, b);
//        System.out.println("Multiplication : " + m.c);
//
//        Div d = new Div();
//        d.division(a, b);
//        System.out.println("Division : " + d.b);
//
//        Mod o = new Mod();
//        o.modulus(a, b);
//        System.out.println("Modulus : " + o.c);
        }

        //Call in main method
    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter a number between %d and %d:\n " , min, max);
        int userNumber;
        userNumber = scan.nextInt();

        if(userNumber < min || userNumber > max) {
            getInteger(min, max);
        }
        System.out.println(userNumber);
        return userNumber;
    }

    public static void showFactorial() {
        Scanner factorialScan = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 15\n");
        int start = getInteger(1, 15);
        long factorial = 1;
        String output ="! = 1";
        System.out.printf("1%s\n", output);
        for (int i=2;i<=start;i++){
            factorial *= i;
            output += " x " + i;
            System.out.printf("%d%s = %d\n", i, output, factorial);
        }
    }



}


//    public static int getInteger(int min, int max){
//            Scanner getIntegerScanner = new Scanner(System.in);
//            int userInput = getIntegerScanner.nextInt();
//            if (userInput > min && userInput < max){
//                return userInput;
//            } else {
//                System.out.print("Please enter an integer between " + min + " and " + max);
//                return getInteger(1, 10);
//            }


