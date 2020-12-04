import java.util.Scanner;
//Class Name
class Add {
    int c;

    //Method Name, Why are we using void? Because it's not static?
    void addition(int x, int y) {
        c = x + y;
    }

    //Static class .. it is an inner class aka nested
    static class Sub {
        int c;

        void subtraction(int x, int y) {
            c = x - y;
        }

        static class Mul {
            int c;
            void multiplication(int x, int y) {
                c = x * y;
            }

            static class Div {
                int c;
                void division(int x, int y) {
                    c = x/y;
                }
            }

            public static void main(String[] args) {
                int a, b;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter first number");
                //first number input
                a = sc.nextInt();
                System.out.println("Enter second number");
                //second number input
                b = sc.nextInt();

                //The "r" character is interchangeable
                Add r = new Add();
                //Calling the method
                r.addition(a, b);
                System.out.println("Addition : " + r.c);

                Sub s = new Sub();
                s.subtraction(a, b);
                System.out.println("Subtraction : " + s.c);

                Mul m = new Mul();
                m.multiplication(a, b);
                System.out.println("Multiplication : " + m.c);

                Div d = new Div();
                d.division(a, b);
                System.out.println("Division : " + d.c);


            }
        }
    }
}
