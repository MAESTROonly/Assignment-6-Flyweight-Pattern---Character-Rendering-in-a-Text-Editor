public class TextEditorApp {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        TextEditor editor = new TextEditor(factory);
        editor.insert('H', "Arial", 12, 0, 0);
        editor.insert('e', "Arial", 12, 10, 0);
        editor.insert('l', "Arial", 12, 20, 0);
        editor.insert('l', "Arial", 12, 30, 0);
        editor.insert('o', "Arial", 12, 40, 0);

        editor.insert('W', "Arial", 12, 0, 10);
        editor.insert('o', "Arial", 12, 10, 10);
        editor.insert('r', "Arial", 12, 20, 10);
        editor.insert('l', "Arial", 12, 30, 10);
        editor.insert('d', "Arial", 12, 40, 10);
        editor.render();
        System.out.println("Total unique characters in pool: " + factory.getPoolSize());
    }
}