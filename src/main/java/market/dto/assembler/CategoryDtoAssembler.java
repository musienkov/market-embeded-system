package market.dto.assembler;

import market.controller.backend.CategoryController;
import market.domain.Distillery;
import market.dto.CategoryDTO;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;

import java.util.List;

public class CategoryDtoAssembler extends RepresentationModelAssemblerSupport<Distillery, CategoryDTO> {

	public CategoryDtoAssembler() {
		super(CategoryController.class, CategoryDTO.class);
	}

	@Override
	public CategoryDTO toModel(Distillery distillery) {
		CategoryDTO dto = instantiateModel(distillery);
		dto.setId(distillery.getId());
		dto.setTitle(distillery.getTitle());
		dto.setDescription(distillery.getDescription());
		dto.setRegion(distillery.getRegion().getName());
		return dto;
	}

	public CategoryDTO[] toDtoArray(List<Distillery> items) {
		return toCollectionModel(items).getContent().toArray(new CategoryDTO[items.size()]);
	}

	public Distillery toDomain(CategoryDTO dto) {
		return new Distillery.Builder()
			.setTitle(dto.getTitle())
			.setDescription(dto.getDescription())
			.build();
	}
}
