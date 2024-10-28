package tutorial.designpatterns.structural.Adapter;

/**
 *
 Design pattern-ul Adapter este un pattern structural care permite ca două interfețe incompatibile să colaboreze.
 Acesta funcționează ca un "traducător" între două clase care au interfețe incompatibile. Scopul principal al
 pattern-ului Adapter este să facă două clase să lucreze împreună fără a schimba codul lor intern.
 */

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "movie.mp4");
        audioPlayer.play("vlc", "video.vlc");
        audioPlayer.play("avi", "movie.avi"); // Format invalid
    }
}
