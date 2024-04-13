abstract class Video {
    protected String title;
    protected int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public abstract String getInfo();
}

class TvSeries extends Video {
    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        return "Title: " + title + "\nDuration: " + duration + " minutes\nEpisodes: " + episodes;
    }
}

class Movie extends Video {
    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        return "Title: " + title + "\nDuration: " + duration + " minutes\nRating: " + rating;
    }
}

public class Main {
    public static void main(String[] args) {
        TvSeries tvSeries = new TvSeries("Breaking Bad", 45, 62);
        Movie movie = new Movie("Inception", 148, 8.8);

        System.out.println("TV Series Info:");
        System.out.println(tvSeries.getInfo());

        System.out.println("\nMovie Info:");
        System.out.println(movie.getInfo());
    }
}
