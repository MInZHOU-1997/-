public class Baiwanfuwen {
    public static void main(String[] args) {
        int p = 12000;
        float r = 0.20f;
        int f = 0;
        int n = 0;
        for (n=1;n<1000;n++) {
            float nianlilv = 1;
            for (int i = 0; i < n; i++)
                nianlilv = nianlilv * (1 + r);
            System.out.println(nianlilv);
            f+=(int)(p*nianlilv);
            //int nianshouru = (int)(p*nianlilv);
            // f+=nianshouru;
            System.out.println(f);
            if (f > 1000000) {
                System.out.println(n);
                System.out.println(f);
                break;
            }
            System.out.println(n);
        }



    }
}
