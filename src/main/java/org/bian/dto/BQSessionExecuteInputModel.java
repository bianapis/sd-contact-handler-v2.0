package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSessionExecuteInputModelCustomerContactOperatingSessionInstanceRecord;
import org.bian.dto.CRCustomerContactOperatingSessionExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * BQSessionExecuteInputModel
 */
public class BQSessionExecuteInputModel   {
  private BQSessionExecuteInputModelCustomerContactOperatingSessionInstanceRecord customerContactOperatingSessionInstanceRecord = null;

  private String customerContactOperatingSessionInstanceReference = null;

  private String sessionInstanceReference = null;

  private Object sessionExecuteActionTaskRecord = null;

  private CRCustomerContactOperatingSessionExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRCustomerContactOperatingSessionExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRCustomerContactOperatingSessionExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

