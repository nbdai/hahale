package com.dzl.protal;

import com.dzl.dao.searchrecords.SearchRecordsRepository;
import com.dzl.dao.video.VideoReposity;
import com.dzl.pojo.SearchRecords;
import com.dzl.pojo.Videos;
import com.dzl.utils.PagedResult;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class PageHelpService {
    @Resource
    private Sid sid;
    @Autowired
    private SearchRecordsRepository searchRecordsRepository;
    @Autowired
    private VideoReposity videoReposity;
    public PagedResult getAllVideos(Videos videos , Integer isSaveRecord, Integer page,Integer pageSize){
// 保存热搜词
        String desc = videos.getVideoDesc();
        String userId = videos.getUserId();
        if (isSaveRecord != null && isSaveRecord == 1) {
            SearchRecords record = new SearchRecords();
            String recordId = sid.nextShort();
            record.setId(recordId);
            record.setContent(desc);
            searchRecordsRepository.save(record);



        }
        return null;
    }




}
