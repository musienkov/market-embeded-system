package market.dto.assembler;

import market.controller.backend.CategoryController;
import market.domain.Category;
import market.dto.CategoryDTO;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;

import java.util.List;

public class CategoryDtoAssembler extends RepresentationModelAssemblerSupport<Category, CategoryDTO> {

	public CategoryDtoAssembler() {
		super(CategoryController.class, CategoryDTO.class);
	}

	@Override
	public CategoryDTO toModel(Category distillery) {
		CategoryDTO dto = instantiateModel(distillery);
		dto.setId(distillery.getId());
		dto.setTitle(distillery.getTitle());
		dto.setDescription(distillery.getDescription());
		dto.setRegion(distillery.getRegion().getName());
		return dto;
	}

	public CategoryDTO[] toDtoArray(List<Category> items) {
		return toCollectionModel(items).getContent().toArray(new CategoryDTO[items.size()]);
	}

	public Category toDomain(CategoryDTO dto) {
		return new Category.Builder()
			.setTitle(dto.getTitle())
			.setDescription(dto.getDescription())
			.build();
	}
}
