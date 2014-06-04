package cz.jiripinkas.jba.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import java.util.List;


@Entity
public class User {

	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String email;
	private String password;
	
	@ManyToMany
	@JoinTable
	private List<Role> roles;

	public List<Blog> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}

	@OneToMany(mappedBy="user", fetch=FetchType.LAZY)
	private List<Blog> blogs;
	
	
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String param) {
		this.name = param;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String param) {
		this.email = param;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String param) {
		this.password = param;
	}

}
