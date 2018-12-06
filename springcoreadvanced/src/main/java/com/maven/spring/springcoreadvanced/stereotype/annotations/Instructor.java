package com.maven.spring.springcoreadvanced.stereotype.annotations;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {

	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	private int id = 16;
	@Value("#{'Sravanthi'.toUpperCase()}")
	private String name = "madhu";
	@Value("#{topics}")
	private List<String> topics;
	
	@Value("#{2+4>5}")
	private boolean active;
	
	@Autowired
	private Profile profile;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

public Profile getProfile() {
	return profile;
}

public void setProfile(Profile profile) {
	this.profile = profile;
}

public boolean isActive() {
	return active;
}

public void setActive(boolean active) {
	this.active = active;
}

@Override
public String toString() {
	return "Instructor [id=" + id + ", name=" + name + ", topics=" + topics + ", active=" + active + ", profile="
			+ profile + "]";
}

}
