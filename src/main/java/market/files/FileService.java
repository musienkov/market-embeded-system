package market.files;


import org.springframework.web.multipart.MultipartFile;

import java.io.PrintWriter;

public interface FileService {

	void downloadFile();

	void downloadFile(PrintWriter printWriter, String userEmail, long orderId);

	void uploadFile(MultipartFile file, String userEmail);
}
