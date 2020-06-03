package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        Date now = c.getTime();
        System.out.println("当前时间是："+sdf.format(c.getTime()));
        c.setTime(now);
        c.add(Calendar.MONTH,2);
        c.set(Calendar.DATE,-3);
        System.out.println("下个月的倒数第三天是："+sdf.format(c.getTime()));
        //
    }
}
