package market.dao;

import market.domain.Category;
import market.domain.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DistilleryDAO extends CrudRepository<Category, Long>, JpaRepository<Category, Long> {

	List<Category> findByRegionOrderByTitleAsc(Region region);

	Category findByTitle(String title);

}
