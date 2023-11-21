package com.library.model;

import java.util.Objects;

import org.springframework.hateoas.RepresentationModel;

public class AuthorModel extends RepresentationModel<AuthorModel> {
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
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(exId, firstName, hubId, id, lastName, lvl, middleName, nickname,
				relation, subjectId, url);
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
		AuthorModel other = (AuthorModel) obj;
		return Objects.equals(exId, other.exId) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(hubId, other.hubId) && Objects.equals(id, other.id)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(lvl, other.lvl)
				&& Objects.equals(middleName, other.middleName) && Objects.equals(nickname, other.nickname)
				&& Objects.equals(relation, other.relation) && Objects.equals(subjectId, other.subjectId)
				&& Objects.equals(url, other.url);
	}

	
		
}
