public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean shouldWakeUp = true;
        if(barking && (hourOfDay >= 0 && hourOfDay < 8 || hourOfDay > 22 && hourOfDay < 25)) {
            return shouldWakeUp;
        }else {
            shouldWakeUp = false;
            return shouldWakeUp;
        }
    }
}
