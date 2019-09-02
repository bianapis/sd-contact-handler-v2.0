package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactOperatingSessionInitiateOutputModelCustomerContactOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerContactOperatingSessionInitiateOutputModel
 */
public class CRCustomerContactOperatingSessionInitiateOutputModel   {
  private String customerContactOperatingSessionInstanceReference = null;

  private String customerContactOperatingSessionInitiateActionReference = null;

  private Object customerContactOperatingSessionInitiateActionRecord = null;

  private String customerContactOperatingSessionInstanceStatus = null;

  private CRCustomerContactOperatingSessionInitiateOutputModelCustomerContactOperatingSessionInstanceRecord customerContactOperatingSessionInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return customerContactOperatingSessionInitiateActionReference
  **/

  public String getCustomerContactOperatingSessionInitiateActionReference() {
    return customerContactOperatingSessionInitiateActionReference;
  }

  public void setCustomerContactOperatingSessionInitiateActionReference(String customerContactOperatingSessionInitiateActionReference) {
    this.customerContactOperatingSessionInitiateActionReference = customerContactOperatingSessionInitiateActionReference;
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

  public CRCustomerContactOperatingSessionInitiateOutputModelCustomerContactOperatingSessionInstanceRecord getCustomerContactOperatingSessionInstanceRecord() {
    return customerContactOperatingSessionInstanceRecord;
  }

  public void setCustomerContactOperatingSessionInstanceRecord(CRCustomerContactOperatingSessionInitiateOutputModelCustomerContactOperatingSessionInstanceRecord customerContactOperatingSessionInstanceRecord) {
    this.customerContactOperatingSessionInstanceRecord = customerContactOperatingSessionInstanceRecord;
  }


}

