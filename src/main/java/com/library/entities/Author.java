package com.library.entities;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.library.model.AuthorModel;

@Entity
@Table(name="authors")
public class Author {
	@Id
	@Column(unique=true)
	String id;
	
	@Column
	String firstName;
	@Column
	String lastName;
	@Column
	String middleName;
	@Column
	String exId;
	@Column
	String url;
	
	@Column
	Integer lvl;

	@Column
	Integer relation;

	@Column
	Integer subjectId;
	
	@Column
	String nickname;
	@Column
	String hubId;
	
	public Author() {	
	}
	
	public Author(AuthorModel model) {
		this.id = model.getId();
		this.firstName = model.getFirstName();
		this.lastName = model.getLastName();
		this.middleName = model.getMiddleName();
		this.exId = model.getExId();
		this.url = model.getUrl();
		this.lvl = model.getLvl();
		this.relation = model.getRelation();
		this.subjectId = model.getSubjectId();
		this.nickname = model.getNickname();
		this.hubId = model.getHubId();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public Integer getLvl() {
		return lvl;
	}
	public void setLvl(Integer lvl) {
		this.lvl = lvl;
	}
	public Integer getRelation() {
		return relation;
	}
	public void setRelation(Integer relation) {
		this.relation = relation;
	}
	public Integer getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}	
	public String getExId() {
		return exId;
	}
	public void setExId(String exId) {
		this.exId = exId;
	}	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getHubId() {
		return hubId;
	}
	public void setHubId(String hubId) {
		this.hubId = hubId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(exId, firstName, hubId, id, lastName, lvl, middleName, nickname, relation, subjectId, url);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return Objects.equals(exId, other.exId) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(hubId, other.hubId) && Objects.equals(id, other.id)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(lvl, other.lvl)
				&& Objects.equals(middleName, other.middleName) && Objects.equals(nickname, other.nickname)
				&& Objects.equals(relation, other.relation) && Objects.equals(subjectId, other.subjectId)
				&& Objects.equals(url, other.url);
	}	
	
}

