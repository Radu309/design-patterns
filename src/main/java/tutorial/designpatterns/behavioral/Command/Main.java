package tutorial.designpatterns.behavioral.Command;

/**
 *
 Design pattern-ul Command este un pattern comportamental care transformă o solicitare într-un obiect, permițând astfel
 să fie tratată ca un obiect independent. Command decuplează emitentul unei solicitări (invocatorul) de destinatarul
 acesteia, astfel încât solicitările pot fi stocate, plasate într-o coadă, jurnalizate sau anulate.
 */
public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        // Pornește lumina
        remote.setCommand(lightOn);
        System.out.println("Pressing button to turn ON the light:");
        remote.pressButton();

        // Oprește lumina
        remote.setCommand(lightOff);
        System.out.println("\nPressing button to turn OFF the light:");
        remote.pressButton();
    }
}
