package com.sloop.utils;

/**
 * <ul type="disc">
 * <li>Author: Sloop</li>
 * <li>Version: v1.0.0</li>
 * <li>Copyright: Copyright (c) 2015</li>
 * <li>Date: 2016/1/9</li>
 * <li><a href="http://www.sloop.icoc.cc"    target="_blank">作者网站</a>      </li>
 * <li><a href="http://weibo.com/5459430586" target="_blank">作者微博</a>      </li>
 * <li><a href="https://github.com/GcsSloop" target="_blank">作者GitHub</a>   </li>
 * </ul>
 */
public class MathUtils {
    private MathUtils() {
    }

    /**
     * 角度转弧度
     *
     * @param angle 角度
     * @return 弧度
     */
    public static double angle2Radian(double angle) {
        return angle / 180 * Math.PI;
    }

    /**
     * 弧度转角度
     *
     * @param radian 弧度
     * @return 角度
     */
    public static double radian2Angle(double radian) {
        return radian / Math.PI * 180;
    }
}
