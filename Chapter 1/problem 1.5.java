public class MyClass {
    public static void main(String args[]) {
        System.out.println("is One Edit Away = " + isOneEditAway("pale", "ple"));
    }

    static boolean isOneEditAway(String first, String second)
    {
        if (Math.abs(first.length() - second.length()) > 1)
        {
            return false;
        }
        String s1 = first.length() <= second.length() ? second : first;
        String s2 = first.length() <= second.length() ? first : second;
        
        boolean foundTheDifference = false;
        int index1 = 0;
        int index2 = 0;
        
        while (index1 < s1.length() && index2 < s2.length())
        {
            if (first.charAt(index1) != second.charAt(index2))
            {
                if (foundTheDifference) return false; // already found a difference
                
                foundTheDifference = true;
                
                if (first.length() == second.length()) // if it is replaced
                {
                    index2++;
                }
            }
            else
            {
                index2 ++;
            }
            index1 ++;
        }
        
        return true;
        
    }
}
