package com.dominicjesse.fractalBlog.services;

import java.util.List;

import com.dominicjesse.fractalBlog.models.Entry;

public interface EntryService {
	List<Entry> findByCreatorEmail(String email);
	Entry getNextEntry(Entry entry);
	Entry getPreviousEntry(Entry entry);
};
