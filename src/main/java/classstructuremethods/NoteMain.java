package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();
        note.setName("Tibi");
        note.setTopic("Java");
        note.setText("This is a programing language");
        System.out.println(note.getNoteText());
    }
}
