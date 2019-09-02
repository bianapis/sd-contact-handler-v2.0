/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ContactHandlerApiServiceImpl implements ContactHandlerApiService {

	public SDContactHandlerActivateOutputModel activate(SDContactHandlerActivateInputModel request){
		return JsonReader.read("activate-SDContactHandlerActivateOutputModel.json",new TypeReference<SDContactHandlerActivateOutputModel>(){});
	}
	
	public SDContactHandlerConfigureOutputModel configure(String sdReferenceId, SDContactHandlerConfigureInputModel request){
		return JsonReader.read("configure-SDContactHandlerConfigureOutputModel.json",new TypeReference<SDContactHandlerConfigureOutputModel>(){});
	}
	
	public BQSessionControlOutputModel controlSession(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSessionControlInputModel request){
		return JsonReader.read("control-BQSessionControlOutputModel.json",new TypeReference<BQSessionControlOutputModel>(){});
	}
	
	public CRCustomerContactOperatingSessionControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerContactOperatingSessionControlInputModel request){
		return JsonReader.read("control-CRCustomerContactOperatingSessionControlOutputModel.json",new TypeReference<CRCustomerContactOperatingSessionControlOutputModel>(){});
	}
	
	public CRCustomerContactOperatingSessionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerContactOperatingSessionExchangeInputModel request){
		return JsonReader.read("exchange-CRCustomerContactOperatingSessionExchangeOutputModel.json",new TypeReference<CRCustomerContactOperatingSessionExchangeOutputModel>(){});
	}
	
	public BQSessionExecuteOutputModel executeSession(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSessionExecuteInputModel request){
		return JsonReader.read("execute-BQSessionExecuteOutputModel.json",new TypeReference<BQSessionExecuteOutputModel>(){});
	}
	
	public CRCustomerContactOperatingSessionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRCustomerContactOperatingSessionExecuteInputModel request){
		return JsonReader.read("execute-CRCustomerContactOperatingSessionExecuteOutputModel.json",new TypeReference<CRCustomerContactOperatingSessionExecuteOutputModel>(){});
	}
	
	public SDContactHandlerFeedbackOutputModel feedback(String sdReferenceId, SDContactHandlerFeedbackInputModel request){
		return JsonReader.read("feedback-SDContactHandlerFeedbackOutputModel.json",new TypeReference<SDContactHandlerFeedbackOutputModel>(){});
	}
	
	public CRCustomerContactOperatingSessionInitiateOutputModel initiate(String sdReferenceId, CRCustomerContactOperatingSessionInitiateInputModel request){
		return JsonReader.read("initiate-CRCustomerContactOperatingSessionInitiateOutputModel.json",new TypeReference<CRCustomerContactOperatingSessionInitiateOutputModel>(){});
	}
	
	public BQSessionInitiateOutputModel initiateSession(String sdReferenceId, String crReferenceId, BQSessionInitiateInputModel request){
		return JsonReader.read("initiate-BQSessionInitiateOutputModel.json",new TypeReference<BQSessionInitiateOutputModel>(){});
	}
	
	public CRCustomerContactOperatingSessionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerContactOperatingSessionRequestInputModel request){
		return JsonReader.read("request-CRCustomerContactOperatingSessionRequestOutputModel.json",new TypeReference<CRCustomerContactOperatingSessionRequestOutputModel>(){});
	}
	
	public CRCustomerContactOperatingSessionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerContactOperatingSessionRetrieveOutputModel.json",new TypeReference<CRCustomerContactOperatingSessionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQAuthenticationRetrieveOutputModel retrieveAuthentication(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQAuthenticationRetrieveOutputModel.json",new TypeReference<BQAuthenticationRetrieveOutputModel>(){});
	}
	
	public BQHistoryRetrieveOutputModel retrieveHistory(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQHistoryRetrieveOutputModel.json",new TypeReference<BQHistoryRetrieveOutputModel>(){});
	}
	
	public BQRoutingRetrieveOutputModel retrieveRouting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQRoutingRetrieveOutputModel.json",new TypeReference<BQRoutingRetrieveOutputModel>(){});
	}
	
	public BQSessionRetrieveOutputModel retrieveSession(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQSessionRetrieveOutputModel.json",new TypeReference<BQSessionRetrieveOutputModel>(){});
	}
	
	public SDContactHandlerRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDContactHandlerRetrieveOutputModel.json",new TypeReference<SDContactHandlerRetrieveOutputModel>(){});
	}
	
	public CRCustomerContactOperatingSessionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerContactOperatingSessionUpdateInputModel request){
		return JsonReader.read("update-CRCustomerContactOperatingSessionUpdateOutputModel.json",new TypeReference<CRCustomerContactOperatingSessionUpdateOutputModel>(){});
	}
	
	public BQHistoryUpdateOutputModel updateHistory(String sdReferenceId, String crReferenceId, String bqReferenceId, BQHistoryUpdateInputModel request){
		return JsonReader.read("update-BQHistoryUpdateOutputModel.json",new TypeReference<BQHistoryUpdateOutputModel>(){});
	}
	
	public BQSessionUpdateOutputModel updateSession(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSessionUpdateInputModel request){
		return JsonReader.read("update-BQSessionUpdateOutputModel.json",new TypeReference<BQSessionUpdateOutputModel>(){});
	}
	
}
