/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class ContactHandlerApiController {

	@Autowired
	ContactHandlerApiService service;
	
	@Operate.Activate
	public BianResponse<SDContactHandlerActivateOutputModel> activate(@RequestBody BianRequest<SDContactHandlerActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Operate.Configure
	public BianResponse<SDContactHandlerConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDContactHandlerConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("session")
	@Operate.Control
	public BianResponse<BQSessionControlOutputModel> controlSession(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSessionControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlSession(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Control
	public BianResponse<CRCustomerContactOperatingSessionControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerContactOperatingSessionControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Exchange
	public BianResponse<CRCustomerContactOperatingSessionExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerContactOperatingSessionExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("session")
	@Operate.Execute
	public BianResponse<BQSessionExecuteOutputModel> executeSession(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSessionExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeSession(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Operate.Execute
	public BianResponse<CRCustomerContactOperatingSessionExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerContactOperatingSessionExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Feedback
	public BianResponse<SDContactHandlerFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDContactHandlerFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Operate.Initiate
	public BianResponse<CRCustomerContactOperatingSessionInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCustomerContactOperatingSessionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("session")
	@Operate.Initiate
	public BianResponse<BQSessionInitiateOutputModel> initiateSession(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQSessionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateSession(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Request
	public BianResponse<CRCustomerContactOperatingSessionRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerContactOperatingSessionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Retrieve
	public BianResponse<CRCustomerContactOperatingSessionRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("authentication")
	@Operate.Retrieve
	public BianResponse<BQAuthenticationRetrieveOutputModel> retrieveAuthentication(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAuthentication(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("history")
	@Operate.Retrieve
	public BianResponse<BQHistoryRetrieveOutputModel> retrieveHistory(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveHistory(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("routing")
	@Operate.Retrieve
	public BianResponse<BQRoutingRetrieveOutputModel> retrieveRouting(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRouting(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("session")
	@Operate.Retrieve
	public BianResponse<BQSessionRetrieveOutputModel> retrieveSession(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSession(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Operate.RetrieveSD
	public BianResponse<SDContactHandlerRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Operate.Update
	public BianResponse<CRCustomerContactOperatingSessionUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerContactOperatingSessionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("history")
	@Operate.Update
	public BianResponse<BQHistoryUpdateOutputModel> updateHistory(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQHistoryUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateHistory(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("session")
	@Operate.Update
	public BianResponse<BQSessionUpdateOutputModel> updateSession(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSessionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateSession(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
