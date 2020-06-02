import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bufferedReader.readLine());//多少个数
        String[] s1 = bufferedReader.readLine().split(" ");
        int[] array = new int[n+1];
        for (int i = 0; i < n; i++) {
            array[i+1]=array[i]+Integer.parseInt(s1[i]);
        }
        int m=Integer.parseInt(bufferedReader.readLine());//多少次询问
        String[] s2 = bufferedReader.readLine().split(" ");
        int[] array1 = new int[m];
        for (int i = 0; i < m; i++) {
            array1[i]=Integer.parseInt(s2[i]);
            System.out.println(solution(array1[i],array));
        }





    }
    public static int solution(int x,int[] array){
        int count=0;
        for (int j = 0; j < array.length&&x>array[j]; j++) {
            count=j+1;

        }
        return count;
    }
}