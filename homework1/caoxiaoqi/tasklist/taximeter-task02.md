# 计价器（Taximeter）

## 任务2 - 两公里到八公里以内。

### AC:

1. 两公里到八公里之间，每公里0.8元。满足一下公式。

	```
	2 < distance < 8, price per kilometer = 0.8

	charge = 6 + (distance - 2) * 0.8
	```
	例如：

	```
	distance = 3;
	charge = 6 + (3 - 2) * 0.8 = 6.8
	```