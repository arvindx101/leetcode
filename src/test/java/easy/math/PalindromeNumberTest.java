package easy.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    void isPalindrome() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        Assertions.assertEquals(true, palindromeNumber.isPalindrome(4554));
        Assertions.assertEquals(false, palindromeNumber.isPalindrome(-4554));
        Assertions.assertEquals(false, palindromeNumber.isPalindrome(12345));
        Assertions.assertEquals(true, palindromeNumber.isPalindrome(123321));
        Assertions.assertEquals(false, palindromeNumber.isPalindrome(321));

    }
}