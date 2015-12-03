# homework
每节课的作业都提交到这个仓库里

每一课都对应了一个目录，比如`homework1`, `homework2`等等。大家在每一个目录下，以自己的名字创建一个目录，代码放在里面，提交上来。

比如我的就是：

```
homework1
  |- lipeng
       |- taximeter.txt

homework2
  |- lipeng
       |- length
           |- src
               |- java

```

## 如何review

欢迎大家对各种同学的代码进行review。请点开[pull request](https://github.com/tw-oocamp-201512/homework/pulls)页面，对大家的pull request进行点评。

注意：由于操作不当，有一些还没有review的pull request被merge了。

1. 不论是Open还是Closed中的pull request，只要标记有"please-review-me" label的，都可以被review
2. 如果某个pull request后面标记了"invalid-and-ignore-me"或者"review-complete"，则不需要再被review

每个pull request上还标记了属于哪个作业，作业的要求在下面。

最后非常感谢大家的review

## homework1

出租车计价问题：

> 我们考虑出租车计价问题，出租车的运价是每公里0.8元，八公里起会加收50%的每公里运价，起步价是两公里以内6块，停车等待时加收每分钟0.25元，最后计价的时候司机会四舍五入只收块块钱。

1. 基本要求：请对它进行TDD前的tasking
2. 进阶要求：使用TDD的方式实现其功能

## homework2

设计一个长度类库，使它可以计算这样的计算公式

```
1m / 4 + 10cm * 3 – 5mm
```

其结果可以为 `545mm` 或者 `54.5cm` 或者 `0.545m`之一

注意：

1. 我们不需要对前面的计算公式只是一个例子，不需要对它进行词法解析，只要你能通过调用自己的类库计算出来它的结果就行。这个举个可能的例子：`new Length(1, "m").divide(4)`可以计算`1m/4`。注意这只是举例，你完全可以自己来设计API
2. 两个`double`数据类型在某些情况下相比可能是不正确的，比如`0.11 == 1.1/10`可能为false。但我们这个题目为了简单起见，假设我们是可以这样比较的。你在测试中可以避开失败的数字，只使用成功的数字
