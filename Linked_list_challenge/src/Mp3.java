import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Mp3 {
    private LinkedList<Song> track_list = new LinkedList();
    private Scanner input;

    public Mp3() {

    }
    public LinkedList<Song> getTrack_list() {
        return track_list;
    }

    private LinkedList<Song> add_song_to_track_list(String new_track_name, double new_track_duration) {
        ListIterator<Song> li = this.track_list.listIterator();
        while (li.hasNext()) {
            String existng_track_name = li.next().getTrack_name();
            if (existng_track_name.equals(new_track_name)) {
                System.out.println("Song already exists in the playlist");
                break;
            }
        }
        Song song = new Song(new_track_name, new_track_duration);
        track_list.add(song);
        System.out.println("THe track " + new_track_name + " has been successfully added to the playlist");
        return this.track_list;
    }

    public void print_track_list() {
        ListIterator<Song> li = this.track_list.listIterator();
        while (true) {
            if (li.hasNext()) {
                Song song = this.track_list.get(li.nextIndex());
                System.out.println("Track name = " + song.getTrack_name());
                System.out.println("The track's duration = " + song.getTrack_duration());
            } else {
                System.out.println("No more tracks");
                break;
            }
            li.next();
        }
    }

    private int remove_song_from_track_list(String track_to_remove) {
        ListIterator<Song> li = track_list.listIterator();
        while (li.hasNext()) {
            String existng_track_name = li.next().getTrack_name();
            if (existng_track_name.equals(track_to_remove)) {
                this.getTrack_list().remove(find_song_by_name(existng_track_name));
                System.out.println("THe track " + track_to_remove + " has been successfully removed from the playlist");
                return 1;
            }
        }
        System.out.println("The track does not exists in the playlist");
        return -1;
    }

    private Song find_song_by_name(String song_name) {
        ListIterator<Song> li = this.track_list.listIterator();
        Song matching_song = null;
        for (int i = 0; i < this.track_list.size(); i++) {
            if (this.track_list.get(0).getTrack_name().equals(song_name)) {
                matching_song = this.track_list.get(li.nextIndex());
                System.out.println("Song with the name " + matching_song.getTrack_name() + " has been found");
            }
        }
        /*while (li.hasNext()) {
            if (li.next().getTrack_name().equals(song_name)) {
                matching_song = this.track_list.get(this.track_list.indexOf(li.previous()));
                System.out.println("The song with the name " + matching_song.getTrack_name() + " has been found");
                break;
            }
        }*/
        return matching_song;
    }

    public void use_mp3_player() {
        input = new Scanner(System.in);
        boolean is_valid_action;
        while (true) {
            System.out.println("1. Add a song to the playlist (0) \n2. Remove a song from the playlist (1) \n3. Display the current playlist (2) \n4. Find the song (3)  \n5. Close the mp3 (4)");
            is_valid_action = input.hasNextInt();
            if (is_valid_action) {
                String song_name;
                int action = input.nextInt();
                switch (action) {
                    case 0:
                        System.out.println("You have chosen the option of adding a song to the playlist");
                        System.out.println("The name = ");
                        song_name = input.next();
                        input.nextLine();
                        System.out.println("The duration = ");
                        Double song_duration = input.nextDouble();
                        add_song_to_track_list(song_name, song_duration);
                        break;
                    case 1:
                        System.out.println("You have chosen the option of removing a song from the playlist");
                        System.out.println("Input the name ");
                        song_name = input.next();
                        remove_song_from_track_list(song_name);
                        break;
                    case 2:
                        System.out.println("You chosen the option of displaying the current playlist");
                        print_track_list();
                        break;
                    case 3:
                        System.out.println("Searching for a song with the name = ");
                        song_name = input.next();
                        find_song_by_name(song_name);
                    case 4:
                        System.out.println("Closing the mp3");
                        System.exit(0);
                }
            } else {
                System.out.println("There is no such action programmed");
            }
            input.nextLine();
        }
    }
}
