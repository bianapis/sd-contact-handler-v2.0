package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactOperatingSessionInitiateInputModelCustomerContactOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerContactOperatingSessionInitiateInputModel
 */
public class CRCustomerContactOperatingSessionInitiateInputModel   {
  private String contactHandlerServicingSessionReference = null;

  private Object customerContactOperatingSessionInitiateActionRecord = null;

  private String customerContactOperatingSessionInstanceStatus = null;

  private CRCustomerContactOperatingSessionInitiateInputModelCustomerContactOperatingSessionInstanceRecord customerContactOperatingSessionInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerContactOperatingSessionInitiateActionRecord
  **/

  public Object getCustomerContactOperatingSessionInitiateActionRecord() {
    return customerContactOperatingSessionInitiateActionRecord;
  }

  public void setCustomerContactOperatingSessionInitiateActionRecord(Object customerContactOperatingSessionInitiateActionRecord) {
    this.customerContactOperatingSessionInitiateActionRecord = customerContactOperatingSessionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Contact Operating Session instance (e.g. initialised, pending, active) 
   * @return customerContactOperatingSessionInstanceStatus
  **/

  public String getCustomerContactOperatingSessionInstanceStatus() {
    return customerContactOperatingSessionInstanceStatus;
  }

  public void setCustomerContactOperatingSessionInstanceStatus(String customerContactOperatingSessionInstanceStatus) {
    this.customerContactOperatingSessionInstanceStatus = customerContactOperatingSessionInstanceStatus;
  }


  /**
   * Get customerContactOperatingSessionInstanceRecord
   * @return customerContactOperatingSessionInstanceRecord
  **/

  public CRCustomerContactOperatingSessionInitiateInputModelCustomerContactOperatingSessionInstanceRecord getCustomerContactOperatingSessionInstanceRecord() {
    return customerContactOperatingSessionInstanceRecord;
  }

  public void setCustomerContactOperatingSessionInstanceRecord(CRCustomerContactOperatingSessionInitiateInputModelCustomerContactOperatingSessionInstanceRecord customerContactOperatingSessionInstanceRecord) {
    this.customerContactOperatingSessionInstanceRecord = customerContactOperatingSessionInstanceRecord;
  }


}

