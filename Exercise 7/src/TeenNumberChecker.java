public class TeenNumberChecker {
    public static boolean hasTeen (int a, int b, int c) {
        if (a <= 19 && a >= 13) return true;

        if (b <= 19 && b >= 13) return true;

        if (c <= 19 && c >= 13) return true;

        return false;
    }
    public static boolean isTeen (int d) {
        if (d <= 19 && d >= 13) return true;
        return false;
    }
}

//public class TeenNumberChecker {
 //   public static boolean hasTeen (int a, int b, int c) {
 //       return isTeen(a) || isTeen(b) || isTeen(c);
//    }
//    public static boolean isTeen (int d) {
 //       return (d <= 19 && d >= 13);
 //   }
//}