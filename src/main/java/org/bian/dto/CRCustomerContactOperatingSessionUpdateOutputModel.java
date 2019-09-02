package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerContactOperatingSessionUpdateOutputModel
 */
public class CRCustomerContactOperatingSessionUpdateOutputModel   {
  private String customerContactOperatingSessionUpdateActionTaskReference = null;

  private Object customerContactOperatingSessionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerContactOperatingSessionUpdateActionTaskReference
  **/

  public String getCustomerContactOperatingSessionUpdateActionTaskReference() {
    return customerContactOperatingSessionUpdateActionTaskReference;
  }

  public void setCustomerContactOperatingSessionUpdateActionTaskReference(String customerContactOperatingSessionUpdateActionTaskReference) {
    this.customerContactOperatingSessionUpdateActionTaskReference = customerContactOperatingSessionUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

