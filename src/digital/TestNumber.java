package digital;

import java.util.Scanner;

public class TestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s3 = "";
        char cs[] = s1.toCharArray();
        for(int i =0 ;i<cs.length; i++)
        {
            if(Character.isLowerCase(cs[i]))
                s3+=Character.toString(Character.toUpperCase(cs[i]));
            else
                s3+=cs[i];
        }
        System.out.println(s3);


    }
}
