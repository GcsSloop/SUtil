package com.sloop.utils;

import android.app.Activity;
import android.widget.Toast;

/**
 * Toast工具
 * <ul type="disc">
 * <li>Author: Sloop</li>
 * <li>Version: v1.0.0</li>
 * <li>Copyright: Copyright (c) 2015</li>
 * <li>Date: 2015/12/24</li>
 * <li><a href="http://www.sloop.icoc.cc"    target="_blank">作者网站</a>      </li>
 * <li><a href="http://weibo.com/5459430586" target="_blank">作者微博</a>      </li>
 * <li><a href="https://github.com/GcsSloop" target="_blank">作者GitHub</a>   </li>
 * </ul>
 */
public class ToastUtils {

    /**
     * @param context Context
     * @param string  内容
     */
    public static void show(final Activity context, final String string) {
        //判断是否为主线程
        if ("main".equals(Thread.currentThread().getName())) {
            Toast.makeText(context, string, Toast.LENGTH_SHORT).show();
        } else {//如果不是，就用该方法使其在ui线程中运行
            context.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(context, string, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
