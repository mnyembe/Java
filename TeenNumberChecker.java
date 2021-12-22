public class TeenNumberChecker {
    public static boolean isTeen(int age){
        boolean isTeen = age > 12 && age < 20 ? true : false;
        return isTeen;
    }
    public static boolean hasTeen(int age1, int age2, int age3){
        boolean hasTeen = isTeen(age1) || isTeen(age2) || isTeen(age3) ? true : false;
        return hasTeen;
    }
}
