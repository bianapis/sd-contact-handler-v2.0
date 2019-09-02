package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQHistoryUpdateInputModelCustomerContactOperatingSessionInstanceRecord;
import org.bian.dto.BQHistoryUpdateInputModelHistoryInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQHistoryUpdateOutputModel
 */
public class BQHistoryUpdateOutputModel   {
  private BQHistoryUpdateInputModelCustomerContactOperatingSessionInstanceRecord customerContactOperatingSessionInstanceRecord = null;

  private BQHistoryUpdateInputModelHistoryInstanceRecord historyInstanceRecord = null;

  private String historyUpdateActionTaskReference = null;

  private Object historyUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return historyUpdateActionTaskReference
  **/

  public String getHistoryUpdateActionTaskReference() {
    return historyUpdateActionTaskReference;
  }

  public void setHistoryUpdateActionTaskReference(String historyUpdateActionTaskReference) {
    this.historyUpdateActionTaskReference = historyUpdateActionTaskReference;
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

