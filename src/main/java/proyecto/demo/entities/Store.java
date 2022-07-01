package proyecto.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="store")
public class Store {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="store_id")
	private Integer storeId;
	
	@Column(name="manager_staff_id")
	private int managerStaffId;
	
	@Column(name="address_id")
	private Integer addressId;
	
	@DateTimeFormat(pattern="MM/dd/yyyy")
	@Column(name="last_update")
	private java.sql.Timestamp lastUpdate;

	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getStoreId() {
		return storeId;
	}

	public int getManagerStaffId() {
		return managerStaffId;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public java.sql.Timestamp getLastUpdate() {
		return lastUpdate;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public void setManagerStaffId(int managerStaffId) {
		this.managerStaffId = managerStaffId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public void setLastUpdate(java.sql.Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Store [storeId=");
		builder.append(storeId);
		builder.append(", managerStaffId=");
		builder.append(managerStaffId);
		builder.append(", addressId=");
		builder.append(addressId);
		builder.append(", lastUpdate=");
		builder.append(lastUpdate);
		builder.append("]");
		return builder.toString();
	}
}
