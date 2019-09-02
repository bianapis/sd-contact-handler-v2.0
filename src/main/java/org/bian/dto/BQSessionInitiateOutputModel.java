package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSessionInitiateInputModelSessionInstanceRecord;
import org.bian.dto.BQSessionInitiateOutputModelCustomerContactOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQSessionInitiateOutputModel
 */
public class BQSessionInitiateOutputModel   {
  private BQSessionInitiateOutputModelCustomerContactOperatingSessionInstanceRecord customerContactOperatingSessionInstanceRecord = null;

  private String sessionInstanceReference = null;

  private String sessionInitiateActionReference = null;

  private Object sessionInitiateActionRecord = null;

  private String sessionInstanceStatus = null;

  private BQSessionInitiateInputModelSessionInstanceRecord sessionInstanceRecord = null;


  /**
   * Get customerContactOperatingSessionInstanceRecord
   * @return customerContactOperatingSessionInstanceRecord
  **/

  public BQSessionInitiateOutputModelCustomerContactOperatingSessionInstanceRecord getCustomerContactOperatingSessionInstanceRecord() {
    return customerContactOperatingSessionInstanceRecord;
  }

  public void setCustomerContactOperatingSessionInstanceRecord(BQSessionInitiateOutputModelCustomerContactOperatingSessionInstanceRecord customerContactOperatingSessionInstanceRecord) {
    this.customerContactOperatingSessionInstanceRecord = customerContactOperatingSessionInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return sessionInitiateActionReference
  **/

  public String getSessionInitiateActionReference() {
    return sessionInitiateActionReference;
  }

  public void setSessionInitiateActionReference(String sessionInitiateActionReference) {
    this.sessionInitiateActionReference = sessionInitiateActionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Session instance (e.g. initialised, pending, active) 
   * @return sessionInstanceStatus
  **/

  public String getSessionInstanceStatus() {
    return sessionInstanceStatus;
  }

  public void setSessionInstanceStatus(String sessionInstanceStatus) {
    this.sessionInstanceStatus = sessionInstanceStatus;
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

