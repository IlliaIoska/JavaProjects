public class Song {
    private String track_name;
    private double track_duration;

    public Song(String track_name, double track_duration) {
        this.track_name = track_name;
        this.track_duration = track_duration;
    }

    public String getTrack_name() {
        return track_name;
    }

    public double getTrack_duration() {
        return track_duration;
    }
}
