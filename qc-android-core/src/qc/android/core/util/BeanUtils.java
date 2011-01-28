package qc.android.core.util;

import qc.android.core.manage.LoginManage;
import qc.android.core.manage.impl.LoginManageImpl;

public class BeanUtils {
	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<T> clazz) {
		if (clazz == LoginManage.class) {
			return (T) new LoginManageImpl();
		}
		return null;
	}
}
