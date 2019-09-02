package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQHistoryUpdateInputModelCustomerContactOperatingSessionInstanceRecord;
import org.bian.dto.BQHistoryUpdateInputModelHistoryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQHistoryUpdateInputModel
 */
public class BQHistoryUpdateInputModel   {
  private BQHistoryUpdateInputModelCustomerContactOperatingSessionInstanceRecord customerContactOperatingSessionInstanceRecord = null;

  private String customerContactOperatingSessionInstanceReference = null;

  private String historyInstanceReference = null;

  private BQHistoryUpdateInputModelHistoryInstanceRecord historyInstanceRecord = null;

  private Object historyUpdateActionTaskRecord = null;

  private String historyUpdateActionRequest = null;


  /**
   * Get customerContactOperatingSessionInstanceRecord
   * @return customerContactOperatingSessionInstanceRecord
  **/

  public BQHistoryUpdateInputModelCustomerContactOperatingSessionInstanceRecord getCustomerContactOperatingSessionInstanceRecord() {
    return customerContactOperatingSessionInstanceRecord;
  }

  public void setCustomerContactOperatingSessionInstanceRecord(BQHistoryUpdateInputModelCustomerContactOperatingSessionInstanceRecord customerContactOperatingSessionInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the History instance 
   * @return historyInstanceReference
  **/

  public String getHistoryInstanceReference() {
    return historyInstanceReference;
  }

  public void setHistoryInstanceReference(String historyInstanceReference) {
    this.historyInstanceReference = historyInstanceReference;
  }


  /**
   * Get historyInstanceRecord
   * @return historyInstanceRecord
  **/

  public BQHistoryUpdateInputModelHistoryInstanceRecord getHistoryInstanceRecord() {
    return historyInstanceRecord;
  }

  public void setHistoryInstanceRecord(BQHistoryUpdateInputModelHistoryInstanceRecord historyInstanceRecord) {
    this.historyInstanceRecord = historyInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return historyUpdateActionTaskRecord
  **/

  public Object getHistoryUpdateActionTaskRecord() {
    return historyUpdateActionTaskRecord;
  }

  public void setHistoryUpdateActionTaskRecord(Object historyUpdateActionTaskRecord) {
    this.historyUpdateActionTaskRecord = historyUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return historyUpdateActionRequest
  **/

  public String getHistoryUpdateActionRequest() {
    return historyUpdateActionRequest;
  }

  public void setHistoryUpdateActionRequest(String historyUpdateActionRequest) {
    this.historyUpdateActionRequest = historyUpdateActionRequest;
  }


}

