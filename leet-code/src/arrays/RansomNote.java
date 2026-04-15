package arrays;

import java.util.*;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("abcc", "abcc"));
    };

    static public boolean canConstruct(String ransomNote, String magazine) {
        char[] magazineChars = magazine.toCharArray();
        Map<Character, ArrayList<Character>> letters = new HashMap<>();
        for (char character : magazineChars) {
            Optional<ArrayList<Character>> charsArray = Optional.ofNullable(letters.get(character));
            ArrayList<Character> updated;
            if (charsArray.isPresent()) {
                updated = charsArray.get();
            } else {
                letters.put(character, updated = new ArrayList<>());
            }
            updated.add(character);
            letters.put(character, updated);
        }

        char[] noteChars = ransomNote.toCharArray();
        for (char noteChar : noteChars) {
            Optional<ArrayList<Character>> charsArray = Optional.ofNullable(letters.get(noteChar));
            ArrayList<Character> updated;
            if (charsArray.isPresent()) {
                if (charsArray.get().isEmpty()) {
                    return false;
                }
                    updated = charsArray.get();
                updated.remove(updated.getFirst()
                );
                letters.put(noteChar, updated);
            } else {
                return false;
            }
        }

        return true;
    };



}
