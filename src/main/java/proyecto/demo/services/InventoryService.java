package proyecto.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import proyecto.demo.entities.Inventory;
import proyecto.demo.repository.InventoryRepository;

@Service
public class InventoryService implements IInventoryService {

	@Autowired
	InventoryRepository inventoryRepository;

	@Override
	public Inventory findByInventoryId(Integer inventoryId) {
		return inventoryRepository.findByInventoryId(inventoryId);
	}

}
