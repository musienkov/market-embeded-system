package market.service;

import market.domain.Region;

import java.util.List;

public interface RegionService {

	List<Region> findAll();

	Region findOne(long regionId);

	Region findByName(String regionName);

	void create(Region newRegion);

	void update(long regionId, Region changedRegion);

	void delete(long regionId);

}
