package com.dzl.backservice;

import com.dzl.pojo.Bgm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BgmController {
    @Autowired
    private BgmService bgmService;
    @RequestMapping("queryBgmList")
    public List<Bgm> queryBgmList(){
        return bgmService.queryBgmList();
    }
    @RequestMapping("queryBgmById/{id}")
    public Bgm queryBgmById(@PathVariable("id") String id){
        return bgmService.queryBgmById(id);
    }

}
