public class Recitation4 {

    public static String explode(String word) {
        StringBuilder sb = new StringBuilder();
        int duplicateValue;
        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            if (Character.isLetter(ch)) {
                duplicateValue = index + 1;
            } else if (Character.isDigit(ch)) {
                duplicateValue = Integer.parseInt("" + ch);
            } else {
                break;
            }
            for (int count = 0; count < duplicateValue; count++) {
                sb.append(ch);
            }
        }
        // Ensure the non-alphanumeric character is added correctly
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                sb.append(word.substring(0, i));
                break;
            }
        }
        return sb.toString();
    }
}




