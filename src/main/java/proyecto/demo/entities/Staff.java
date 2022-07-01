package proyecto.demo.entities;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "staff")
public class Staff {
		

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer staff_id;
	
	private String first_name;
	
	private String last_name; 
	
	@Column(unique = true)
	private String email;
	
	private Integer store_id;
	
	private Boolean active;
	
	private String username;
	
	private String password;
	
	@DateTimeFormat(pattern="MM/dd/yyyy")
	private java.sql.Timestamp last_update;
	
	@Lob
	@Type(type="org.hibernate.type.BinaryType")
    private byte[] picture;
	
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(Integer staff_id) {
		this.staff_id = staff_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getStore_id() {
		return store_id;
	}

	public void setStore_id(Integer store_id) {
		this.store_id = store_id;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
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

	public java.sql.Timestamp getLast_update() {
		return last_update;
	}

	public void setLast_update(java.sql.Timestamp last_update) {
		this.last_update = last_update;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Staff [staff_id=");
		builder.append(staff_id);
		builder.append(", first_name=");
		builder.append(first_name);
		builder.append(", last_name=");
		builder.append(last_name);
		builder.append(", email=");
		builder.append(email);
		builder.append(", store_id=");
		builder.append(store_id);
		builder.append(", active=");
		builder.append(active);
		builder.append(", username=");
		builder.append(username);
		builder.append(", password=");
		builder.append(password);
		builder.append(", last_update=");
		builder.append(last_update);
		builder.append(", picture=");
		builder.append(Arrays.toString(picture));
		builder.append("]");
		return builder.toString();
	}
	
	
}
