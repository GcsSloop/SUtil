package com.sloop.utils;

/**
 * 数据检查
 * Sloop 创建于 2015/10/21. 
 * <ul type="disc">
 * <li><a href="http://www.sloop.icoc.cc"    target="_blank">作者网站</a>      </li>
 * <li><a href="http://weibo.com/5459430586" target="_blank">作者微博</a>      </li>
 * <li><a href="https://github.com/GcsSloop" target="_blank">作者GitHub</a>   </li>
 * </ul>
 */
public class DataCheck {

    /**
     * 验证密码是否符合规则（6到16位的数字或者字母）
     * @param password		需要校验的密码
     * @return				true(正确)		false(不正确)
     */
    public static boolean checkPassword(String password) {
        String regex = "[\\w]{6,16}";
        return password.matches(regex);
    }

    /**
     * 验证邮箱是否正确
     * @param email		邮箱地址
     * @return			true(正确)		false(不正确)
     */
    public static boolean checkMail(String email) {
        //数字或者字母或者_出现3到12次 @ 数字或者字母出现一次或多次 (.字母出现一次或多次)出现1次到5次
        String reg = "[\\w]{3,20}@[\\w&&[^_]]+(\\.[a-zA-Z]+){1,5}";
        return email.matches(reg);
    }
}
