package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerContactOperatingSessionRequestOutputModel
 */
public class CRCustomerContactOperatingSessionRequestOutputModel   {
  private String customerContactOperatingSessionRequestActionTaskReference = null;

  private Object customerContactOperatingSessionRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Contact Operating Session instance request service call 
   * @return customerContactOperatingSessionRequestActionTaskReference
  **/

  public String getCustomerContactOperatingSessionRequestActionTaskReference() {
    return customerContactOperatingSessionRequestActionTaskReference;
  }

  public void setCustomerContactOperatingSessionRequestActionTaskReference(String customerContactOperatingSessionRequestActionTaskReference) {
    this.customerContactOperatingSessionRequestActionTaskReference = customerContactOperatingSessionRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerContactOperatingSessionRequestActionTaskRecord
  **/

  public Object getCustomerContactOperatingSessionRequestActionTaskRecord() {
    return customerContactOperatingSessionRequestActionTaskRecord;
  }

  public void setCustomerContactOperatingSessionRequestActionTaskRecord(Object customerContactOperatingSessionRequestActionTaskRecord) {
    this.customerContactOperatingSessionRequestActionTaskRecord = customerContactOperatingSessionRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

