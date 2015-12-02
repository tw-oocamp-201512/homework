# 计价器（Taximater）

## 任务1 - 两公里以内。

### AC:

1. 零公里，不收费。

	```
	distence == 0, charge = 0
	```
2. 两公里以内，收取6元。

	```
	0 < distence < 2, charge = 6
	```

3. 两公里整，收取6元。

	```
	distence == 2, charge = 6
	```