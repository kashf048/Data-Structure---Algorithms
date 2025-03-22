import com.kashfabbas.stringmanipulation.StringUtils;

public class Main {
  public static void main(String[] args) {
    int count = StringUtils.countVowels("HellO World!");
    System.out.println("Count: " + count);

    String reversed = StringUtils.reverse("fhsak");
    System.out.println("Reversed: " + reversed);

    String reverseWord = StringUtils.reverseWords("Trees are beautiful");
    System.out.println("'" + reverseWord + "'");

    var x = StringUtils.areRotations("ABCD", "DABC1");
    System.out.println("Rotation: " + x);

    var output = StringUtils.removeDuplicates("Trees are beautiful");
    System.out.println("Remove Duplicates: " + output);

    var output2 = StringUtils.getMaxOccuringChar("Trees are beautiful");
    System.out.println("Most repeated character: " + output2);

    var result2 = StringUtils.capitalize("today is a great day!");
    System.out.println("Capital: " + result2);

    var result3 = StringUtils.areAnagrams("ABCD", "BDAC");  // CADB, DACB, ADCB...etc
    System.out.println("Anagrams: " + result3);

    var result4 = StringUtils.areAnagrams2("ABCD", "CADB");  // CADB, DACB, ADCB...etc
    System.out.println("Anagrams2: " + result4);

    var result5 = StringUtils.isPalindrome("MADAM");
    System.out.println("Palindrome: " + result5);
  }
}