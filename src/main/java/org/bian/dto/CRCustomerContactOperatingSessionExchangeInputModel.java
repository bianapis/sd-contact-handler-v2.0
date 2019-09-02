package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactOperatingSessionExchangeInputModelCustomerContactOperatingSessionExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerContactOperatingSessionExchangeInputModel
 */
public class CRCustomerContactOperatingSessionExchangeInputModel   {
  private String contactHandlerServicingSessionReference = null;

  private String customerContactOperatingSessionInstanceReference = null;

  private Object customerContactOperatingSessionExchangeActionTaskRecord = null;

  private CRCustomerContactOperatingSessionExchangeInputModelCustomerContactOperatingSessionExchangeActionRequest customerContactOperatingSessionExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return contactHandlerServicingSessionReference
  **/

  public String getContactHandlerServicingSessionReference() {
    return contactHandlerServicingSessionReference;
  }

  public void setContactHandlerServicingSessionReference(String contactHandlerServicingSessionReference) {
    this.contactHandlerServicingSessionReference = contactHandlerServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Contact Operating Session instance 
   * @return customerContactOperatingSessionInstanceReference
  **/

  public String getCustomerContactOperatingSessionInstanceReference() {
    return customerContactOperatingSessionInstanceReference;
  }

  public void setCustomerContactOperatingSessionInstanceReference(String customerContactOperatingSessionInstanceReference) {
    this.customerContactOperatingSessionInstanceReference = customerContactOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return customerContactOperatingSessionExchangeActionTaskRecord
  **/

  public Object getCustomerContactOperatingSessionExchangeActionTaskRecord() {
    return customerContactOperatingSessionExchangeActionTaskRecord;
  }

  public void setCustomerContactOperatingSessionExchangeActionTaskRecord(Object customerContactOperatingSessionExchangeActionTaskRecord) {
    this.customerContactOperatingSessionExchangeActionTaskRecord = customerContactOperatingSessionExchangeActionTaskRecord;
  }


  /**
   * Get customerContactOperatingSessionExchangeActionRequest
   * @return customerContactOperatingSessionExchangeActionRequest
  **/

  public CRCustomerContactOperatingSessionExchangeInputModelCustomerContactOperatingSessionExchangeActionRequest getCustomerContactOperatingSessionExchangeActionRequest() {
    return customerContactOperatingSessionExchangeActionRequest;
  }

  public void setCustomerContactOperatingSessionExchangeActionRequest(CRCustomerContactOperatingSessionExchangeInputModelCustomerContactOperatingSessionExchangeActionRequest customerContactOperatingSessionExchangeActionRequest) {
    this.customerContactOperatingSessionExchangeActionRequest = customerContactOperatingSessionExchangeActionRequest;
  }


}

