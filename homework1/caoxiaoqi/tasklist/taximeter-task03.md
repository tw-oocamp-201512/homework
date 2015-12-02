# 计价器（Taximeter）

## 任务3 - 八公里及以上。

### AC:

1. 八公里整，除了计入0.8元外，还需加收50%的运价。

	```
	distance == 8:
	price per kilometer = 0.8;
	extra charge = 0.8 * 50% = 0.4;

	charge = 6 + (8 - 2) * 0.8 + (8 - 7) * 0.8 * 50%
	       = 11.2
	```

2. 八公里外。

	```
	distance > 8:
	price per kilometer = 0.8;
	extra charge = (distance - 7) * 0.8 * 50%

	charge = 6 + (8 - 2) * 0.8 + (distance - 7) * 0.8 * 50%
	       = 10.8 + (distance - 7) * 0.4
	```
	例如：

	```
	distance = 20;
	charge = 10.8 + (20 - 7) * 0.4 = 16
	```