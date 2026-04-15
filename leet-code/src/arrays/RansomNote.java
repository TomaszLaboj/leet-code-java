package arrays;

import java.util.*;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println("canConstruct(\"hello world\", \"hello world\") :" + canConstruct("hello world", "hello world"));
        System.out.println("canConstruct2(\"hello world\", \"hello world\") :" + canConstruct2("hello world", "hello world"));
        System.out.println("canConstruct2(\"a\", \"a\") :" + canConstruct2("a", "a"));
        System.out.println("canConstruct3(\"a\", \"a\") :" + canConstruct3("a", "a"));
        System.out.println("canConstruct3(\"hello world\", \"asdfasdf\") :" + canConstruct3("hello world", "asdfasdf"));
        System.out.println("canConstruct3(\"hello world\", \"hello world\") :" + canConstruct3("hello world", "hello world"));
    }

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
    }

    static public boolean canConstruct2(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++) {
            int charIndex = magazine.indexOf(ransomNote.charAt(i));
            if ( charIndex >= 0) {
                magazine = magazine.substring(0, charIndex) + magazine.substring(charIndex + 1);
            } else {
                return false;
            }
        }

        return true;
    }

    static public boolean canConstruct3(String ransomNote, String magazine) {
        Map<Character, Integer> letters = new HashMap<>();

        for (char letter : magazine.toCharArray()) {
            if (letters.containsKey(letter)) {
                letters.put(letter, letters.get(letter) + 1);
            } else {
                letters.put(letter, 1);
            }
        }

        for (char letter : ransomNote.toCharArray()) {
            if (letters.containsKey(letter) && letters.get(letter) > 0) {
                letters.put(letter, letters.get(letter) -1);
            } else {
                return false;
            }
        }
        return true;
    }
}
