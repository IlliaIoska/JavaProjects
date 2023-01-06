class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String create_plot() {
        return "Plot";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String create_plot() {
        return "Munch munch";
    }
}

class Madoka extends Movie {
    public Madoka() {
        super("Madoka");
    }

    @Override
    public String create_plot() {
        return "Magical girl's adventure";
    }
}

public class Main {
    public static void main(String[] args) {
        return_random_movie();
        figure_plot("Jaws");
    }

    public static Movie return_random_movie() {
        int random_number = (int) ((Math.random() * 2) + 1);
        Movie movie = new Movie("");
        switch (random_number) {
            case 1:
                movie = new Jaws();
                break;
            case 2:
                movie = new Madoka();
                break;
        }
        return movie;
    }

    public static void figure_plot(String movie_name) {
        Movie movie = return_random_movie();
        System.out.println("Movie is " + movie.getName() + " and it's about " + movie.create_plot());
    }
}