package com.crm.service.module;

import java.util.List;

public interface XmNormaltasksService {

	int getCountByStatus(int i);

	int getCountOfOverTime();

	int getCountOfOutTimeFinished();

	int getCountOfRollOut();

	List loadListNotDo(int page, int rows);

	List loadListFollow(int page, int rows);

	List loadListChange(int page, int rows);

	List loadListOverTime(int page, int rows);

	List loadListFinished(int page, int rows);

	List loadListOutTimeFinished(int page, int rows);

	List loadListRollOut(int page, int rows);


}
