package com.block.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.block.Model.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
	
	
}
