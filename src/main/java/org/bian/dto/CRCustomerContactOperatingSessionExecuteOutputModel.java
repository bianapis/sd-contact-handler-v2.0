package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerContactOperatingSessionExecuteOutputModel
 */
public class CRCustomerContactOperatingSessionExecuteOutputModel   {
  private String customerContactOperatingSessionExecuteActionTaskReference = null;

  private Object customerContactOperatingSessionExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Contact Operating Session instance execute service call 
   * @return customerContactOperatingSessionExecuteActionTaskReference
  **/

  public String getCustomerContactOperatingSessionExecuteActionTaskReference() {
    return customerContactOperatingSessionExecuteActionTaskReference;
  }

  public void setCustomerContactOperatingSessionExecuteActionTaskReference(String customerContactOperatingSessionExecuteActionTaskReference) {
    this.customerContactOperatingSessionExecuteActionTaskReference = customerContactOperatingSessionExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return customerContactOperatingSessionExecuteActionTaskRecord
  **/

  public Object getCustomerContactOperatingSessionExecuteActionTaskRecord() {
    return customerContactOperatingSessionExecuteActionTaskRecord;
  }

  public void setCustomerContactOperatingSessionExecuteActionTaskRecord(Object customerContactOperatingSessionExecuteActionTaskRecord) {
    this.customerContactOperatingSessionExecuteActionTaskRecord = customerContactOperatingSessionExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

