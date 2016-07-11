package com.sun.testing.testweb.database;

import com.sun.testing.testweb.common.request.PageRequest;
import com.sun.testing.testweb.common.request.Request;
import com.sun.testing.testweb.common.response.PageResponse;
import com.sun.testing.testweb.common.response.Response;

public interface IDataService {

	PageResponse getPages(PageRequest pageRequest)throws Exception;
	
	PageResponse insertPage(final PageRequest pageRequest)throws Exception;
	
	PageResponse updatePage(final PageRequest pageRequest)throws Exception;
	
	
	
	Response getFields(final Request request)throws Exception;
	
	Response insertField(final Request request)throws Exception;
	
	Response updateField(final Request request)throws Exception;
	
	
	
	Response getPageFields(final Request request)throws Exception;
	
	Response insertPageField(final Request request)throws Exception;
	
	Response updatePageField(final Request request)throws Exception;
	
	
	
	Response getValues(final Request request)throws Exception;
	
	Response insertValue(final Request request)throws Exception;
	
	Response updateValue(final Request request)throws Exception;
	
	
	
	Response getResults(final Request request)throws Exception;
	
	Response insertResult(final Request request)throws Exception;
	
	Response updateResult(final Request request)throws Exception;
	
	
	
	Response getCases(final Request request)throws Exception;
	
	Response insertCase(final Request request) throws Exception;
	
	Response updateCase(final Request request) throws Exception;
}
