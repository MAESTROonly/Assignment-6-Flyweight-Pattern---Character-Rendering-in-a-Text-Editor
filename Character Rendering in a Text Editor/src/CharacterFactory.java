import java.util.HashMap;

public class CharacterFactory {
    private HashMap<String, Character> characterPool = new HashMap<>();

    public Character getCharacter(char value, String font, int size) {
        String key = value + "-" + font + "-" + size;
        if (!characterPool.containsKey(key)) {
            characterPool.put(key, new Character(value, font, size));
        }
        return characterPool.get(key);
    }

    public int getPoolSize() {
        return characterPool.size();
    }
}