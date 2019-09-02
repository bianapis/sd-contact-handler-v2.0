package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSessionExecuteInputModelCustomerContactOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSessionExecuteOutputModel
 */
public class BQSessionExecuteOutputModel   {
  private BQSessionExecuteInputModelCustomerContactOperatingSessionInstanceRecord customerContactOperatingSessionInstanceRecord = null;

  private String sessionExecuteActionTaskReference = null;

  private Object sessionExecuteActionTaskRecord = null;

  private String sessionExecuteRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * Get customerContactOperatingSessionInstanceRecord
   * @return customerContactOperatingSessionInstanceRecord
  **/

  public BQSessionExecuteInputModelCustomerContactOperatingSessionInstanceRecord getCustomerContactOperatingSessionInstanceRecord() {
    return customerContactOperatingSessionInstanceRecord;
  }

  public void setCustomerContactOperatingSessionInstanceRecord(BQSessionExecuteInputModelCustomerContactOperatingSessionInstanceRecord customerContactOperatingSessionInstanceRecord) {
    this.customerContactOperatingSessionInstanceRecord = customerContactOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Session instance execute service call 
   * @return sessionExecuteActionTaskReference
  **/

  public String getSessionExecuteActionTaskReference() {
    return sessionExecuteActionTaskReference;
  }

  public void setSessionExecuteActionTaskReference(String sessionExecuteActionTaskReference) {
    this.sessionExecuteActionTaskReference = sessionExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return sessionExecuteActionTaskRecord
  **/

  public Object getSessionExecuteActionTaskRecord() {
    return sessionExecuteActionTaskRecord;
  }

  public void setSessionExecuteActionTaskRecord(Object sessionExecuteActionTaskRecord) {
    this.sessionExecuteActionTaskRecord = sessionExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Session execute transaction/record 
   * @return sessionExecuteRecordReference
  **/

  public String getSessionExecuteRecordReference() {
    return sessionExecuteRecordReference;
  }

  public void setSessionExecuteRecordReference(String sessionExecuteRecordReference) {
    this.sessionExecuteRecordReference = sessionExecuteRecordReference;
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

