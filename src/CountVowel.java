public class CountVowel {
    public static int count_Vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E'|| str.charAt(i) == 'i' || str.charAt(i) == 'I'|| str.charAt(i) == 'o' || str.charAt(i) == 'O'|| str.charAt(i) == 'u' || str.charAt(i) == 'U' )
            {
                count++;
            }
        }
        return count;
    }
}
