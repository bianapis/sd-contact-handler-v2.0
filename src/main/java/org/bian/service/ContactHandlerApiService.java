/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ContactHandlerApiService {

	SDContactHandlerActivateOutputModel activate(SDContactHandlerActivateInputModel request);
	
	SDContactHandlerConfigureOutputModel configure(String sdReferenceId, SDContactHandlerConfigureInputModel request);
	
	BQSessionControlOutputModel controlSession(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSessionControlInputModel request);
	
	CRCustomerContactOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerContactOperatingSessionControlInputModel request);
	
	CRCustomerContactOperatingSessionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerContactOperatingSessionExchangeInputModel request);
	
	BQSessionExecuteOutputModel executeSession(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSessionExecuteInputModel request);
	
	CRCustomerContactOperatingSessionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerContactOperatingSessionExecuteInputModel request);
	
	SDContactHandlerFeedbackOutputModel feedback(String sdReferenceId, SDContactHandlerFeedbackInputModel request);
	
	CRCustomerContactOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRCustomerContactOperatingSessionInitiateInputModel request);
	
	BQSessionInitiateOutputModel initiateSession(String sdReferenceId, String crReferenceId, BQSessionInitiateInputModel request);
	
	CRCustomerContactOperatingSessionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerContactOperatingSessionRequestInputModel request);
	
	CRCustomerContactOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQAuthenticationRetrieveOutputModel retrieveAuthentication(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQHistoryRetrieveOutputModel retrieveHistory(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQRoutingRetrieveOutputModel retrieveRouting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQSessionRetrieveOutputModel retrieveSession(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDContactHandlerRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCustomerContactOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerContactOperatingSessionUpdateInputModel request);
	
	BQHistoryUpdateOutputModel updateHistory(String sdReferenceId, String crReferenceId, String bqReferenceId, BQHistoryUpdateInputModel request);
	
	BQSessionUpdateOutputModel updateSession(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSessionUpdateInputModel request);
	
}
