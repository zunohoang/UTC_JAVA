package labs.lab2;

public class Lab2Sub3 {

    public static void main(String[] args) {
        int countWord = 0;
        String str = "32532fjdjghuieeht8934gnregn834hgnreingkdfn erdfbfd";
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) > 'a' && str.charAt(i) < 'z') countWord += 1;
        }
        System.out.println(countWord);
    }

}
