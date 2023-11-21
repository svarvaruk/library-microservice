package com.library.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.hateoas.RepresentationModel;

import com.library.entities.Author;
import com.library.entities.CustomInfo;

public class BookModel extends RepresentationModel<BookModel> {
	
	private String id;
	private Integer intId;
	private String isbn;
	private Double price;
	private String programUsed;
	private String version;	
	private String history;	
    String publisherName;
    String publishCity;
    Integer publishYear;
    private LocalDateTime lastReleaseDate;
    private LocalDateTime addedDate;
    private Integer year;
    private String cover;
    private Integer onSale;
    private String fileId;
    private String chars;
    private Integer type;
    private Integer file;
    private Integer showPreview;
    private Integer allowRead;
    private Integer lvl;
    private String title;
    private String annotation;
    private String lang;
    private String srcLang;    
    private String srcUrl;
    private String srcOcr; 
    private Integer sequenceNumberTitleInfo;      
    private String sequenceNameTitleInfo;
    private Integer sequenceNumberPublishInfo;      
    private String sequenceNamePublishInfo;     
    private String translatorId;
    private String translatorFirstName;    
    private String translatorLastName; 
    private String translatorMiddleName; 
    private String translatorUrl;     
    private List<Author> authors = new ArrayList<>(); 
    private List<String> genres = new ArrayList<>();
    private List<String> keywords = new ArrayList<>();
    private List<CustomInfo> customInfo = new ArrayList<>();    
    
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getIntId() {
		return intId;
	}

	public void setIntId(Integer intId) {
		this.intId = intId;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getProgramUsed() {
		return programUsed;
	}

	public void setProgramUsed(String programUsed) {
		this.programUsed = programUsed;
	}
	
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getPublishCity() {
		return publishCity;
	}

	public void setPublishCity(String publishCity) {
		this.publishCity = publishCity;
	}

	public Integer getPublishYear() {
		return publishYear;
	}

	public void setPublishYear(Integer publishYear) {
		this.publishYear = publishYear;
	}

	public LocalDateTime getLastReleaseDate() {
		return lastReleaseDate;
	}

	public void setLastReleaseDate(LocalDateTime lastReleaseDate) {
		this.lastReleaseDate = lastReleaseDate;
	}

	public LocalDateTime getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(LocalDateTime addedDate) {
		this.addedDate = addedDate;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public Integer getOnSale() {
		return onSale;
	}

	public void setOnSale(Integer onSale) {
		this.onSale = onSale;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getChars() {
		return chars;
	}

	public void setChars(String chars) {
		this.chars = chars;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getFile() {
		return file;
	}

	public void setFile(Integer file) {
		this.file = file;
	}

	public Integer getShowPreview() {
		return showPreview;
	}

	public void setShowPreview(Integer showPreview) {
		this.showPreview = showPreview;
	}

	public Integer getAllowRead() {
		return allowRead;
	}

	public void setAllowRead(Integer allowRead) {
		this.allowRead = allowRead;
	}

	public Integer getLvl() {
		return lvl;
	}

	public void setLvl(Integer lvl) {
		this.lvl = lvl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAnnotation() {
		return annotation;
	}

	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getSrcLang() {
		return srcLang;
	}

	public void setSrcLang(String srcLang) {
		this.srcLang = srcLang;
	}

	public String getSrcUrl() {
		return srcUrl;
	}

	public void setSrcUrl(String srcUrl) {
		this.srcUrl = srcUrl;
	}

	public String getSrcOcr() {
		return srcOcr;
	}

	public void setSrcOcr(String srcOcr) {
		this.srcOcr = srcOcr;
	}

	public Integer getSequenceNumberTitleInfo() {
		return sequenceNumberTitleInfo;
	}

	public void setSequenceNumberTitleInfo(Integer sequenceNumberTitleInfo) {
		this.sequenceNumberTitleInfo = sequenceNumberTitleInfo;
	}

	public String getSequenceNameTitleInfo() {
		return sequenceNameTitleInfo;
	}
	
	public void setSequenceNameTitleInfo(String sequenceName) {
		this.sequenceNameTitleInfo = sequenceName;
	}
	
	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getSequenceNumberPublishInfo() {
		return sequenceNumberPublishInfo;
	}

	public void setSequenceNumberPublishInfo(Integer sequenceNumberPublishInfo) {
		this.sequenceNumberPublishInfo = sequenceNumberPublishInfo;
	}

	public String getSequenceNamePublishInfo() {
		return sequenceNamePublishInfo;
	}

	public void setSequenceNamePublishInfo(String sequenceNamePublishInfo) {
		this.sequenceNamePublishInfo = sequenceNamePublishInfo;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public List<String> getGenres() {
		return genres;
	}

	public void setGenres(List<String> genres) {
		this.genres = genres;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}

	public String getTranslatorId() {
		return translatorId;
	}

	public void setTranslatorId(String translatorId) {
		this.translatorId = translatorId;
	}

	public String getTranslatorFirstName() {
		return translatorFirstName;
	}

	public void setTranslatorFirstName(String translatorFirstName) {
		this.translatorFirstName = translatorFirstName;
	}

	public String getTranslatorLastName() {
		return translatorLastName;
	}

	public void setTranslatorLastName(String translatorLastName) {
		this.translatorLastName = translatorLastName;
	}

	public String getTranslatorMiddleName() {
		return translatorMiddleName;
	}

	public void setTranslatorMiddleName(String translatorMiddleName) {
		this.translatorMiddleName = translatorMiddleName;
	}

	public String getTranslatorUrl() {
		return translatorUrl;
	}

	public void setTranslatorUrl(String translatorUrl) {
		this.translatorUrl = translatorUrl;
	}

	public List<CustomInfo> getCustomInfo() {
		return customInfo;
	}

	public void setCustomInfo(List<CustomInfo> customInfo) {
		this.customInfo = customInfo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(addedDate, allowRead, annotation, authors, chars, cover, customInfo,
				file, fileId, genres, history, id, intId, isbn, keywords, lang, lastReleaseDate, lvl, onSale, price,
				programUsed, publishCity, publishYear, publisherName, sequenceNamePublishInfo, sequenceNameTitleInfo,
				sequenceNumberPublishInfo, sequenceNumberTitleInfo, showPreview, srcLang, srcOcr, srcUrl, title,
				translatorFirstName, translatorId, translatorLastName, translatorMiddleName, translatorUrl, type,
				version, year);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookModel other = (BookModel) obj;
		return Objects.equals(addedDate, other.addedDate) && Objects.equals(allowRead, other.allowRead)
				&& Objects.equals(annotation, other.annotation) && Objects.equals(authors, other.authors)
				&& Objects.equals(chars, other.chars) && Objects.equals(cover, other.cover)
				&& Objects.equals(customInfo, other.customInfo) && Objects.equals(file, other.file)
				&& Objects.equals(fileId, other.fileId) && Objects.equals(genres, other.genres)
				&& Objects.equals(history, other.history) && Objects.equals(id, other.id)
				&& Objects.equals(intId, other.intId) && Objects.equals(isbn, other.isbn)
				&& Objects.equals(keywords, other.keywords) && Objects.equals(lang, other.lang)
				&& Objects.equals(lastReleaseDate, other.lastReleaseDate) && Objects.equals(lvl, other.lvl)
				&& Objects.equals(onSale, other.onSale) && Objects.equals(price, other.price)
				&& Objects.equals(programUsed, other.programUsed) && Objects.equals(publishCity, other.publishCity)
				&& Objects.equals(publishYear, other.publishYear) && Objects.equals(publisherName, other.publisherName)
				&& Objects.equals(sequenceNamePublishInfo, other.sequenceNamePublishInfo)
				&& Objects.equals(sequenceNameTitleInfo, other.sequenceNameTitleInfo)
				&& Objects.equals(sequenceNumberPublishInfo, other.sequenceNumberPublishInfo)
				&& Objects.equals(sequenceNumberTitleInfo, other.sequenceNumberTitleInfo)
				&& Objects.equals(showPreview, other.showPreview) && Objects.equals(srcLang, other.srcLang)
				&& Objects.equals(srcOcr, other.srcOcr) && Objects.equals(srcUrl, other.srcUrl)
				&& Objects.equals(title, other.title) && Objects.equals(translatorFirstName, other.translatorFirstName)
				&& Objects.equals(translatorId, other.translatorId)
				&& Objects.equals(translatorLastName, other.translatorLastName)
				&& Objects.equals(translatorMiddleName, other.translatorMiddleName)
				&& Objects.equals(translatorUrl, other.translatorUrl) && Objects.equals(type, other.type)
				&& Objects.equals(version, other.version) && Objects.equals(year, other.year);
	}
	
}
