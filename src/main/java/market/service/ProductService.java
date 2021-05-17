package market.service;

import market.domain.Distillery;
import market.domain.Product;
import market.domain.Region;
import market.exception.UnknownEntityException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface ProductService {

	List<Product> findAll();

	Page<Product> findAll(PageRequest request);

	Page<Product> findByDistillery(Distillery distillery, PageRequest request);

	Page<Product> findByRegion(Region region, PageRequest request);

	Page<Product> findByAvailability(String available, PageRequest request);

	Product getProduct(long productId);

	Optional<Product> findById(long productId);

	void create(Product product, String distilleryTitle);

	void update(long productId, Product product, String distilleryTitle);

	void updateAvailability(Map<Boolean, List<Long>> productIdsByAvailability);

	void delete(long product);

}
