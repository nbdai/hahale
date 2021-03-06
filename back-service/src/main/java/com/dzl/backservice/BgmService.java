package com.dzl.backservice;

import com.dzl.dao.bgm.BgmRepositry;
import com.dzl.pojo.Bgm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BgmService {
    @Autowired
    private BgmRepositry bgmRepositry;
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Bgm> queryBgmList(){
        return bgmRepositry.findAll();
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    public Bgm queryBgmById(String id){
        return bgmRepositry.getOne(id);
    }
}
