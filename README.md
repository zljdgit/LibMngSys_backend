# AI图书馆管理系统开源文档

>作者：[赵林均]
>
>[前端地址](https://github.com/zljdgit/LibMngSys)
> 
>[后端地址](https://github.com/zljdgit/LibMngSys_backend)

Language：**[English](README_en.md)**| **[中文](README.md).**

## ☀️项目简介
**AI图书管理系统**是一个融合AI模型和数据分析技术的图书推荐与管理平台。该系统不仅能够根据用户偏好进行图书的精准推荐，还提供了基于AIGC技术的在线借阅量分析BI图表功能，具备数据分析师的功能。

+ 主要使用Vue2和SpringBoot2实现


+ 采用前后端分离的模式，前端构建页面，后端作数据接口，前端调用后端数据接口得到数据，重新渲染页面


+ 后端已开启 CORS 跨域支持


+ API 认证使用 Token 认证


+ 前端在 Authorization 字段提供 Token 令牌


+ 使用 HTTP Status Code 表示状态


+ 数据返回格式使用 JSON


+ 后端采用权限拦截器进行权限校验，并检查登录情况


+ 添加全局异常处理机制，捕获异常，增强系统健壮性


+ 前端用 Echarts 可视化库实现了图书借阅的分析图标（折线图、饼图），并通过 Loading 配置提高加载体验


+ 引入 knife4j 依赖，使用 Swagger + Knife4j 自动生成 OpenAPI 规范的接口文档，前端可以在此基础上使用插件自动生成接口请求代码，降低前后端协作成本


+ 使用 ElementUI 组件库进行前端界面搭建，快速实现页面生成，并实现了前后端统一权限管理，多环境切换等能力


+ 基于 MyBatis Plus 框架的 QueryWrapper 实现对 MySQL 数据库的灵活查询，并配合 MyBatisX 插件自动生成后端 CRUD 基础代码，减少重复工作


+ 项目权限控制分别为：用户借阅，图书管理员，系统管理员


+ 开发工具：IDEA2023.2.2

用户账号密码： user 123456

图书管理员账号密码: admin 123456

系统管理员账号密码: root 123456

## ☀️部署方式
### 前端部署
1）点击克隆/下载项目

2）打开前端页面，配置 Configuration、 Node 环境和包管理工具（本项目是Npm）

3）直接点击 dev 的运行，或者打开控制台，输入 npm run serve 即可成功启动前端项目。

### 后端部署、
1）点击克隆/下载项目

2）导入数据库文件：先建立一个名为 bms_boot 的数据库，然后右键点击运行 SQL 文件即可（运行成功，无报错后，重新打开数据库，检查是否有数据，如果有数据，表明导入成功）

3）用 IDEA 打开后端项目，找到 application-dev.yml 文件，修改其中的 MySQL 配置，保证用户名和密码正确

4）导入 Maven 依赖（建议选择3.8以上的版本）

5）找到 SpringBoot 启动类（建议用 Debug 模式启动项目，更好排查错误）

## ☀️相关技术与版本

### 前端

| **技术**                     | **作用**                                                     | **版本**                                             |
| ---------------------------- | ------------------------------------------------------------ | ---------------------------------------------------- |
| Vue                          | 提供前端交互                                                 | 2.6.14                                               |
| Vue-Router                   | 路由式编程导航                                               | 3.5.1                                                |
| Element-UI                   | 模块组件库，绘制界面                                         | 2.4.5                                                |
| Axios                        | 发送ajax请求给后端请求数据                                   | 1.2.1                                                |
| core-js                      | 兼容性更强，浏览器适配                                       | 3.8.3                                                |
| swiper                       | 轮播图插件（快速实现)                                        | 3.4.2                                                |
| vue-baberrage                | vue弹幕插件(实现留言功能)                                    | 3.2.4                                                |
| vue-json-excel               | 表格导出Excel                                                | 0.3.0                                                |
| html2canvas+jspdf            | 表格导出PDF                                                  | 1.4.1 2.5.1                                          |
| node-polyfill-webpack-plugin | webpack5中移除了nodejs核心模块的polyfill自动引入             | 2.0.1                                                |
| default-passive-events       | **Chrome** 增加了新的事件捕获机制 **Passive Event Listeners**（被动事件侦听器) | 让页面滑动更加流畅，主要用于提升移动端滑动行为的性能 |
| nprogress                    | 发送请求显示进度条(人机交互友好)                             | 0.2.0                                                |
| echarts                      | 数据转图标的好工具(功能强大)                                 | 5.4.1                                                |
| less lessloader              | 方便样式开发                                                 | 4.1.3 11.1.0                                         |

### 后端

| **技术及版本**                       | **作用**                                                     | **版本**                          |
| ------------------------------------ | ------------------------------------------------------------ | --------------------------------- |
| SpringBoot                           | 应用开发框架                                                 | 2.7.8                             |
| JDK                                  | Java 开发包                                                  | 1.8                               |
| MySQL                                | 提供后端数据库                                               | 8.0.23                            |
| MyBatisPlus                          | 提供连接数据库和快捷的增删改查                               | 3.5.1                             |
| SpringBoot-Configuration-processor   | 配置处理器 定义的类和配置文件绑定一般没有提示，因此可以添加配置处理器，产生相对应的提示. |                                   |
| SpringBoot-Starter-Web               | 后端集成Tomcat MVC                                           | 用于和前端连接                    |
| SpringBoot-starter-test              | Junit4单元测试前端在调用接口前，后端先调用单元测试进行增删改查，注意Junit4和5的问题，注解@RunWith是否添加 |                                   |
| Lombok                               | 实体类方法的快速生成 简化代码                                |                                   |
| mybatis-plus-generator               | 代码生成器                                                   | 3.5.1                             |
| MyBatisX                             | MyBatisPlus插件直接生成mapper,实体类,service                 |                                   |
| jjwt                                 | token工具包                                                  | 0.9.0                             |
| fastjson                             | 阿里巴巴的 JSON 工具类                                       | 1.2.83                            |
| hutool                               | hutool工具包(简化开发工具类)                                 | [文档](https://hutool.cn/docs/#/) |
| knife4j-openapi2-spring-boot-starter | Knife4j 在线接口文档测试工具                                 | 4.0.0                             |
| gson                                 | 谷歌的 JSON 工具类                                           | 2.8.5                             |
| Java-WebSocket                       | 讯飞星火 AI 配置                                             | 1.3.8                             |
| okhttp                               | 讯飞星火 AI 配置                                             | 4.10.0                            |
| okio                                 | 讯飞星火 AI 配置                                             | 2.10.0                            |
| jsoup                                | 简易爬虫工具                                                 | 1.15.3                            |
| guava                                | 谷歌工具类                                                   | 30.1-jre                          |
| spring-boot-starter-data-redis       | Redis 的 Starter                                             |                                   |
| broadscope-bailian-sdk-java          | 阿里云 AI 模型                                               | 1.1.7                             |
| spring-boot-starter-websocket        | WebSocket 的 Starter                                         |                                   |
