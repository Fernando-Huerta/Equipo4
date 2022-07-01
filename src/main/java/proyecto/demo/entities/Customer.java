package proyecto.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customer_id")
	private Integer customerId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(unique = true)
	private String email;
	
	@Column(name="address_id")
	private Integer addressId;
	
	private Boolean activebool;
	
	private Integer active;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public Boolean getActivebool() {
		return activebool;
	}

	public Integer getActive() {
		return active;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public void setActivebool(Boolean activebool) {
		this.activebool = activebool;
	}

	public void setActive(Integer active) {
		this.active = active;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [customerId=");
		builder.append(customerId);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", email=");
		builder.append(email);
		builder.append(", addressId=");
		builder.append(addressId);
		builder.append(", activebool=");
		builder.append(activebool);
		builder.append(", active=");
		builder.append(active);
		builder.append("]");
		return builder.toString();
	}
	
	
}
