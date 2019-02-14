# music
音乐小站

## 图片预览
![](https://github.com/liuzhaopo/music/blob/master/docs/img/Music-Index1.png?raw=true)
![](https://github.com/liuzhaopo/music/blob/master/docs/img/Music-Index2.png?raw=true)
![](https://github.com/liuzhaopo/music/blob/master/docs/img/Music-MySQL.png?raw=true)

## 技术栈
- SpringBoot
- Freemarker
- Mybatis
- Pagehelper
- MySQL

## 使用说明
1. 创建一个空的music数据库。
2. 导入music/docs/music.sql到music数据库。
3. 修改application.yml中的password。
4. 启动com.lzhpo.music.MusicWebApplication。
5. 附加：登录网页版的网易云，自己修改play_id和play_name为自己的，status为使用状态，1为使用，0为不使用，一次只能使用一个，不能同时使用多个歌单。
6. 访问[http://localhost:8087](http://localhost:8087)
