package easy;

import sun.util.calendar.BaseCalendar;
import sun.util.calendar.CalendarDate;
import sun.util.calendar.CalendarSystem;
import sun.util.calendar.CalendarUtils;

import java.util.Calendar;
import java.util.Date;

/**
 * @author 喻浩
 * @create 2020-02-05-10:56
 */
public class day_of_the_week_1185 {
    /**
     * question url:https://leetcode-cn.com/problems/day-of-the-week/
     * question context :
     * 给你一个日期，请你设计一个算法来判断它是对应一周中的哪一天。
     *
     * 输入为三个整数：day、month 和 year，分别表示日、月、年。
     *
     * 您返回的结果必须是这几个值中的一个 {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}。
     */
    class Solution {
        public String dayOfTheWeek(int day, int month, int year) {
            String[] arr =  { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (isLeapYear(year)){
                month_days[1] = 29;
            }

            int days = 0;
                        
            for (int i = 1971; i < year; i++) {
                if (isLeapYear(i)){
                    days+=366;
                }else {
                    days+=365;
                }
            }

            for (int i = 0; i < month - 1; i++) {
                days += month_days[i];
            }
            
            days+= day;

            return arr[(days%7+4)%7];
        }
        
        private boolean isLeapYear(int year){
            return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        }
    }
    
    public static void main(String[] args) {
        day_of_the_week_1185 day_of_the_week_1185 = new day_of_the_week_1185();
        System.out.println(day_of_the_week_1185.new Solution().dayOfTheWeek(31, 8, 2019));
        
    }
}
