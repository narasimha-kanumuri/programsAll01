public class arrayDuplicateCommon {
    public static void main(String[] args) {
        String str1 = "Pooja verma";//o,a
        String str2 = "Aashutosh";//;a,s,h
        //a is common
        String common1 = duplicate(str1);
        String common2 = duplicate(str2);

        System.out.println();
    }

    public static String duplicate(String str) {
        String duplicates = "";
        int len = str.length();
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    duplicates += str.charAt(i);
                }
            }
        }
        return duplicates;
    }
}
