# 计价器（Taximeter）

## 任务4 - 停车等待。

### AC:

第一种：

1. 当等待时间为0时，等待费用为0, 所以最后的价格等于原始价格。

	```
	waiting time == 0;
	charge = original charge
	```
2. 当有等待时间时，每分钟0.25元。最后的价格为原始价格加上等待价格。

	```
	waiting time > 0;
	waiting charge = waiting time * 0.25;
	charge = original charge + waiting charge
	       = original charge + waiting time * 0.25
	```
	例如：

	```
	waiting time = 10;
	original charge = 20;
	charge = 20 + 10 * 0.25 = 22.5
	```