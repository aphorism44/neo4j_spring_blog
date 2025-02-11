package com.dominicjesse.fractalBlog.repositories;


import java.util.List;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.dominicjesse.fractalBlog.models.Entry;



public interface EntryRepository extends Neo4jRepository<Entry, Long> {
	
	List<Entry> findByCreatorEmail(String email);

}
