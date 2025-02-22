public class Recitation4 {


    public static String explode(String word){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length();i++){
            char ch = word.charAt(i);

            if (Character.isLetter(ch)){
                for(int j = 0; j <= i ; j++){
                    sb.append(ch);
                }
            }else if(Character.isDigit(ch)){
                int num = Character.getNumericValue(ch);
                for (int s = 0; s < num; s++ )
                    sb.append(ch);
            }else {
                sb.append(word.substring(0,i));
            }
        }

        return sb.toString();
    }
}





