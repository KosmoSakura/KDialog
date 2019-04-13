# KDialog
封装了一个日常用的对话框组合控件，免得每次都重复造一遍轮子。

这个轮子中规中矩，没什么新意，但本人平时开发使用频率却比那些花里胡哨的的对话框用的多。

为了方便使用，便在JitPack 上做了个依赖

### 1.依赖

在根 `build.gradle`添加JitPack 依赖

```
allprojects {
	repositories {
	...
	maven { url 'https://jitpack.io' }
	}
}
```

### 2.引入

在根 `app.gradle`

```gradle
dependencies {
	implementation 'implementation 'com.github.KosmoSakura:KDialog:1.0.0'
}
```
### 3.栗子

> 展示模块可任意组合，下面列出几个常用的例子

##### 3.1.消息正文+单个按钮

```java
 UDialog
 .builder(this, "消息正文内容消息正文内容消息正文内容消息正文内容")
 .build();
```

![demo1](https://github.com/KosmoSakura/KDialog/blob/master/img/1.gif)

##### 3.2.消息正文+两个按钮

```java
 UDialog
 .builder(this, "消息正文内容消息正文内容消息正文内容消息正文内容")
 .button()
 .build();
```

![demo1](https://github.com/KosmoSakura/KDialog/blob/master/img/2.gif)

##### 3.3.消息正文+标题

```java
 UDialog
     .builder(this, "今天放假")
     .title("通知通知")
     .build();
```

![demo1](https://github.com/KosmoSakura/KDialog/blob/master/img/3.gif)

##### 3.4.消息正文+图标

```java
UDialog
    .builder(this, "上面有个圈圈")
    .icon(R.mipmap.ic_launcher_round)
    .build();
```

![demo1](https://github.com/KosmoSakura/KDialog/blob/master/img/4.gif)

##### 3.5.消息正文+输入框

```java
UDialog
	.builder(this, "输入密码")
    .input("这个是密码", true)
    .button("确定", "取消")
    .cancelClick(dia -> {
        toast("操作已取消");
        dia.dismiss();
    })
    .confirmClick((result, dia) -> {
        toast("输入密码为：" + result);
        dia.dismiss();
    })
    .build();
```

![demo1](https://github.com/KosmoSakura/KDialog/blob/master/img/5.gif)

##### 3.6.全部展示

```java
 UDialog
 	.builder(this)
     .title("我是个标题")
     .icon(R.mipmap.ic_launcher_round)
     .msg("我是消息正文")
     .input("输入点什么")
     .button("按钮一", "按钮二")
     .build();
```

![demo1](https://github.com/KosmoSakura/KDialog/blob/master/img/6.gif)

---

## License

```
   Copyright 2019 Kosmos

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