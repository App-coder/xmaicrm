package com.crm.service.module;

import java.util.List;

public interface XmSerialnumbersService {

	int getTotal();

	List<Object> loadList(int page, int rows,String order);

}
