package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerContactOperatingSessionExchangeOutputModel
 */
public class CRCustomerContactOperatingSessionExchangeOutputModel   {
  private String customerContactOperatingSessionExchangeActionTaskReference = null;

  private Object customerContactOperatingSessionExchangeActionTaskRecord = null;

  private String customerContactOperatingSessionExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Contact Operating Session instance exchange service call 
   * @return customerContactOperatingSessionExchangeActionTaskReference
  **/

  public String getCustomerContactOperatingSessionExchangeActionTaskReference() {
    return customerContactOperatingSessionExchangeActionTaskReference;
  }

  public void setCustomerContactOperatingSessionExchangeActionTaskReference(String customerContactOperatingSessionExchangeActionTaskReference) {
    this.customerContactOperatingSessionExchangeActionTaskReference = customerContactOperatingSessionExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return customerContactOperatingSessionExchangeActionResponse
  **/

  public String getCustomerContactOperatingSessionExchangeActionResponse() {
    return customerContactOperatingSessionExchangeActionResponse;
  }

  public void setCustomerContactOperatingSessionExchangeActionResponse(String customerContactOperatingSessionExchangeActionResponse) {
    this.customerContactOperatingSessionExchangeActionResponse = customerContactOperatingSessionExchangeActionResponse;
  }


}

