public class MyClass {
    public static void main(String args[]) {
      System.out.println("Compressed String = " + commpressString("aabcccccaaa"));
    }

public static String commpressString(String s) {
    char[] chars = s.toCharArray();
    StringBuilder sb = new StringBuilder();
    sb.append(chars[0]);
    int count = 1;
    for (int i = 1 ; i < s.length(); i ++) {

        char first = chars[i - 1];
        char second = chars[i];
        if (first != second) {

            sb.append(count);
            sb.append(second);
            count = 1;
        }
        else {
            count ++;
        }
    }

    sb.append(count);
    return sb.toString();
    }
}
