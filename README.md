# MyDemo

1、a lot of java demo in it.

2、web项目路径：/MyDemo/index.html


1,
文件：
搜索关键字： Ctrl+H
查找Java类： Ctrl+Shift+T
查找文件： Ctrl+Shift+R

2，
方法：
查找方法被哪些类引用： Ctrl+Alt+H
一个类文件中查找持有那些方法： Ctrl + O
变量、方法,类概览:Ctrl+Shift+G

3,
全大写： Ctrl+Shift+X
全小学： Ctrl+Shift+Y

1,BufferedWriter中的缓冲区问题:
https://blog.csdn.net/a15994269853/article/details/39054371

BufferedReader输入流不需要清空缓冲区，而BufferedWriter需要清空缓冲区。
原因是：当BufferedReader在读取文本文件时，会先尽量从文件中读入字符数据并置入缓冲区，而之后若使用read()方法，会先从缓冲区中进行读取，如果缓冲区数据不足，
才会再从文件中读取。清不清空BufferedReader的缓冲区都对文件本身没什么影响，清了还影响速度。


第一种：缓冲区满了，缓冲区里面的数据会自动进入到目的地中
第二种：缓冲区没有满，这个时候又不将数据进行刷新，那么数据不会自动进入到目的地中


2,
N.

3,node.js




5,
in和or的效率，取决目标条件列是否有索引或者是否是主键，如果有索引或者主键性能没啥差别，如果没有索引，in的性能要远远优于or

6，
java中List和ArrayList的区别
https://blog.csdn.net/erlian1992/article/details/51298276


7,DB2 delete column need to run this command.
Alter table CCCECD DROP COLUMN DEATHCAUSE;
select * from CCCECD;
call sysproc.admin_cmd('reorg table CCCECD')

8,
https://app.diagrams.net/
useful online diagram tool

