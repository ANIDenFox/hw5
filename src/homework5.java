public class homework5 {
    public static void main(String[] args) {
        System.out.println(numToString(4));
        System.out.println(numToString(12));
        System.out.println(numToString(72));
        System.out.println(numToString(641));
        System.out.println(numToString(8469));
        System.out.println(numToString(17986));
        System.out.println(numToString(75413));
        System.out.println(numToString(108911));
        System.out.println(numToString(618513));
        oneQuaterTriangle1();
        System.out.println();
        oneQuaterTriangle2();
        System.out.println();
        oneQuaterTriangle3();
        System.out.println();
        oneQuaterTriangle4();
    }
    public static String numToString(int f) {
        String[] nums = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] nums1 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] nums2 = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (f < 10) {
            return nums[f];
        }
        if (f >= 10 && f < 20) {
            return nums1[f % 10];
        }
        if (f >= 20 && f < 100) {
            return nums2[f / 10] + " " + nums[f % 10];
        }
        if (f >= 100 && f < 1000) {
            if (f % 100 >= 10 && f % 100 < 20){
                return nums[f / 100] + " hundred " + nums1[f % 10];
            }else
                return nums[f / 100] + " hundred " + nums2[f / 10 % 10] + " " + nums[f % 10];
        }
        if (f >= 1000 && f < 10000) {
            if (f % 100 >= 10 && f % 100 < 20) {
                return nums[f / 1000] + " thousand " + nums[f / 100 % 10] + " hundred " + nums1[f % 10] ;
            }else
                return nums[f / 1000] + " thousand " + nums[f / 100 % 10] + " hundred " + nums2[f / 10 % 10] + " " + nums[f % 10];
        }
        if (f >= 10000 && f < 20000) {
            if (f % 100 >= 10 && f % 100 < 20) {
                return nums1[f / 1000 % 10] + " thousand " + nums[f / 100 % 10] + " hundred "  + nums1[f % 10] ;
            }else
                return nums1[f / 1000 % 10] + " thousand " + nums[f / 100 % 10] + " hundred " + nums2[f / 10 % 10] + " " + nums[f % 10];
        }
        if (f >= 20000 && f < 100000) {
            if (f % 100 >= 10 && f % 100 < 20) {
                return nums2[f / 10000] + " " + nums[f / 1000 % 10] + " thousand " + nums[f / 100 % 10] + " hundred " + nums1[f % 10];
            } else
                return nums2[f / 10000] + " " + nums[f / 1000 % 10] + " thousand " + nums[f / 100 % 10] + " hundred " + nums2[f / 10 % 10]  + " " + nums[f % 10];
        }
        if (f >= 100000 && f < 1000000) {
            if (f % 1000 == 0) {
                return nums[f / 100000] + " hundred thousand";
            } else {
                return nums[f / 100000] + " hundred " + numToString(f % 100000);
            }
        }
        return "";
    }

    public static void oneQuaterTriangle1() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if ((i == j && j > 5) || (i + j == 11 && i > 5) || i == 10) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void oneQuaterTriangle2() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if ((i == j && j < 6) || (i + j == 11 && i < 6) || i == 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void oneQuaterTriangle3() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if ((i == j && j < 6) || (i + j == 11 && i > 5) || j == 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void oneQuaterTriangle4() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if ((i == j && j > 5) || (i + j == 11 && i < 6) || j == 10) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}