public class GoldPoint {
    public static void main(String[] args) {
        float m = 1f;
        int a = 0,b = 0;
        float breakoint = 0.618f;
        float divmin = 1f;
        for(int i = 1; i<=20;i++)
            for(int j =i+1 ; j <= 20; j++)
            {
                if(i%2==0&&j%2==0)
                    continue;//不能写成break
              //  break;
                float div = (float)i/j;
                float min = (float)Math.abs(div-breakoint);
                if(min<m) {
                    m = min;
                    a = i;
                    b = j;
                    divmin = div;

                }

            }
        System.out.println("离黄金分割点最近的两个数是："+a+"/"+b+"="+divmin);

    }
}
