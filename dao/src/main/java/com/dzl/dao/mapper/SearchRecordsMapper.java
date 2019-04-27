package com.dzl.dao.mapper;

import com.dzl.pojo.SearchRecords;
import com.dzl.utils.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchRecordsMapper extends MyMapper<SearchRecords> {
	
	public List<String> getHotwords();
}