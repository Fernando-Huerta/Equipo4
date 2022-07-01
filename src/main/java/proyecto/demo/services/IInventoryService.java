package proyecto.demo.services;

import proyecto.demo.entities.Inventory;

public interface IInventoryService {
	
	public Inventory findByInventoryId(Integer inventoryId);
}

