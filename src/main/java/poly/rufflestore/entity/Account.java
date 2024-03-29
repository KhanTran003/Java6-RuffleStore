package poly.rufflestore.entity;

import java.io.Serializable;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@SuppressWarnings("serial")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Accounts")
public class Account  implements Serializable{
	@Id
	String username;
	String password;
	String fullname;
	String email;
	String photo;


	@JsonIgnore
	@OneToMany(mappedBy = "account", fetch = FetchType.EAGER)
	List<Authority> authorities;

	@JsonIgnore
	@OneToMany(mappedBy = "account")
	List<Order> orders;
}
