package market.service;

import market.domain.UserAccount;
import market.exception.EmailExistsException;

public interface UserAccountService {

	UserAccount findByEmail(String email);

	UserAccount create(UserAccount userAccount);


}
