package com.dzl.protal;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BasicController {
	
/*	@Autowired
	public RedisOperator redis;*/
	
	//public static final String USER_REDIS_SESSION = "user-redis-session";
	
	// 文件保存的命名空间
	public static final String FILE_SPACE = "F:/videos_dev";
	
	// ffmpeg所在目录
	public static final String FFMPEG_EXE = "F:\\ffmpeg\\bin\\ffmpeg.exe";
	
	// 每页分页的记录数
	public static final Integer PAGE_SIZE = 5;
	
}