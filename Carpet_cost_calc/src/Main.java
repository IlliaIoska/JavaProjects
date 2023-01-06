public class Main {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(2,5);
        Carpet carpet2 = new Carpet(3,5);
        Carpet carpet3 = new Carpet(4,6);
        Carpet_cost_calc carpet_cost_calc = new Carpet_cost_calc();

        double carpet1_length = carpet1.getLength();
        double carpet1_width = carpet1.getWidth();

        double carpet2_length = carpet2.getLength();
        double carpet2_width = carpet2.getWidth();

        double carpet3_length = carpet3.getLength();
        double carpet3_width = carpet3.getWidth();

        int carpet1_category = carpet1.get_category(carpet1_length, carpet1_width);

        int carpet2_category = carpet2.get_category(carpet2_length, carpet2_width);

        int carpet3_category = carpet3.get_category(carpet3_length, carpet3_width);

        double carpet1_cost = carpet_cost_calc.calc_cost(carpet1_category);

        double carpet2_cost = carpet_cost_calc.calc_cost(carpet2_category);

        double carpet3_cost = carpet_cost_calc.calc_cost(carpet3_category);

        System.out.println("Cost of carpet1 = " + carpet1_cost);
        System.out.println("Cost of carpet2 = " + carpet2_cost);
        System.out.println("Cost of carpet3 = " + carpet3_cost);

    }
}