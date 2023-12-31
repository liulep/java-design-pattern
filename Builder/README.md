## 建造者模式(Builder)

### 一、概述

讲一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。

### 二、适用性

1.当构建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时

2.当构建过程必须允许被构建的对象有不同的表示时

### 三、 参与者

1. Builder：为创建一个Product对象的各个部件指定抽象接口
2. ConcreteBuilder： 实现Builder的接口以构造和装配该产品的各个部件。定义并明确它所创建的表示，提供一个检索产品的接口。
3. Director： 构建一个使用Builder接口的对象。
4. Product：表示被构建的复杂对象。ConcreteBuilder创建该产品的内部表示并定义它的装配过程，包含定义组成部件的类，包括将这些部件装配成最终产品的接口。

### 四、类图

![image-20231111204801057](https://images.liulep.com/img/2023/11/11/654f781030283.png)