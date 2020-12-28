package MusicPlayer;

public class Song {

    private String title;
    private Artist artist; //instead of String, artist has to be here
    private int duration;
    private int counter; // countHowManyTimesSongHasPlayed

    public Song(String title, Artist artist, int duration) { // user wont enter the count, so it shouldnt be in this
                                                             // line
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.counter = 0;
    }

    public boolean incrementCounter() { // when song plays
        counter++;
        return true;
    }

    public String getTitle() {
        return title;
    }

    public Artist getArtist() {
        return artist;
    }

    public int getDuration() {
        return duration;
    }

    public int getCounter() {
        return counter;
    }
//I am overriding here to define what I want equal to mean for my classes
//first line: I call it at one instance and pass it the second instance, what I want to test
//2nd line: this is the song we are in right now. If its the same song... first an instance must be equal to itself
//any test we write must first check if any two instances are really the same instance
//comparing the addresses of obj and this

    @Override
    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if (obj instanceof Song){ //check what the user entered, check the type
            return true;
        }
        Song castedSong = (Song) obj;//if passes both ifs before, come here and cast

        return this.getTitle().equals(castedSong.getTitle()) && this.getArtist().equals(castedSong.getArtist()) && this.getDuration() == castedSong.getDuration();
    }

    @Override
    public int hashCode() { //I made it just zero and only the first song was added to playlist
        int hash = 7;
        hash = 31 * hash + (int) duration;
        hash = 31 * hash + (int) counter;
        return hash;//returns my bucket number
    }





}