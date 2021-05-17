package market.controller.backend;

import market.files.FileService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;

@Controller
public class FileController {

	private final FileService fileService;

	public FileController(FileService fileService) {
		this.fileService = fileService;
	}

	@RequestMapping(value = "download-file-{id}", method = RequestMethod.GET)
	public void downloadFile(@PathVariable("id") long orderId, Principal principal, HttpServletResponse response) throws IOException {
		System.out.println("ORDER: "+orderId);
		response.setContentType("text/plain");
		response.setHeader("Content-disposition", "attachment; filename=sample.txt");
		fileService.downloadFile(response.getWriter(), principal.getName(), orderId);
	}

	@PostMapping("/uploadFile")
	public String uploadFile(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes, Principal principal) {

		if (!file.isEmpty() && principal != null) {
			fileService.uploadFile(file, principal.getName());
		}

		redirectAttributes.addFlashAttribute("message",
			"You successfully uploaded " + file.getOriginalFilename() + "!");

		return "redirect:/customer/orders";
	}

}
