# Open source documentation for AI library management system

>作者：[Linjun Zhao](https://luoye6.github.io/)
>
>[Front end address](https://github.com/zljdgit/LibMngSys)
>
>[Backend address](https://github.com/zljdgit/LibMngSys_backend)

Language：**[English](README_en.md)**| **[中文](README.md).**

## ☀️Introduction

**AI library management system** is a book recommendation and management platform that integrates AI models and data analysis techniques. This system not only provides accurate book recommendations based on user preferences, but also offers an online borrowing volume analysis BI chart function based on AIGC technology, with the function of a data analyst.

+ Mainly implemented using Vue2 and SpringBoot2


+ Adopting a front-end and back-end separation mode, the front-end builds the page, the back-end serves as the data interface, the front-end calls the back-end data interface to obtain data, and re renders the page


+ The backend has enabled CORS cross domain support


+ API authentication using Token authentication


+ The front-end provides a Token token in the Authorization field


+ Using HTTP Status Code to represent status


+ Use JSON for data return format


+ The backend uses permission interceptors for permission verification and checks login status


+ Add a global exception handling mechanism to capture exceptions and enhance system robustness


+ The front-end uses the Echarts visualization library to implement analysis icons (line charts, pie charts) for book borrowing, and improves the loading experience through loading configuration


+ Introduce the knife4j dependency and use Swagger+Knife4j to automatically generate interface documents for the OpenAPI specification. The front-end can use plugins to automatically generate interface request codes based on this, reducing the cost of front-end and back-end collaboration


+ Using the ElementUI component library for front-end interface construction, quickly generating pages, and achieving unified permission management and multi environment switching capabilities for both front-end and back-end


+ QueryWrapper based on MyBatis Plus framework for flexible querying of MySQL database, combined with MyBatisX plugin to automatically generate backend CRUD basic code, reducing duplicate work


+ The project permission controls are: user borrowing, librarian, and system administrator


+ Development tool: IDEA2023.2.2

User account password: user 123456

Librarian account password: admin 123456

System administrator account password: root 123456


## ☀️ Deployment method
### Front end deployment
1) Click on Clone/Download Project


2) Open the front-end page, configure Configuration Node environment and package management tool (this project is Npm)


3) Simply click on the run of dev or open the console and enter npm run serve to successfully launch the front-end project.

### Backend deployment
1) Click on Clone/Download Project


2) Import database file: First, create a database named bms_boot, then right-click to run the SQL file (run successfully, no errors, reopen the database, check for data, if there is data, it indicates successful import)


3) Open the backend project using IDEA, locate the application dev.yml file, modify the MySQL configuration, and ensure that the username and password are correct


4) Import Maven dependencies (it is recommended to choose version 3.8 or higher)


5) Find the SpringBoot startup class (it is recommended to start the project in Debug mode for better troubleshooting)


## ☀️Related technologies and versions

### Front End

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
