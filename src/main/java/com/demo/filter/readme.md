# 过滤器(Filter)

过滤器实际上就是对web资源进行拦截，做一些处理后再交给下一个过滤器或servlet处理
通常都是用来拦截request进行处理的，也可以对返回的response进行拦截处理。

需要注意的是
过滤器是在服务器启动时就会创建的，只会创建一个实例，常驻内存，也就是说服务器一启动就会执行Filter的init(FilterConfig config)方法.
当Filter被移除或服务器正常关闭时，会执行destroy方法。

spring boot 实现filter方式：
https://www.cnblogs.com/yoyotl/p/10853499.html