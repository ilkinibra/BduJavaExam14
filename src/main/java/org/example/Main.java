import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int say=0;
        s=sc.nextLine();

        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==' '){
                if(s.charAt(i-1) != ' ' && s.charAt(i-1) !='-')
                {
                    say=say+1;
                }
            }
        }
        System.out.println(say+1);
    }
}