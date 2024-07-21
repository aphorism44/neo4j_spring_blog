package com.dominicjesse.fractalBlog.services;

import java.util.List;

import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.stereotype.Service;

import com.dominicjesse.fractalBlog.models.Entry;

@EnableNeo4jRepositories
@Service
public class EntryServiceImp implements EntryService {

	@Override
	public List<Entry> findByCreatorEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entry getNextEntry(Entry entry) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entry getPreviousEntry(Entry entry) {
		// TODO Auto-generated method stub
		return null;
	}

}
