package com.sloop.animation;

import android.animation.Animator;
import android.annotation.TargetApi;
import android.os.Build;

/**
 * AnimatorListener默认实现类
 * <ul type="disc">
 * <li>Author: Sloop</li>
 * <li>Version: v1.0.0</li>
 * <li>Copyright: Copyright (c) 2015</li>
 * <li>Date: 2016/2/9</li>
 * <li><a href="http://www.sloop.icoc.cc"    target="_blank">作者网站</a>      </li>
 * <li><a href="http://weibo.com/5459430586" target="_blank">作者微博</a>      </li>
 * <li><a href="https://github.com/GcsSloop" target="_blank">作者GitHub</a>   </li>
 * </ul>
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class AnimatorListener implements Animator.AnimatorListener{
    @Override
    public void onAnimationStart(Animator animation) {

    }

    @Override
    public void onAnimationEnd(Animator animation) {

    }

    @Override
    public void onAnimationCancel(Animator animation) {

    }

    @Override
    public void onAnimationRepeat(Animator animation) {

    }
}
