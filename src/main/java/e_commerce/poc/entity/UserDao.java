package e_commerce.poc.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import antlr.collections.List;

import java.util.*;

import javax.persistence.*;

@Entity

@Table(name = "users")
public class UserDao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String username;
    @Column
    @JsonIgnore
    private String password;
    
    @ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(	name = "users_roles", 
				joinColumns = @JoinColumn(name = "user_id"), 
				inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<RoleDao> roles = new HashSet<>();
    
    public UserDao() {
	}

	public UserDao(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Set<RoleDao> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleDao> roles) {
		this.roles = roles;
	}

	

	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}