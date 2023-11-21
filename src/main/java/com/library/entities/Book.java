package com.library.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

import com.library.model.BookModel;

@Entity
@Table(name="books")
public class Book {
	@Id
	@Column(unique=true)
	private String id;
	
	@Column
	private Integer intId;
	
	@Column
	private String isbn;
	
	@Column
	private Double price;
	
	@Column(name = "programused")
	private String programUsed;
	
	@Column
	private String version;	
	
	@Column
	private String history;	
	
    @Column(name = "publishername")
    String publisherName;
    
    @Column(name = "publishcity")
    String publishCity;
    
    @Column(name = "publishyear")
    Integer publishYear;
    
    @Column(name = "lastreleasedate")
    private LocalDateTime lastReleaseDate;
    
    @Column(name = "addeddate")
    private LocalDateTime addedDate;
    
    @Column
    private Integer year;
    
    @Column
    private String cover;
    
    @Column(name = "onsale")
    private Integer onSale;
    
    @Column(name = "fileid")
    private String fileId;
    
    @Column
    private String chars;
    
    @Column
    private Integer type;
    
    @Column
    private Integer file;
    
    @Column(name = "showpreview")
    private Integer showPreview;
    
    @Column(name = "allowread")
    private Integer allowRead;
    
    @Column
    private Integer lvl;
    
    @Column
    private String title;
    
    @Column
    private String annotation;
    
    @Column
    String lang;
    
    @Column
    String srcLang;    
    
    @Column(name = "srcurl")
    String srcUrl;

    @Column(name = "srcocr")
    String srcOcr; 
    
    @Column(name="sequencenumbertitle")  
    Integer sequenceNumberTitleInfo;      
    
    @Column(name="sequencenametitle")  
    String sequenceNameTitleInfo;
    
    @Column(name="sequencenumberpublish")  
    Integer sequenceNumberPublishInfo;      
    
    @Column(name="sequencenamepublish")  
    String sequenceNamePublishInfo;    
    
    @Column(name="translatorid")  
    String translatorId;
    
    @Column(name="translatorfirstname")  
    String translatorFirstName;    
    
    @Column(name="translatorlastname")  
    String translatorLastName; 
    
    @Column(name="translatormiddlename")  
    String translatorMiddleName; 
    
    @Column(name="translatorurl")  
    String translatorUrl;     
    
    @Column
    @ElementCollection(targetClass=Author.class)  
    @JoinTable(name = "books_authors", joinColumns = @JoinColumn(name = "book_entity_id"))
    List<Author> authors = new ArrayList<>(); 
    
    @Column 
    @ElementCollection(targetClass=String.class) 
    @CollectionTable(name="book_entity_genres", joinColumns=@JoinColumn(name="book_entity_id"))
    List<String> genres = new ArrayList<>();

    @Column 
    @ElementCollection(targetClass=String.class)  
    @CollectionTable(name="book_entity_keywords", joinColumns=@JoinColumn(name="book_entity_id"))
    List<String> keywords = new ArrayList<>();
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "bookid")   
    List<CustomInfo> customInfo = new ArrayList<>();    
    
	public Book() {
	}
	
	public Book(BookModel model) {
		this.id = model.getId();
		this.addedDate = model.getAddedDate();
		this.allowRead = model.getAllowRead();
		this.annotation = model.getAnnotation();
		this.authors = model.getAuthors();
		this.chars = model.getChars();
		this.cover = model.getCover();
		this.customInfo = model.getCustomInfo();
		this.file = model.getFile();
		this.fileId = model.getFileId();
		this.genres = model.getGenres();
		this.history = model.getHistory();
		this.intId = model.getIntId();
		this.isbn = model.getIsbn();
		this.keywords = model.getKeywords();
		this.lang = model.getLang();
		this.lastReleaseDate = model.getLastReleaseDate();
		this.lvl = model.getLvl();
		this.onSale = model.getOnSale();
		this.price = model.getPrice();
		this.programUsed = model.getProgramUsed();
		this.publishCity = model.getPublishCity();
		this.publisherName = model.getPublisherName();
		this.publishYear = model.getPublishYear();
		this.sequenceNamePublishInfo = model.getSequenceNamePublishInfo();
		this.sequenceNameTitleInfo = model.getSequenceNameTitleInfo();
		this.sequenceNumberPublishInfo = model.getSequenceNumberPublishInfo();
		this.sequenceNumberTitleInfo = model.getSequenceNumberTitleInfo();
		this.showPreview = model.getShowPreview();
		this.srcLang = model.getSrcLang();
		this.srcOcr = model.getSrcOcr();
		this.srcUrl = model.getSrcUrl();
		this.title = model.getTitle();
		this.translatorFirstName = model.getTranslatorFirstName();
		this.translatorId = model.getTranslatorId();
		this.translatorLastName = model.getTranslatorLastName();
		this.translatorMiddleName = model.getTranslatorMiddleName();
		this.translatorUrl = model.getTranslatorUrl();
		this.type = model.getType();
		this.version = model.getVersion();
		this.year = model.getYear();
	}
	
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
}