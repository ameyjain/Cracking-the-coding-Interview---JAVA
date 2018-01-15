public class MyClass {
    public static void main(String args[]) {
        System.out.println("is permutable palindrome = " + solution("aab"));
    }

    public static boolean solution(String s) {

        int checker = 0;
        String string = s.trim().replaceAll(" ", "");

        if (string.isEmpty()) return false;

        for (Character c : s.toCharArray()) {

            if ((checker & (1 << c)) == 0) {
                checker = checker ^ (1 << c);
            }
            checker |= (1 << c);
        }

        return checker == 0 || checker % 2 == 0;
    }
}
