package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerContactOperatingSessionControlOutputModel
 */
public class CRCustomerContactOperatingSessionControlOutputModel   {
  private String customerContactOperatingSessionControlActionTaskReference = null;

  private Object customerContactOperatingSessionControlActionTaskRecord = null;

  private String customerContactOperatingSessionControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Contact Operating Session instance control processing service call 
   * @return customerContactOperatingSessionControlActionTaskReference
  **/

  public String getCustomerContactOperatingSessionControlActionTaskReference() {
    return customerContactOperatingSessionControlActionTaskReference;
  }

  public void setCustomerContactOperatingSessionControlActionTaskReference(String customerContactOperatingSessionControlActionTaskReference) {
    this.customerContactOperatingSessionControlActionTaskReference = customerContactOperatingSessionControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return customerContactOperatingSessionControlActionResponse
  **/

  public String getCustomerContactOperatingSessionControlActionResponse() {
    return customerContactOperatingSessionControlActionResponse;
  }

  public void setCustomerContactOperatingSessionControlActionResponse(String customerContactOperatingSessionControlActionResponse) {
    this.customerContactOperatingSessionControlActionResponse = customerContactOperatingSessionControlActionResponse;
  }


}

