package com.library.utils;

import com.library.entities.Author;
import com.library.entities.Book;

public class BookHelper {

	public static int getPageNumberValue(Integer pageNumber, int pageNumberDefaultValue) {
		int topValue = pageNumberDefaultValue;
		if(pageNumber != null) {
			topValue = pageNumber.intValue();
		}
		return topValue;
	}
	
	public static int getPageSizeValue(Integer pageSize, int getPageSizeDefaultValue) {
		int getPageSizeValue = getPageSizeDefaultValue;
		if(pageSize != null) {
			getPageSizeValue = pageSize.intValue();
		}
		return getPageSizeValue;
	}
	
	public static Author deltaAuthor(Author existingAuthor, Author updatedAuthor) {
    	Author delta = new Author();
    	delta.setId(existingAuthor.getId());
    	delta.setExId(updatedAuthor.getExId() != null ? updatedAuthor.getExId() : existingAuthor.getExId());
    	delta.setHubId(updatedAuthor.getHubId() != null ? updatedAuthor.getHubId() : existingAuthor.getHubId());
    	delta.setFirstName(updatedAuthor.getFirstName() != null ? updatedAuthor.getFirstName() : existingAuthor.getFirstName());
    	delta.setLastName(updatedAuthor.getLastName() != null ? updatedAuthor.getLastName() : existingAuthor.getLastName());
    	delta.setMiddleName(updatedAuthor.getMiddleName() != null ? updatedAuthor.getMiddleName() : existingAuthor.getMiddleName());
    	delta.setNickname(updatedAuthor.getNickname() != null ? updatedAuthor.getNickname() : existingAuthor.getNickname());
    	delta.setUrl(updatedAuthor.getUrl() != null ? updatedAuthor.getUrl() : existingAuthor.getUrl());
    	delta.setLvl(updatedAuthor.getLvl() != null ? updatedAuthor.getLvl() : existingAuthor.getLvl());
    	delta.setRelation(updatedAuthor.getRelation() != null ? updatedAuthor.getRelation() : existingAuthor.getRelation());    	
    	delta.setSubjectId(updatedAuthor.getSubjectId() != null ? updatedAuthor.getSubjectId() : existingAuthor.getSubjectId());
    	return delta;
    }
	
	public static Book deltaBook(Book existingBook, Book updatedBook) {
    	Book delta = new Book();
    	delta.setId(existingBook.getId());
    	delta.setAddedDate(updatedBook.getAddedDate() != null ? updatedBook.getAddedDate() : existingBook.getAddedDate());
    	delta.setAllowRead(updatedBook.getAllowRead() != null ? updatedBook.getAllowRead() : existingBook.getAllowRead());
    	delta.setAnnotation(updatedBook.getAnnotation() != null ? updatedBook.getAnnotation() : existingBook.getAnnotation());
    	delta.setAuthors(updatedBook.getAuthors() != null ? updatedBook.getAuthors() : existingBook.getAuthors());
    	delta.setChars(updatedBook.getChars() != null ? updatedBook.getChars() : existingBook.getChars());
    	delta.setCover(updatedBook.getCover() != null ? updatedBook.getCover() : existingBook.getCover());
    	delta.setCustomInfo(updatedBook.getCustomInfo() != null ? updatedBook.getCustomInfo() : existingBook.getCustomInfo());
    	delta.setFile(updatedBook.getFile() != null ? updatedBook.getFile() : existingBook.getFile());
    	delta.setFileId(updatedBook.getFileId() != null ? updatedBook.getFileId() : existingBook.getFileId());
    	delta.setGenres(updatedBook.getGenres() != null ? updatedBook.getGenres() : existingBook.getGenres());
    	delta.setHistory(updatedBook.getHistory() != null ? updatedBook.getHistory() : existingBook.getHistory());
    	delta.setIntId(updatedBook.getIntId() != null ? updatedBook.getIntId() : existingBook.getIntId());
    	delta.setIsbn(updatedBook.getIsbn() != null ? updatedBook.getIsbn() : existingBook.getIsbn());
    	delta.setKeywords(updatedBook.getKeywords() != null ? updatedBook.getKeywords() : existingBook.getKeywords());
    	delta.setLang(updatedBook.getLang() != null ? updatedBook.getLang() : existingBook.getLang());
    	delta.setLastReleaseDate(updatedBook.getLastReleaseDate() != null ? updatedBook.getLastReleaseDate() : existingBook.getLastReleaseDate());
    	delta.setLvl(updatedBook.getLvl() != null ? updatedBook.getLvl() : existingBook.getLvl());
       	delta.setOnSale(updatedBook.getOnSale() != null ? updatedBook.getOnSale() : existingBook.getOnSale());
       	delta.setPrice(updatedBook.getPrice() != null ? updatedBook.getPrice() : existingBook.getPrice());
       	delta.setProgramUsed(updatedBook.getProgramUsed() != null ? updatedBook.getProgramUsed() : existingBook.getProgramUsed());
       	delta.setPublishCity(updatedBook.getPublishCity() != null ? updatedBook.getPublishCity() : existingBook.getPublishCity());
       	delta.setPublisherName(updatedBook.getPublisherName() != null ? updatedBook.getPublisherName() : existingBook.getPublisherName());
       	delta.setPublishYear(updatedBook.getPublishYear() != null ? updatedBook.getPublishYear() : existingBook.getPublishYear());
       	delta.setSequenceNamePublishInfo(updatedBook.getSequenceNamePublishInfo() != null ? updatedBook.getSequenceNamePublishInfo() : existingBook.getSequenceNamePublishInfo());
       	delta.setSequenceNameTitleInfo(updatedBook.getSequenceNameTitleInfo() != null ? updatedBook.getSequenceNameTitleInfo() : existingBook.getSequenceNameTitleInfo());
       	delta.setSequenceNumberPublishInfo(updatedBook.getSequenceNumberPublishInfo() != null ? updatedBook.getSequenceNumberPublishInfo() : existingBook.getSequenceNumberPublishInfo());
       	delta.setSequenceNumberTitleInfo(updatedBook.getSequenceNumberTitleInfo() != null ? updatedBook.getSequenceNumberTitleInfo() : existingBook.getSequenceNumberTitleInfo());
       	delta.setShowPreview(updatedBook.getShowPreview() != null ? updatedBook.getShowPreview() : existingBook.getShowPreview());
       	delta.setSrcLang(updatedBook.getSrcLang() != null ? updatedBook.getSrcLang() : existingBook.getSrcLang());
       	delta.setSrcOcr(updatedBook.getSrcOcr() != null ? updatedBook.getSrcOcr() : existingBook.getSrcOcr());
       	delta.setSrcUrl(updatedBook.getSrcUrl() != null ? updatedBook.getSrcUrl() : existingBook.getSrcUrl());
       	delta.setTitle(updatedBook.getTitle() != null ? updatedBook.getTitle() : existingBook.getTitle());
       	delta.setTranslatorFirstName(updatedBook.getTranslatorFirstName() != null ? updatedBook.getTranslatorFirstName() : existingBook.getTranslatorFirstName());
       	delta.setTranslatorId(updatedBook.getTranslatorId() != null ? updatedBook.getTranslatorId() : existingBook.getTranslatorId());
       	delta.setTranslatorLastName(updatedBook.getTranslatorLastName() != null ? updatedBook.getTranslatorLastName() : existingBook.getTranslatorLastName());
       	delta.setTranslatorMiddleName(updatedBook.getTranslatorMiddleName() != null ? updatedBook.getTranslatorMiddleName() : existingBook.getTranslatorMiddleName());
       	delta.setTranslatorUrl(updatedBook.getTranslatorUrl() != null ? updatedBook.getTranslatorUrl() : existingBook.getTranslatorUrl());
       	delta.setType(updatedBook.getType() != null ? updatedBook.getType() : existingBook.getType());
       	delta.setVersion(updatedBook.getVersion() != null ? updatedBook.getVersion() : existingBook.getVersion());
       	delta.setYear(updatedBook.getYear() != null ? updatedBook.getYear() : existingBook.getYear());   	
    	return delta;
    }		
}
