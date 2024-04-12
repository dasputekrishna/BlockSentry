package com.block.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String content;
    private String hash;
    private String blockchainTransactionHash;
    
    // two string is pending
    // getters and setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public String getBlockchainTransactionHash() {
		return blockchainTransactionHash;
	}
	public void setBlockchainTransactionHash(String blockchainTransactionHash) {
		this.blockchainTransactionHash = blockchainTransactionHash;
		
	}
	@Override
	public String toString() {
		return "Document [id=" + id + ", name=" + name + ", content=" + content + ", hash=" + hash
				+ ", blockchainTransactionHash=" + blockchainTransactionHash + "]";
	}
	
	public Document(Long id, String name, String content, String hash, String blockchainTransactionHash) {
		super();
		this.id = id;
		this.name = name;
		this.content = content;
		this.hash = hash;
		this.blockchainTransactionHash = blockchainTransactionHash;
	}
	
	
    
    
    
}
