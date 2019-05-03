package com.dzl.dao.searchrecords;

import com.dzl.pojo.SearchRecords;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SearchRecordsRepository extends JpaRepository<SearchRecords,String> {
//select content from search_records group by content order by count(content) desc
}
