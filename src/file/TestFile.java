package file;
import java.io.File;
public class TestFile {
    public static void main(String[] args) {
        File f = new File("c:/windows");
        File[] fs = f.listFiles();
        int min = 0;
        int max = 0;
        for(int i = 1;i < fs.length; i++){
            if(fs[i].length()<fs[min].length()&&fs[i].length()!=0)
                min = i;
            if(fs[i].length()>fs[max].length())
                max = i;
        }
        System.out.println("最大的文件："+fs[max].getName());
        System.out.println("最小的文件："+fs[min].getName());

    }
}
