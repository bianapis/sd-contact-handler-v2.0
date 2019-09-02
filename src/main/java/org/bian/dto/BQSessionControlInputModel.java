package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactOperatingSessionControlInputModelCustomerContactOperatingSessionControlActionRequest;

import javax.validation.Valid;
  
/**
 * BQSessionControlInputModel
 */
public class BQSessionControlInputModel   {
  private String customerContactOperatingSessionInstanceReference = null;

  private String sessionInstanceReference = null;

  private Object sessionControlActionTaskRecord = null;

  private CRCustomerContactOperatingSessionControlInputModelCustomerContactOperatingSessionControlActionRequest sessionControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Contact Operating Session instance 
   * @return customerContactOperatingSessionInstanceReference
  **/

  public String getCustomerContactOperatingSessionInstanceReference() {
    return customerContactOperatingSessionInstanceReference;
  }

  public void setCustomerContactOperatingSessionInstanceReference(String customerContactOperatingSessionInstanceReference) {
    this.customerContactOperatingSessionInstanceReference = customerContactOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Session instance 
   * @return sessionInstanceReference
  **/

  public String getSessionInstanceReference() {
    return sessionInstanceReference;
  }

  public void setSessionInstanceReference(String sessionInstanceReference) {
    this.sessionInstanceReference = sessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return sessionControlActionTaskRecord
  **/

  public Object getSessionControlActionTaskRecord() {
    return sessionControlActionTaskRecord;
  }

  public void setSessionControlActionTaskRecord(Object sessionControlActionTaskRecord) {
    this.sessionControlActionTaskRecord = sessionControlActionTaskRecord;
  }


  /**
   * Get sessionControlActionRequest
   * @return sessionControlActionRequest
  **/

  public CRCustomerContactOperatingSessionControlInputModelCustomerContactOperatingSessionControlActionRequest getSessionControlActionRequest() {
    return sessionControlActionRequest;
  }

  public void setSessionControlActionRequest(CRCustomerContactOperatingSessionControlInputModelCustomerContactOperatingSessionControlActionRequest sessionControlActionRequest) {
    this.sessionControlActionRequest = sessionControlActionRequest;
  }


}

