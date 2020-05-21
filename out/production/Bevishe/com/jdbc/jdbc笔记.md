# JDBC笔记
java database connectivity   
Jdbc: 官方（sun公司）定义好了操作所有关系型数据库的规则（接口）。然后各个数据库厂商去实现这套接口，提供数据库驱动jar包，
我们可以使用这套接口编程，真正执行的代码是驱动jar包中的实现类。   
### 使用步骤：
* 导入驱动jar包   
    1.复制jar包到项目lib文件下面   
    2.右键 add as library
* 注册驱动  
* 获取数据库的连接对象Connection  
* 定义sql
* 获取执行sql语句对的对象Statement
* 处理结果
* 释放资源
----
