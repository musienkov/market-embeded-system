package market.service;

import market.domain.Category;
import market.domain.Region;

import java.util.List;

public interface DistilleryService {

	/**
	 * @return all the distilleries sorted by title
	 */
	List<Category> findAll();

	/**
	 * @return all the distilleries of the specified region sorted by title
	 */
	List<Category> findByRegion(Region region);

	/**
	 * @return distillery with the specified id
	 */
	Category findById(long distilleryId);

	/**
	 * @return distillery with the specified title
	 */
	Category findByTitle(String title);


	/**
	 * Creates new distillery.
	 */
	void create(Category newDistillery, String regionName);

	/**
	 * Updates existing distillery.
	 */
	void update(long distilleryId, Category changedDistillery, String regionTitle);

	/**
	 * Removes distillery.
	 */
	void delete(long distilleryId);
}
