package com.dzl.backservice;

import com.dzl.dao.bgm.BgmRepositry;
import com.dzl.pojo.Bgm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BgmService {
    @Autowired
    private BgmRepositry bgmRepositry;
    public List<Bgm> queryBgmList(){
        return bgmRepositry.findAll();
    }
    public Bgm queryBgmById(String id){
        return bgmRepositry.getOne(id);
    }
}
