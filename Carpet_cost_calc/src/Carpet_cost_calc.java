public class Carpet_cost_calc {

    public double calc_cost(int category) {
        double cost = 0;
        if (category == 1) {
            cost = 1000;
        } else if (category == 2) {
            cost = 2000;
        } else {
            cost = 3000;
        }
        return cost;
    }
}
