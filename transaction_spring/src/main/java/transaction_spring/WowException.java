package transaction_spring;

import org.springframework.dao.DataAccessException;

public class WowException extends DataAccessException{
	public WowException(String msg) {
		super("에러 : " + msg);
	}
}
