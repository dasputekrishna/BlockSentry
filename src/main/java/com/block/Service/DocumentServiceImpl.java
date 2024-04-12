package com.block.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.block.Model.Document;
import com.block.Repository.DocumentRepository;
import com.block.Utils.HashingUtils;

import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService{

    @Autowired
    private DocumentRepository documentRepository;

    @Override
    public Document saveDocument(Document document) {
        String hash = HashingUtils.generateHash(document.getContent());
        document.setHash(hash);
       
        return documentRepository.save(document);
    }

    @Override
    public List<Document> getAllDocuments() {
        return documentRepository.findAll();
    }
}


