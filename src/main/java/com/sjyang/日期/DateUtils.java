package com.sjyang.日期;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author saijun.yang
 * @date Created in 2019/12/9 9:32
 * @description 日期工具类
 */
public class DateUtils {
    public static void main(String[] args) {
        System.out.println(getAfterMonth("2019-02-09",1));
    }
    /**
     * 根据传入日期和月数，返回往后的日期
     * @param date
     * @param months
     * @return
     */
    public static java.sql.Date getNewDate(java.sql.Date date, int months) {
        Calendar ca = Calendar.getInstance();
        ca.setTime(date);

        ca.set(Calendar.MONTH, ca.get(Calendar.MONTH) + months);
        int yyyy = ca.get(Calendar.YEAR);
        int DD = ca.get(Calendar.DATE);
        int MM = ca.get(Calendar.MONTH);
        ca.clear();
        ca.set(yyyy, MM, DD);
        return new java.sql.Date(ca.getTime().getTime());
    }
    public static String  getAfterMonth(String inputDate,int number) {
        Calendar c = Calendar.getInstance();//获得一个日历的实例
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try{
            date = sdf.parse(inputDate);//初始日期
        }catch(Exception e){

        }
        c.setTime(date);//设置日历时间
        c.add(Calendar.MONTH,number);//在日历的月份上增加6个月
        String strDate = sdf.format(c.getTime());//的到你想要得6个月后的日期
        return strDate;
    }

}
