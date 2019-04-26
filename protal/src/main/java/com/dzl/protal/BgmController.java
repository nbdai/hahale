package com.dzl.protal;

import com.dzl.pojo.Bgm;
import com.dzl.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@Api(value="背景音乐业务的接口", tags= {"背景音乐业务的controller"})
@RequestMapping("/bgm")
public class BgmController{
	@Autowired
	private RestTemplate restTemplate;
	@ApiOperation(value="获取背景音乐列表", notes="获取背景音乐列表的接口")
	@PostMapping("/list")
	public JSONResult list() {
		List<Bgm> bgmList = restTemplate.getForObject("http://localhost:8082/queryBgmList",List.class);
		return JSONResult.ok(bgmList);
	}
}
