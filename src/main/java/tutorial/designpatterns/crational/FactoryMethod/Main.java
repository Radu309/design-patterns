package tutorial.designpatterns.crational.FactoryMethod;

/**
 * Factory Method permite subclaselor să decidă ce obiecte să instanțieze, separând astfel logica de creație a
 * obiectelor de logica care le folosește. Acest design pattern ajută la reducerea dependențelor directe de clase
 * concrete, facilitând extinderea și menținerea codului.
 *
 * Pasi:
 * 1) Interfață/Clasă abstractă pentru produse (Message): Definirea unei interfețe pentru obiectele pe care le va crea
 * fabrica. Aceasta asigură consistență și permite polimorfism.
 * Importanță: Promovează utilizarea unui contract comun pentru toate produsele create, decuplând logica de tipul
 * specific de obiect.
 *
 * 2) Clase Concrete pentru produse (EmailMessage, SMSMessage): Clasele care implementează interfața sau clasa abstractă,
 * reprezentând tipuri specifice de obiecte.
 * Importanță: Asigură implementări variate, fără a schimba logica principală.
 *
 * 3) Creator abstract (fabrica abstractă) (MessageFactory): Definește Factory Method (createMessage) care va fi
 * implementat de subclase pentru a crea obiectele specifice.
 * Importanță: Centralizează procesul de creație și îl decuplează de la utilizare.
 *
 * 4) Creatori concreți (EmailMessageFactory, SMSMessageFactory): Subclase care implementează Factory Method pentru a
 * decide ce tip de produs să creeze.
 * Importanță: Permite crearea flexibilă de noi produse fără a modifica codul existent.
 * **/

public class Main {
    public static void main(String[] args) {
        // Folosim EmailMessageFactory pentru a trimite un email
        MessageFactory emailFactory = new EmailMessageFactory();
        emailFactory.send("example@email.com", "This is an email message!");

        // Folosim SMSMessageFactory pentru a trimite un SMS
        MessageFactory smsFactory = new SMSMessageFactory();
        smsFactory.send("+123456789", "This is an SMS message!");
    }
}
