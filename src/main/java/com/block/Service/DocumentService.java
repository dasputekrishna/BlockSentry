package com.block.Service;

import java.util.List;

import com.block.Model.Document;

public interface DocumentService {

    Document saveDocument(Document document);
    List<Document> getAllDocuments();
}
