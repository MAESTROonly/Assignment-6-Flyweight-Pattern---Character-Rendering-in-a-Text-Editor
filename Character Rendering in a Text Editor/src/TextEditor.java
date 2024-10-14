import java.util.ArrayList;
import java.util.List;

public class TextEditor {
    private List<CharacterPosition> characters = new ArrayList<>();
    private CharacterFactory characterFactory;

    public TextEditor(CharacterFactory factory) {
        this.characterFactory = factory;
    }

    public void insert(char value, String font, int size, int x, int y) {
        Character character = characterFactory.getCharacter(value, font, size);
        characters.add(new CharacterPosition(character, x, y));
    }

    public void render() {
        for (CharacterPosition characterPosition : characters) {
            characterPosition.render();
        }
    }

    private class CharacterPosition {
        private Character character;
        private int x, y;

        public CharacterPosition(Character character, int x, int y) {
            this.character = character;
            this.x = x;
            this.y = y;
        }

        public void render() {
            character.render(x, y);
        }
    }
}