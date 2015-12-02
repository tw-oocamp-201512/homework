# 计价器（Taximeter）

## 任务5 - 四舍五入

### AC:

1. 当没有小数时，最后的总价保持不变。

	```
	例如：charge = 10
	那么：result charge = 10
	```

2. 当最后的总价的小数部分小于0.5时，减去小数部分。

	```
	例如：charge = 10.45
	那么：result charge = 10
	```
3. 当最后的总价的小数部分大于或等于0.5时，减去小数部分后加1.

	```
	例如：charge = 10.5
	那么：result charge = 11

	例如：charge = 10.6
	那么：result charge = 11
	```