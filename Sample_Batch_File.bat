@ECHO OFF
	SET Today=%Date:~10,4%_%Date:~7,2%_%Date:~4,2%
	ECHO %Today%
	MKDIR %Today%
PAUSE