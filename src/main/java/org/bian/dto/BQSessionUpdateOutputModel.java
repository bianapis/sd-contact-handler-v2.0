package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSessionUpdateInputModelCustomerContactOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSessionUpdateOutputModel
 */
public class BQSessionUpdateOutputModel   {
  private BQSessionUpdateInputModelCustomerContactOperatingSessionInstanceRecord customerContactOperatingSessionInstanceRecord = null;

  private String sessionUpdateActionTaskReference = null;

  private Object sessionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get customerContactOperatingSessionInstanceRecord
   * @return customerContactOperatingSessionInstanceRecord
  **/

  public BQSessionUpdateInputModelCustomerContactOperatingSessionInstanceRecord getCustomerContactOperatingSessionInstanceRecord() {
    return customerContactOperatingSessionInstanceRecord;
  }

  public void setCustomerContactOperatingSessionInstanceRecord(BQSessionUpdateInputModelCustomerContactOperatingSessionInstanceRecord customerContactOperatingSessionInstanceRecord) {
    this.customerContactOperatingSessionInstanceRecord = customerContactOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return sessionUpdateActionTaskReference
  **/

  public String getSessionUpdateActionTaskReference() {
    return sessionUpdateActionTaskReference;
  }

  public void setSessionUpdateActionTaskReference(String sessionUpdateActionTaskReference) {
    this.sessionUpdateActionTaskReference = sessionUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return sessionUpdateActionTaskRecord
  **/

  public Object getSessionUpdateActionTaskRecord() {
    return sessionUpdateActionTaskRecord;
  }

  public void setSessionUpdateActionTaskRecord(Object sessionUpdateActionTaskRecord) {
    this.sessionUpdateActionTaskRecord = sessionUpdateActionTaskRecord;
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

