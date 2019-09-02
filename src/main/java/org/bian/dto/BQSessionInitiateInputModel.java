package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSessionInitiateInputModelCustomerContactOperatingSessionInstanceRecord;
import org.bian.dto.BQSessionInitiateInputModelSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSessionInitiateInputModel
 */
public class BQSessionInitiateInputModel   {
  private BQSessionInitiateInputModelCustomerContactOperatingSessionInstanceRecord customerContactOperatingSessionInstanceRecord = null;

  private String customerContactOperatingSessionInstanceReference = null;

  private Object sessionInitiateActionRecord = null;

  private BQSessionInitiateInputModelSessionInstanceRecord sessionInstanceRecord = null;


  /**
   * Get customerContactOperatingSessionInstanceRecord
   * @return customerContactOperatingSessionInstanceRecord
  **/

  public BQSessionInitiateInputModelCustomerContactOperatingSessionInstanceRecord getCustomerContactOperatingSessionInstanceRecord() {
    return customerContactOperatingSessionInstanceRecord;
  }

  public void setCustomerContactOperatingSessionInstanceRecord(BQSessionInitiateInputModelCustomerContactOperatingSessionInstanceRecord customerContactOperatingSessionInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return sessionInitiateActionRecord
  **/

  public Object getSessionInitiateActionRecord() {
    return sessionInitiateActionRecord;
  }

  public void setSessionInitiateActionRecord(Object sessionInitiateActionRecord) {
    this.sessionInitiateActionRecord = sessionInitiateActionRecord;
  }


  /**
   * Get sessionInstanceRecord
   * @return sessionInstanceRecord
  **/

  public BQSessionInitiateInputModelSessionInstanceRecord getSessionInstanceRecord() {
    return sessionInstanceRecord;
  }

  public void setSessionInstanceRecord(BQSessionInitiateInputModelSessionInstanceRecord sessionInstanceRecord) {
    this.sessionInstanceRecord = sessionInstanceRecord;
  }


}

