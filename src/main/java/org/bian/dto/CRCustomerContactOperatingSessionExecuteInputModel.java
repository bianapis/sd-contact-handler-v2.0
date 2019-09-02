package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactOperatingSessionExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerContactOperatingSessionExecuteInputModel
 */
public class CRCustomerContactOperatingSessionExecuteInputModel   {
  private String contactHandlerServicingSessionReference = null;

  private String customerContactOperatingSessionInstanceReference = null;

  private Object customerContactOperatingSessionExecuteActionTaskRecord = null;

  private CRCustomerContactOperatingSessionExecuteInputModelExecuteRecordType executeRecordType = null;


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

