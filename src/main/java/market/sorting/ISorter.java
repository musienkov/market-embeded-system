package market.sorting;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.ui.Model;

public interface ISorter<T> {

	PageRequest updateSorting(SortingValuesDTO sortingValues);

	Model prepareModel(Model model, Page<T> page);
}
