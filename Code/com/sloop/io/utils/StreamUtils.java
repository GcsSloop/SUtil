package com.sloop.io.utils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 数据流工具类
 * Author: Sloop
 * Version: v1.2
 * Date: 2015/11/10
 * <ul type="disc">
 * <li><a href="http://www.sloop.icoc.cc"    target="_blank">作者网站</a>      </li>
 * <li><a href="http://weibo.com/5459430586" target="_blank">作者微博</a>      </li>
 * <li><a href="https://github.com/GcsSloop" target="_blank">作者GitHub</a>   </li>
 * </ul>
 */
public class StreamUtils {
    private StreamUtils() {
    }

    /**
     * 将输入流转化为字符串
     *
     * @param is     输入流
     * @param encode 编码格式
     * @return 字符串
     * @throws IOException IO异常
     */
    public static String readStream(InputStream is, String encode) throws IOException {
        return new String(readStream(is), encode);
    }

    /**
     * 将输入流转化为Byte数组
     *
     * @param is 输入流
     * @return byte数组
     * @throws IOException IO异常
     */
    public static byte[] readStream(InputStream is) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buff = new byte[1024];
        int len = 0;
        while ((len = is.read(buff)) != -1) {
            baos.write(buff, 0, len);
        }
        byte[] result = baos.toByteArray();
        is.close();
        baos.close();
        return result;
    }


}
