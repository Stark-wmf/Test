import java.util.Date;

public class Demo3 {
    public static void main(String[] args){
        long time = System.currentTimeMillis();
        long min = time/60000;
        long hour = time/3600000;
        long day =hour/24;
        long month = day/30;
        long year = month/12;
        long currentyear = 1970+year;
        long currentmonth = month%12;
        long currentday = day%30;
        long currenthour = hour%24;
        long currentmin = min%60;

        System.out.println(currentyear+"年 . "+currentmonth+"月 . "+currentday+"日 . "+currenthour+"点 . "+currentmin+"分");

    }
}
