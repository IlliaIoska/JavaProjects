public class Teen {

    public static boolean is_teen(int teen1_age, int teen2_age, int teen3_age) {

        if ((teen1_age <= 19 && teen1_age >= 13) || (teen2_age <= 19 && teen2_age >= 13) || (teen3_age <= 19 && teen3_age >= 13)) {

            return true;
        } else {
            return false;
        }
    }
}
