public class ValidPalindrome {
    public boolean CheckPalindrome(String s) {
        int n = s.length();
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        String s = "A man, a plan, a canal: Panama";
        boolean result = vp.CheckPalindrome(s);
        System.out.println("Is palindrome: " + result);
    }
}
