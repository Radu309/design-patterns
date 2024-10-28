package tutorial.designpatterns.crational.Builder;

/**
 *  Design pattern-ul Builder este folosit pentru a construi obiecte complexe în mod incremental, astfel încât să poți
 *  controla procesul de construire pas cu pas. Este foarte util atunci când obiectul pe care vrei să-l creezi are multe
 *  atribute sau necesită o inițializare complexă, cum ar fi un obiect imutabil sau un obiect cu configurație variabilă.
 */
public class Main {
    public static void main(String[] args) {
        Car car = Car.builder()
                .setColor("Red")
                .setEngine("V8")
                .setTransmission("Automatic")
                .setYear(2023)
                .build();

        System.out.println(car);
    }
}
