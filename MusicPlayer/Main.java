package MusicPlayer;

public class Main {

    public static void main(String[] args){

        Artist artist1 = new Artist("Lord of the Puppies");
        Artist artist2 = new Artist("A.P.P.L.E.");
        Artist artist3 = new Artist("Flight of the Men");

        Song song1 = new Song("Classic hit", artist1, 180);
        Song song2 = new Song("Christmas carol", artist2, 200);
        Song song3 = new Song("Summertime", artist3, 160);
        Song song4 = new Song("Summertime", artist3, 160); //testing if it will be played twice

        Playlist playlist1 = new Playlist("Random mix");

        playlist1.add(song1);
        playlist1.add(song2);
        playlist1.add(song3);
        playlist1.add(song4);

        System.out.println("----------------------------");
        System.out.println(" ");
        System.out.println("This playlist will last: " + playlist1.totalDuration() + " seconds"); //playlist1.getDuration()

        playlist1.playAllSongs();
        System.out.println("----------------------------");


    }

}