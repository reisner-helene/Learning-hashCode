package MusicPlayer;

import java.util.LinkedHashSet;

public class Playlist {

    private String name;
    LinkedHashSet<Song> playlist;

    public Playlist(String name) {
        this.name = name;
        this.playlist = new LinkedHashSet<>();
    }

    public String getName() {
        return name;
    }

    public int totalDuration(){
        {   
            int result = 0; //cant be inside of the loop!
            for(Song song : playlist){
                result = result + song.getDuration();
            }
            return result;
        }
    }  

    public boolean add(Song song){
        return playlist.add(song);
    }

    public boolean playAllSongs(){
        System.out.println(" ");
        System.out.println("These songs are playing: ");
        System.out.println(" ");
        for(Song song : playlist){
            System.out.print(song.getTitle() + " by " + song.getArtist().getName() + " lasting " + song.getDuration() + " seconds"); //just writing playlist here prints: Song@7bac7eff for Song1
            song.incrementCounter();
            System.out.println(" ");
            System.out.println(" ");
        }
        return true;
    }

//just song.getArtist() gives this: Artist@28a418fc110
}