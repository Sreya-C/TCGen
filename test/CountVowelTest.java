import org.junit.Test;
import static org.junit.Assert.*;

public class CountVowelTest {

    @Test
    public void testCount_Vowels_EmptyString() {
        // Test when input string is empty
        int result = CountVowel.count_Vowels("");
        assertEquals(0, result);
    }

    @Test
    public void testCount_Vowels_NoVowels() {
        // Test when input string has no vowels
        int result = CountVowel.count_Vowels("xyz");
        assertEquals(0, result);
    }

    @Test
    public void testCount_Vowels_AllVowels() {
        // Test when input string has all vowels
        int result = CountVowel.count_Vowels("aeiou");
        assertEquals(5, result);
    }

    @Test
    public void testCount_Vowels_MixedCase() {
        // Test when input string has mixed case vowels
        int result = CountVowel.count_Vowels("aEiOu");
        assertEquals(5, result);
    }

    @Test
    public void testCount_Vowels_OnlyVowels() {
        // Test when input string contains only vowels
        int result = CountVowel.count_Vowels("AaEeIiOoUu");
        assertEquals(10, result);
    }

    @Test
    public void testCount_Vowels_SpecialCharacters() {
        // Test when input string has special characters
        int result = CountVowel.count_Vowels("a@e#i$o%u");
        assertEquals(5, result);
    }

    @Test
    public void testCount_Vowels_Numbers() {
        // Test when input string has numbers
        int result = CountVowel.count_Vowels("a1e2i3o4u5");
        assertEquals(5, result);
    }

    @Test
    public void testCount_Vowels_NullString() {
        // Test when input string is null
        int result = CountVowel.count_Vowels(null);
        assertEquals(0, result);
    }

    @Test
    public void testCount_Vowels_LargeString() {
        // Test with a large input string
        int result = CountVowel.count_Vowels("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed non risus.");
        assertEquals(16, result);
    }
}