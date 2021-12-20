public class PositiveNegativeZero {
    public static void main(String[] args) {

    }
    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("positive");
        }else {
            if(number==0)
                System.out.println("zero");
            if(number < 0)
                System.out.println("negative");
        }
        System.out.println("invladid entry");
    }
}
