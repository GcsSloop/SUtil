package com.sloop.io.utils;

import java.io.Closeable;

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
public class CloseUtils {
    private CloseUtils() {
    }

    /**
     * 关闭Closeable对象
     *
     * @param closeable 可关闭的对象
     */
    public static void closeQuietly(Closeable closeable) {
        if (null != closeable) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
