# SUtils
[![License](https://img.shields.io/badge/license-Apache%202-green.svg)](https://www.apache.org/licenses/LICENSE-2.0)
[![JitPack](https://jitpack.io/v/GcsSloop/SUtil.svg)](https://jitpack.io/#GcsSloop/SUtil)

## Sloop的工具箱
### 作者微博: [@GcsSloop](http://weibo.com/GcsSloop)

# 如何添加
### Gradle
#### 1.在Project的build.gradle 中添加仓库地址
``` gradle
 // JitPack仓库地址
 maven { url "https://jitpack.io" }
```

示例：
``` gradle
allprojects {
    repositories {
        jcenter()
        // JitPack仓库地址
        maven { url "https://jitpack.io" }
    }
}
```
#### 2.在Module目录下的build.gradle中添加依赖
```gradle
    //sutil
    compile 'com.github.GcsSloop:SUtil:v1.0.2'
```

示例:
 ``` gradle
dependencies {
    compile fileTree(dir: 'libs', include: ['*.jar'])
    testCompile 'junit:junit:4.12'
    compile 'com.android.support:appcompat-v7:23.0.1'
    //sutil
    compile 'com.github.GcsSloop:SUtil:v1.0.1'
}
```

# 内容说明

 包名                   | 工具 | 描述 | 所需权限
 -----------------------|------|------|---------
com.sloop.adapter.utils | [CommonAdapter](https://github.com/GcsSloop/SUtil/blob/master/library/src/main/java/com/sloop/adapter/utils/CommonAdapter.java)     | ListView万能适配器        | 
                        | [ViewHolder](https://github.com/GcsSloop/SUtil/blob/master/library/src/main/java/com/sloop/adapter/utils/ViewHolder.java)           | ViewHolder                |
com.sloop.animation     | [Rotate3dAnimation](https://github.com/GcsSloop/SUtil/blob/master/library/src/main/java/com/sloop/animation/Rotate3dAnimation.java) | 3D翻转动画                |
                        | [AnimationListener](https://github.com/GcsSloop/SUtil/blob/master/library/src/main/java/com/sloop/animation/AnimationListener.java) | 动画监听器默认实现类      |
                        | [AnimatorListener](https://github.com/GcsSloop/SUtil/blob/master/library/src/main/java/com/sloop/animation/AnimatorListener.java)   | 属性动画监听器默认实现类  |
com.sloop.async.utils   | [SHandler](https://github.com/GcsSloop/SUtil/blob/master/library/src/main/java/com/sloop/async/utils/SHandler.java)                 | 回调函数                  |
com.sloop.io.utils      | [CloseUtils](https://github.com/GcsSloop/SUtil/blob/master/library/src/main/java/com/sloop/io/utils/CloseUtils.java)                | 关闭函数                  |
                        | [FileUtils](https://github.com/GcsSloop/SUtil/blob/master/library/src/main/java/com/sloop/io/utils/FileUtils.java)                  | 文件夹工具                | 存储卡读取(READ_EXTERNAL_STORAGE) <br/> 存储卡写入(WRITE_EXTERNAL_STORAGE)
                        | [StreamUtils](https://github.com/GcsSloop/SUtil/blob/master/library/src/main/java/com/sloop/io/utils/StreamUtils.java)              | 数据流工具                |
com.sloop.net.utils     | [NetUtils](https://github.com/GcsSloop/SUtil/blob/master/library/src/main/java/com/sloop/net/utils/NetUtils.java)                   | 网络相关工具              | 网络访问(INTERNET) <br/> 查看网络状态(ACCESS_NETWORK_STATE)
com.sloop.utils         | [ActivityUtils](https://github.com/GcsSloop/SUtil/blob/master/library/src/main/java/com/sloop/utils/ActivityUtils.java)             | Activity相关工具          |
                        | [AppUtils](https://github.com/GcsSloop/SUtil/blob/master/library/src/main/java/com/sloop/utils/AppUtils.java)                       | Application相关工具       |
                        | [DataCheck](https://github.com/GcsSloop/SUtil/blob/master/library/src/main/java/com/sloop/utils/DataCheck.java)                     | 数据检查                  |
                        | [MathUtils](https://github.com/GcsSloop/SUtil/blob/master/library/src/main/java/com/sloop/utils/MathUtils.java)                     | 数学工具                  |
                        | [ToastUtils](https://github.com/GcsSloop/SUtil/blob/master/library/src/main/java/com/sloop/utils/ToastUtils.java)                   | Toast工具                 |
com.sloop.view.utils    | [DensityUtils](https://github.com/GcsSloop/SUtil/blob/master/library/src/main/java/com/sloop/view/utils/DensityUtils.java)          | 屏幕密度相关工具          |
                        | [ViewUtils](https://github.com/GcsSloop/SUtil/blob/master/library/src/main/java/com/sloop/view/utils/ViewUtils.java)                | 视图相关工具              |

## 版本更新：
版本号 | 更新内容
:-----:| ------------
v1.0.2 | 为通用适配器增加追加数据功能，删除WiFiUtils，添加NetUtils
v1.0.1 | 降低minSdkVersion,提高兼容性
v1.0.0 | 从jCenter迁移到JitPack,以前版本作废



## About Me

<a href="https://github.com/GcsSloop/SloopBlog/blob/master/FINDME.md" target="_blank"> <img src="http://ww4.sinaimg.cn/large/005Xtdi2gw1f1qn89ihu3j315o0dwwjc.jpg" width=300 height=100 /> </a>

# License
```
Copyright (c) 2016 GcsSloop

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

