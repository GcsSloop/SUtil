package com.sloop.view.utils;

import android.view.View;
import android.view.ViewGroup;

/**
 * 与视图相关的工具类
 * Author: Sloop
 * Version: v1.0
 * Date: 2015/12/2
 * <ul type="disc">
 * <li><a href="http://www.sloop.icoc.cc"    target="_blank">作者网站</a>      </li>
 * <li><a href="http://weibo.com/5459430586" target="_blank">作者微博</a>      </li>
 * <li><a href="https://github.com/GcsSloop" target="_blank">作者GitHub</a>   </li>
 * </ul>
 */
public class ViewUtils {


//*****测量布局相关函数********************************************************************************

    /**
     * 手动测量布局大小
     *
     * @param view   被测量的布局
     * @param width  布局默认宽度
     * @param height 布局默认高度
     *               示例： measureView(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
     */
    public static void measureView(View view, int width, int height) {
        ViewGroup.LayoutParams params = view.getLayoutParams();
        if (params == null) {
            params = new ViewGroup.LayoutParams(width, height);
        }
        int mWidth = ViewGroup.getChildMeasureSpec(0, 0, params.width);

        int mHeight;
        int tempHeight = params.height;
        if (tempHeight > 0) {
            mHeight = View.MeasureSpec.makeMeasureSpec(tempHeight, View.MeasureSpec.EXACTLY);
        } else {
            mHeight = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED);
        }
        view.measure(mWidth, mHeight);
    }

//*****设置外边距相关函数*******************************************************************************

    /**
     * 设置View的左侧外边距
     *
     * @param view 要设置外边距的View
     * @param left 左侧外边距
     */
    public static void setMarginLeft(View view, int left) {
        setMargins(view, left, 0, 0, 0);
    }

    /**
     * 设置View的顶部外边距
     *
     * @param view 要设置外边距的View
     * @param top  顶部外边距
     */
    public static void setMarginTop(View view, int top) {
        setMargins(view, 0, top, 0, 0);
    }

    /**
     * 设置View的右侧外边距
     *
     * @param view  要设置外边距的View
     * @param right 右侧外边距
     */
    public static void setMarginRight(View view, int right) {
        setMargins(view, 0, 0, right, 0);
    }

    /**
     * 设置View的底部外边距
     *
     * @param view   要设置外边距的View
     * @param bottom 底部外边距
     */
    public static void setMarginBottom(View view, int bottom) {
        setMargins(view, 0, 0, 0, bottom);
    }

    /**
     * 设置View的外边距(Margins)
     *
     * @param view   要设置外边距的View
     * @param left   左侧外边距
     * @param top    顶部外边距
     * @param right  右侧外边距
     * @param bottom 底部外边距
     */
    public static void setMargins(View view, int left, int top, int right, int bottom) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            p.setMargins(left, top, right, bottom);
            view.requestLayout();       //请求重绘
        }
    }


}
