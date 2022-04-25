<h1 align="center"> 语聊房 </h>

<p align="center">

<a href="https://github.com/rongcloud-community/rongcloud-scene-voice-room-android">
<img src="https://img.shields.io/cocoapods/l/RCSceneChatroomKit.svg?style=flat">
</a>

<a href="https://github.com/rongcloud-community/rongcloud-scene-voice-room-android">
<img src="https://img.shields.io/badge/%20in-java%2011-orange.svg">
</a>

</p>

## 简介

语聊房 demo 是融云场景化团队提供的开源项目，其中包含了主流业务常见的开播、连麦、麦位管理、房间管理等功能。

## 集成

- 方式一：克隆项目到本地，该项目包含了子工程，执行 `git clone` 时在最后添加 `--recurse-submodules`

  `git clone https://github.com/rongcloud-community/rongcloud-scene-voice-room-android.git --recurse-submodules`

- 方式二：下载项目

	1. [下载主项目源码](https://github.com/rongcloud-community/rongcloud-scene-voice-room-android.git)
	2. [下载公共组件仓库源码](https://github.com/rongcloud-community/rongcloud-scene-common-android)
	3. 将公共仓库源码放到主项目 `scene-common` 文件夹下

## 功能

模块           |  简介 |  示图
:-------------------------:|:-------------------------:|:-------------------------:
<span style="width:200px">开启直播</span> | 主播说话，观众收听，聊天室消息发送和展示，<br />支持房间内观众连麦，支持最多 8 个观众连麦  |  <img width ="200" src="https://tva1.sinaimg.cn/large/e6c9d24ely1h182tc468fj20af0ijq4a.jpg">
房间音乐 | 基于 Hifive 实现音乐播放，需开通相关业务  |  <img width="200" src="https://tva1.sinaimg.cn/large/e6c9d24ely1h182xszyydj20af0ijq3v.jpg">
赠送礼物 | 支持单人、多人、全服礼物发送，需二次开发对接业务  |  <img width ="200" src="https://tva1.sinaimg.cn/large/e6c9d24ely1h182u9yw13j20af0ij0tq.jpg">
房间设置 | 包含常见的房间信息管理  |  <img width ="200" src="https://tva1.sinaimg.cn/large/e6c9d24ely1h182wvnukbj20af0ij75a.jpg">
跨房间PK | 支持 1v1 跨房间 PK，需要配合服务器实现  |  <img width ="200" src="https://tva1.sinaimg.cn/large/e6c9d24ely1h182xeppm1j20af0ijgmp.jpg">

## 架构

![](https://tva1.sinaimg.cn/large/e6c9d24ely1h1m07s8ruxj21i30u0q55.jpg)

## 其他

如有任何疑问请提交 issue

