package tutorial.designpatterns.behavioral.Memento;

/**
 * Design pattern-ul Memento este un pattern comportamental care permite salvarea și restaurarea stării unui obiect fără
 * a-i expune structura internă. Acest pattern este util pentru implementarea funcționalităților de tip "undo" (anulare),
 * în care trebuie păstrată o "memorie" a stărilor anterioare ale unui obiect.
 */

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        editor.setContent("First version of text.");
        caretaker.save(editor);

        editor.setContent("Second version of text.");
        caretaker.save(editor);

        editor.setContent("Third version of text.");
        System.out.println("Current content: " + editor.getContent());

        caretaker.undo(editor);
        System.out.println("After undo: " + editor.getContent());

        caretaker.undo(editor);
        System.out.println("After second undo: " + editor.getContent());
    }
}
