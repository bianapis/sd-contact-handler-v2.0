package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactOperatingSessionControlInputModelCustomerContactOperatingSessionControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerContactOperatingSessionControlInputModel
 */
public class CRCustomerContactOperatingSessionControlInputModel   {
  private String contactHandlerServicingSessionReference = null;

  private String customerContactOperatingSessionInstanceReference = null;

  private Object customerContactOperatingSessionControlActionTaskRecord = null;

  private CRCustomerContactOperatingSessionControlInputModelCustomerContactOperatingSessionControlActionRequest customerContactOperatingSessionControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerContactOperatingSessionControlActionTaskRecord
  **/

  public Object getCustomerContactOperatingSessionControlActionTaskRecord() {
    return customerContactOperatingSessionControlActionTaskRecord;
  }

  public void setCustomerContactOperatingSessionControlActionTaskRecord(Object customerContactOperatingSessionControlActionTaskRecord) {
    this.customerContactOperatingSessionControlActionTaskRecord = customerContactOperatingSessionControlActionTaskRecord;
  }


  /**
   * Get customerContactOperatingSessionControlActionRequest
   * @return customerContactOperatingSessionControlActionRequest
  **/

  public CRCustomerContactOperatingSessionControlInputModelCustomerContactOperatingSessionControlActionRequest getCustomerContactOperatingSessionControlActionRequest() {
    return customerContactOperatingSessionControlActionRequest;
  }

  public void setCustomerContactOperatingSessionControlActionRequest(CRCustomerContactOperatingSessionControlInputModelCustomerContactOperatingSessionControlActionRequest customerContactOperatingSessionControlActionRequest) {
    this.customerContactOperatingSessionControlActionRequest = customerContactOperatingSessionControlActionRequest;
  }


}

