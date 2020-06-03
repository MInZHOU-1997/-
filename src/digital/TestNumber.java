package digital;
public class TestNumber {
    public static void main(String[] args) {
        /*String s = "Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
        int i = s.lastIndexOf("two");
        char []cs = s.toCharArray();
        cs[i] = Character.toUpperCase(cs[i]);
        String ns = new String(cs);
        System.out.println(cs);*/
        // 把最后一个two单词首字母大写
       /* String s = "Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
        int index = s.lastIndexOf(" two ");

        char[] cs = s.toCharArray();
        cs[index +1] = Character.toUpperCase(cs[index+1]);
        String result = new String(cs);
        System.out.printf(result);*/
        String str1 = "let there ";
        StringBuffer sb = new StringBuffer(str1); //根据str1创建一个StringBuffer对象
        sb.append("be light"); //在最后追加
        System.out.println(sb);
        sb.delete(4, 10);//删除4-10之间的字符
        System.out.println(sb);
        sb.insert(4, "there ");//在4这个位置插入 there
        System.out.println(sb);
        sb.reverse(); //反转
        System.out.println(sb);

    }
}
