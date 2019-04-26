package com.dzl.dao.bgm;

import com.dzl.pojo.Bgm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BgmRepositry  extends JpaRepository<Bgm,String >{
}
