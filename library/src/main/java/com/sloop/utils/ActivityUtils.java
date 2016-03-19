package com.sloop.utils;

import android.app.ActivityManager;
import android.content.Context;

import java.util.List;

/**
 * Author: Sloop
 * Version: v1.0
 * Date: 2015/11/12
 * <ul type="disc">
 * <li><a href="http://www.sloop.icoc.cc"    target="_blank">作者网站</a>      </li>
 * <li><a href="http://weibo.com/5459430586" target="_blank">作者微博</a>      </li>
 * <li><a href="https://github.com/GcsSloop" target="_blank">作者GitHub</a>   </li>
 * </ul>
 */
public class ActivityUtils {
    /**
     * 判断程序是否处于后台
     *
     * @param context 上下文
     * @return true表示程序当前处于后台，false表示程序当前处于前台
     */
    public static boolean isBackground(Context context) {

        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> appProcesses = activityManager.getRunningAppProcesses();

        for (ActivityManager.RunningAppProcessInfo appProcess : appProcesses) {
            if (appProcess.processName.equals(context.getPackageName())) {
                if (appProcess.importance == ActivityManager.RunningAppProcessInfo.IMPORTANCE_BACKGROUND) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}
