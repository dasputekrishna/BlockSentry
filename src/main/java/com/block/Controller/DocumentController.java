package com.block.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.block.Model.Document;
import com.block.Service.DocumentService;

import java.util.List;

@RestController
@RequestMapping("/api/documents")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @PostMapping
    public ResponseEntity<Document> uploadDocument(@RequestBody Document document) {
        Document savedDocument = documentService.saveDocument(document);
        return new ResponseEntity<>(savedDocument, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Document>> getAllDocuments() {
        List<Document> documents = documentService.getAllDocuments();
        return new ResponseEntity<>(documents, HttpStatus.OK);
    }
}
