package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerContactOperatingSessionUpdateInputModel
 */
public class CRCustomerContactOperatingSessionUpdateInputModel   {
  private String contactHandlerServicingSessionReference = null;

  private String customerContactOperatingSessionInstanceReference = null;

  private Object customerContactOperatingSessionUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerContactOperatingSessionUpdateActionTaskRecord
  **/

  public Object getCustomerContactOperatingSessionUpdateActionTaskRecord() {
    return customerContactOperatingSessionUpdateActionTaskRecord;
  }

  public void setCustomerContactOperatingSessionUpdateActionTaskRecord(Object customerContactOperatingSessionUpdateActionTaskRecord) {
    this.customerContactOperatingSessionUpdateActionTaskRecord = customerContactOperatingSessionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

