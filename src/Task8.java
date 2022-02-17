import java.util.Scanner;
public class Task8 {
    public static String[] func(String str[]) {
        int count = 0, vlowes = 0;
        for(int i = 0; i < str.length; i++) {
            for(int j = 0; j < str[i].length(); j++) {
                if(str[i].charAt(j) == 'a') {
                    vlowes++;
                }
            }
            if(vlowes > 2) {
                count++;
            }
            vlowes = 0;
        }
        String s[] = new String[count];
        int index = 0;
        for(int i = 0; i < str.length; i++) {
            for(int j = 0; j < str[i].length(); j++) {
                if(str[i].charAt(j) == 'a') {
                    vlowes++;
                }
            }
            if(vlowes > 2) {
                s[index] = str[i];
                index++;
            }
            vlowes = 0;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        for(int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        String str[] = func(s);
        for(int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
