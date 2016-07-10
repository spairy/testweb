package com.sun.testing.testweb.database;

import com.sun.testing.testweb.common.request.PageRequest;
import com.sun.testing.testweb.common.request.Request;
import com.sun.testing.testweb.common.response.PageResponse;
import com.sun.testing.testweb.common.response.Response;

public interface IDataService {

	PageResponse getPageList(PageRequest pageRequest);
	
PageResponse insertPageList(final PageRequest pageRequest);
	
	PageResponse updatePageList(final PageRequest pageRequest);
	
	
	
	Response getFields(final Request request);
	
	Response insertField(final Request request);
	
	Response updateField(final Request request);
	
	
	
	Response getPageFields(final Request request);
	
	Response insertPageField(final Request request);
	
	Response updatePageField(final Request request);
	
	
	
	Response getValues(final Request request);
	
	Response insertValue(final Request request);
	
	Response updateValue(final Request request);
	
	
	
	Response getErrors(final Request request);
	
	Response insertError(final Request request);
	
	Response updateError(final Request request);
	
	
	
	Response getCases(final Request request);
	
	Response insertCase(final Request request);
	
	Response updateCase(final Request request);
}
