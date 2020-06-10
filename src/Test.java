import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Test {
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int len=Integer.parseInt(bufferedReader.readLine());//字符串长度
        String[] s=bufferedReader.readLine().split(" ");//字符串
        int[] arr=new int[len];
        for (int i = 0; i < len; i++) {
            arr[i]=Integer.parseInt(s[i]);
            System.out.println(arr[i]);
        }

        System.out.println(String.valueOf(lampSum(len,arr)));

    }
    public static int lampSum(int l,int[] s){
        int sum=0;
        for (int i = 0; i < l; i+=2) {
            if (s[i]==0) {
                sum++;

            }

        }
        return sum;
    }
}