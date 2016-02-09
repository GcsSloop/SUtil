# SUtils
[![License](https://img.shields.io/badge/license-Apache%202-green.svg)](https://www.apache.org/licenses/LICENSE-2.0)
[![Maven Central](https://img.shields.io/bintray/v/gcssloop/maven/sutil.svg)](https://bintray.com/gcssloop/maven/sutil/view)
## Sloop的工具箱
### 作者微博: [@攻城师sloop](http://weibo.com/5459430586)

# 如何添加
### Gradle
#### 1.在Project的build.gradle 中添加仓库地址
```
 //sloop的仓库地址
  maven {url "http://dl.bintray.com/gcssloop/maven"}
```
#### 2.在Module目录下的build.gradle中添加依赖
```
    //sutil
    compile 'com.sloop.utils:sutil:1.0.1'
```

# 内容说明
 包名 | 工具 | 描述 
 ---  | ---  | ---
[com.sloop.adapter.utils](https://github.com/GcsSloop/SUtils/tree/master/Code/com/sloop/adapter/utils) | [CommonAdapter](https://github.com/GcsSloop/SUtils/blob/master/Code/com/sloop/adapter/utils/CommonAdapter.java)| ListView万能适配器
 | [ViewHolder](https://github.com/GcsSloop/SUtils/blob/master/Code/com/sloop/adapter/utils/ViewHolder.java)| ViewHolder
[com.sloop.animation](https://github.com/GcsSloop/SUtils/tree/master/Code/com/sloop/animation) | [Rotate3dAnimation](https://github.com/GcsSloop/SUtils/blob/master/Code/com/sloop/animation/Rotate3dAnimation.java) | 3D翻转动画
[com.sloop.async.utils](https://github.com/GcsSloop/SUtils/tree/master/Code/com/sloop/async/utils) | [SHandler](https://github.com/GcsSloop/SUtils/blob/master/Code/com/sloop/async/utils/SHandler.java) | 回调函数
[com.sloop.io.utils](https://github.com/GcsSloop/SUtils/tree/master/Code/com/sloop/io/utils) | [CloseUtils](https://github.com/GcsSloop/SUtils/blob/master/Code/com/sloop/io/utils/CloseUtils.java) | 关闭函数
 | [FileUtils](https://github.com/GcsSloop/SUtils/blob/master/Code/com/sloop/io/utils/FileUtils.java) | 文件夹工具
 | [StreamUtils](https://github.com/GcsSloop/SUtils/blob/master/Code/com/sloop/io/utils/StreamUtils.java) | 数据流工具
[com.sloop.net.utils](https://github.com/GcsSloop/SUtils/tree/master/Code/com/sloop/net/utils) | [WiFiUtils](https://github.com/GcsSloop/SUtils/blob/master/Code/com/sloop/net/utils/WiFiUtils.java) | WIFI相关工具
[com.sloop.utils](https://github.com/GcsSloop/SUtils/tree/master/Code/com/sloop/utils) | [ActivityUtils](https://github.com/GcsSloop/SUtils/blob/master/Code/com/sloop/utils/ActivityUtils.java) | Activity相关工具
 | [AppUtils](https://github.com/GcsSloop/SUtils/blob/master/Code/com/sloop/utils/AppUtils.java) | Application相关工具
 | [DataCheck](https://github.com/GcsSloop/SUtils/blob/master/Code/com/sloop/utils/DataCheck.java) | 数据检查
 | [MathUtils](https://github.com/GcsSloop/SUtils/blob/master/Code/com/sloop/utils/MathUtils.java) | 数学工具
 | [ToastUtils](https://github.com/GcsSloop/SUtils/blob/master/Code/com/sloop/utils/ToastUtils.java) | Toast工具
[com.sloop.view.utils](https://github.com/GcsSloop/SUtils/tree/master/Code/com/sloop/view/utils) | [DensityUtils](https://github.com/GcsSloop/SUtils/blob/master/Code/com/sloop/view/utils/DensityUtils.java) | 屏幕密度相关工具
 | [ViewUtils](https://github.com/GcsSloop/SUtils/blob/master/Code/com/sloop/view/utils/ViewUtils.java) | 视图相关工具

