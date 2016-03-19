package com.sloop.async.utils;

import android.os.Handler;
import android.os.Message;

/**
 * 回调函数
 * Author: Sloop
 * Version: v1.1
 * Date: 2015/11/30
 * <ul type="disc">
 * <li><a href="http://www.sloop.icoc.cc"    target="_blank">作者网站</a>      </li>
 * <li><a href="http://weibo.com/5459430586" target="_blank">作者微博</a>      </li>
 * <li><a href="https://github.com/GcsSloop" target="_blank">作者GitHub</a>   </li>
 * </ul>
 */
public abstract class SHandler<T> extends Handler {
    public static final int SUCCESS = 1;    //成功
    public static final int FAILURE = 2;    //失败

    /**
     * 执行成功时调用
     *
     * @param content 内容
     */
    public abstract void onSuccess(T content);


    /**
     * 执行失败时调用
     *
     * @param content 内容
     */
    public abstract void onFailure(T content);

    /**
     * 消息处理器
     */
    @Override
    public void handleMessage(Message msg) {
        Object content = msg.obj;
        switch (msg.what) {
            case SUCCESS:
                onSuccess((T) content);
                break;
            case FAILURE:
                onFailure((T) content);
                break;
        }
        super.handleMessage(msg);
    }

    /**
     * 发送消息函数
     *
     * @param style   类型
     * @param message 信息
     */
    public void sendMsg(int style, T message) {
        Message msg = Message.obtain();
        msg.what = style;
        msg.obj = message;
        this.sendMessage(msg);
    }
}
