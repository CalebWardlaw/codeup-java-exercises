
//why can't i put public?
 class Dish {
   public  Integer costInCents;
   public  String nameOfDish;
   public  Boolean wouldRecommend;


    public void printSummary(String[] args){
        System.out.printf("Cost: %d\n Name: %s\n Recommend: %b\n" ,costInCents, nameOfDish, wouldRecommend);
    }

//    public static void main(String[]args){
//         class DishTest {
//             Dish soup = new Dish();
//             soup.costInCents = 100;
//        }
//
//
//     }

}





