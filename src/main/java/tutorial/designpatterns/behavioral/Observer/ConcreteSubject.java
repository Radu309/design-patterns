package tutorial.designpatterns.behavioral.Observer;

public class ConcreteSubject extends Subject {
    private String videoTitle;

    public void uploadNewVideo(String title) {
        this.videoTitle = title;
        System.out.println("New video uploaded: " + title);
        notifyObservers("New video uploaded: " + title);
    }

    public String getVideoTitle() {
        return videoTitle;
    }
}
