package com.library.entities;

public class AuthorBuilder {

	String id;
	String firstName;
	String lastName;
	String middleName;
	String exId;
	String url;
	Integer lvl;
	Integer relation;
	Integer subjectId;	
	String nickname;	
	String hubId;
	
	public AuthorBuilder setId(String id) {
		this.id = id;
		return this;
	}

	public AuthorBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public AuthorBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public AuthorBuilder setMiddleName(String middleName) {
		this.middleName = middleName;
		return this;
	}
		
	public AuthorBuilder setLvl(Integer lvl) {
		this.lvl = lvl;
		return this;
	}

	public AuthorBuilder setRelation(Integer relation) {
		this.relation = relation;
		return this;
	}

	public AuthorBuilder setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
		return this;
	}

	public AuthorBuilder setExId(String exId) {
		this.exId = exId;
		return this;
	}
	
	public AuthorBuilder setUrl(String url) {
		this.url = url;
		return this;
	}
	
	public AuthorBuilder setNickname(String nickname) {
		this.nickname = nickname;
		return this;
	}
	
	public AuthorBuilder setHubId(String hubId) {
		this.hubId = hubId;
		return this;
	}
	
	public Author build() {
		Author author = new Author();
		author.setId(id);
		author.setFirstName(firstName);
		author.setLastName(lastName);
		author.setMiddleName(middleName);
		author.setLvl(lvl);
		author.setRelation(relation);
		author.setSubjectId(subjectId);
		author.setExId(exId);
		author.setUrl(url);
		author.setNickname(nickname);
		author.setHubId(hubId);
		return author;
	}
}