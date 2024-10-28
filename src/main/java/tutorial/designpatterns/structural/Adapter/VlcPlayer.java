package tutorial.designpatterns.structural.Adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String filename) {
//        System.out.println("Playing Mp4 file. Name: " + filename);
    }

    @Override
    public void playVlc(String filename) {
        System.out.println("Playing Vlc file. Name: " + filename);
    }
}
