package chapter5_ArrayWithString;

public @interface 数组的概念 {
    /*
    在Java中，数组是具有相同数据类型的有序数据的集合，它是一个对象。
    这些数据使用统一标识符作为数组名；数组中的每个数据称为数组元素，可通过下标来访问。下标从0开始，到数组length-1截止

    数组分为一维数组和多为数组。

 一维数组
        在java中，数组和变量有所不同，必须先声明并初始化后才能使用它。
    一维数组的声明：  数据类型[] 数组名;
                        数据类型 数组名[];

        解释说明：
        数据类型可以是简单数据类型或复合数据类型。
        []表示声明的是数组，其个数表示数组的维度，它可以放在数据类型右侧或数组名右侧。
        数组名应为合法的标识符。
        e.g.  char[] charArray;
              char charArray[];
     一维数组的初始化：
        数组声明后需要初始化后才能使用，通过初始化可以为数组分配内存空间、或者为数组元素赋值。数组初始化又分为静态初始化和动态初始化。

       1、静态初始化  数据类型[] 数组名 = {元素1初值，元素2初值，元素3初值...}
                    e.g. int[] years = {1987,2008,2020}
            静态初始哈数组时，无需指定数组的大小，系统会自动根据元素的个数自动算出数组的长度，并分配相应的内存空间。
            静态初始化元素适用于元素个数不多或可列举的情况。

       2、动态初始化    数据类型[] 数组名;
                      数组名 = new 数据类型[数组长度];
                      声明和初始化可以写在一行 ： 数据类型[] 数组名 = new 数据类型[数组长度];
                      int[] salary = new int[4];
             new关键字用来为数组分配内存空间。
             数组长度应为整型常量或表达式。
         当数组创建后，每个数组元素都将自动化为一个默认值：
         整型数组默认都是 0、boolean数组默认都是false char数组默认都是'\u0000'，复合类型数组都默认为null


      一维数组的使用：
        当数组创建并初始化后，就可以使用数组中的各个元素了。其语法格式如下
                         数组名[数组下标];
           数组下标能用来唯一标识数组中的每一个元素、它可以时整数或表达式。
           在Java中，所有数组下标都是从0开始到数组长度-1结束。如 name[0] name[1]
           数组对象内置了length属性表示数组的长度。
     */
}
