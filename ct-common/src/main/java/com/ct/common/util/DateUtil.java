package com.ct.common.util;
/*
*日期工具类
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    /*将字符串按指定格式解析为日期对象 */
    public static Date parse(String dateString, String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date =null;
        try {
            date = sdf.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    // 日期格式化为字符串
    public static String format(Date  date, String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }
}
