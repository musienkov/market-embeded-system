package market.files;

import market.dao.UserAccountDAO;
import market.domain.Order;
import market.domain.OrderedProduct;
import market.domain.Product;
import market.domain.UserAccount;
import market.service.OrderService;
import market.service.ProductService;
import market.service.UserAccountService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Service
public class FileServiceImpl implements FileService {

	private final UserAccountService userAccountService;

	private final OrderService orderService;

	private final ProductService productService;

	private final UserAccountDAO userAccountDAO;

	public FileServiceImpl(UserAccountService userAccountService, OrderService orderService, ProductService productService, UserAccountDAO userAccountDAO) {
		this.userAccountService = userAccountService;
		this.orderService = orderService;
		this.productService = productService;
		this.userAccountDAO = userAccountDAO;
	}

	public void downloadFile() {
	}

	@Override
	public void downloadFile(PrintWriter printWriter, String userEmail, long orderId) {
		Optional<Order> order = orderService.getUserOrder(userEmail, orderId);
		if (order.isPresent()) {
			Order userOrder = order.get();
			printWriter.write("Customer: ");
			printWriter.write(userOrder.getUserAccount().getName() + "\n");
			printWriter.write("Email: ");
			printWriter.write(userOrder.getUserAccount().getEmail()+ "\n\n");
			for (OrderedProduct orderedProduct: userOrder.getOrderedProducts()
			) {
				Product product = orderedProduct.getProduct();
				printWriter.write("Product: ");
				printWriter.write(product.getName() + " \n");
				printWriter.write("Price: ");
				printWriter.write(product.getPrice().toString()+ " \n");
				printWriter.write("Delivery: ");
				printWriter.write(userOrder.getBill().getOrder().getDeliveryCost()+ " \n\n");

				printWriter.write("Total: ");
				printWriter.write(userOrder.getBill().getTotalCost() + " \n");
			}
		}
	}

	@Value("${app.upload.dir:${user.home}}")
	public String uploadDir;

	public void uploadFile(MultipartFile file, String userEmail) {

		try {
			Path copyLocation = Paths
				.get(uploadDir + File.separator + StringUtils.cleanPath(file.getOriginalFilename()));
			Scanner myReader = new Scanner(file.getInputStream());
			if (file.getBytes().length > 0) {
				StringBuilder customerInfo = new StringBuilder();
				while (myReader.hasNextLine()) {
					customerInfo.append(myReader.nextLine()).append("\n");
				}
				myReader.close();
				UserAccount user = userAccountService.findByEmail(userEmail);
				user.setCustomerInfo(customerInfo.toString());
				System.out.println(customerInfo.toString());
				userAccountDAO.save(user);
//				Files.copy(file.getInputStream(), copyLocation, StandardCopyOption.REPLACE_EXISTING);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
