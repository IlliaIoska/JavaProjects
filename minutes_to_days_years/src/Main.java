public class Main {
    public static void main(String[] args) {
        minutes_to_days_years(525600);
    }

    public static void minutes_to_days_years(int minutes) {

        if (minutes < 0) {
            System.out.println("Enter non-negative values");
        } else {
            int days = minutes / 60 / 24;
            int remaining_days = minutes % 1440;
            System.out.println(days);
            int months = days / 30;
            System.out.println(months);

            System.out.println(remaining_days);
            int years = months / 12;
            int remaining_months = months % 12;
            System.out.println(years + " years " + remaining_days + " days " + remaining_months + " months ");

        }
    }
}