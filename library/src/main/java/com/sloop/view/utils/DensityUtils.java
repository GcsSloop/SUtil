package com.sloop.view.utils;

import android.view.ContextThemeWrapper;

/**
 * <ul type="disc">
 * <li>Author: Sloop</li>
 * <li>Version: v1.0.0</li>
 * <li>Copyright: Copyright (c) 2015</li>
 * <li>Date: 2015/12/19</li>
 * <li><a href="http://www.sloop.icoc.cc"    target="_blank">作者网站</a>      </li>
 * <li><a href="http://weibo.com/5459430586" target="_blank">作者微博</a>      </li>
 * <li><a href="https://github.com/GcsSloop" target="_blank">作者GitHub</a>   </li>
 * </ul>
 */
public class DensityUtils {
    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     *
     * @param context 上下文
     * @param dpValue dp
     * @return px
     */
    public static int dip2px(ContextThemeWrapper context, float dpValue) {
        return (int) (dpValue * getDensity(context) + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     *
     * @param context 上下文
     * @param pxValue px
     * @return dp
     */
    public static int px2dip(ContextThemeWrapper context, float pxValue) {
        return (int) (pxValue / getDensity(context) + 0.5f);
    }

    /**
     * 获取当前手机的屏幕像素密度
     *
     * @param context 上下文
     * @return 像素密度
     */
    public static float getDensity(ContextThemeWrapper context) {
        return context.getResources().getDisplayMetrics().density;
    }
}
