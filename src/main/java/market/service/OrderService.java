package market.service;

import market.domain.Order;
import market.exception.EmptyCartException;
import market.exception.UnknownEntityException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.Optional;

public interface OrderService {

	List<Order> getUserOrders(String userLogin);

	Optional<Order> getUserOrder(String userLogin, long orderId);

	Page<Order> fetchFiltered(String executed, String created, PageRequest request);

	Order createUserOrder(String userLogin, int deliveryCost, String cardNumber);

	void updateStatus(long orderId, boolean executed);

}
