package com.crm.service.portlets;

import java.util.List;

import com.crm.model.XmNotes;

public interface XmNotesService {

	List<XmNotes> getTopNotes(Integer userid);

}
