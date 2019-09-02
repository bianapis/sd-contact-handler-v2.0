package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactOperatingSessionInitiateInputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecordActivityRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerContactOperatingSessionInitiateOutputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord
 */
public class CRCustomerContactOperatingSessionInitiateOutputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord   {
  private String customerContactRecordAuthenticationStatus = null;

  private String customerContactRecordRoutingSelectionStatus = null;

  private String customerContactRecordServicingPositionReference = null;

  private String customerContactRecordServicingResourceReference = null;

  private CRCustomerContactOperatingSessionInitiateInputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecordActivityRecord customerContactRecordActivityRecord = null;

  private String customerContactRecordDuration = null;

  private String customerContactRecordResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The contact authentication level is determined by the authentication function and can be updated during the contact 
   * @return customerContactRecordAuthenticationStatus
  **/

  public String getCustomerContactRecordAuthenticationStatus() {
    return customerContactRecordAuthenticationStatus;
  }

  public void setCustomerContactRecordAuthenticationStatus(String customerContactRecordAuthenticationStatus) {
    this.customerContactRecordAuthenticationStatus = customerContactRecordAuthenticationStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The routing selections made through the contact 
   * @return customerContactRecordRoutingSelectionStatus
  **/

  public String getCustomerContactRecordRoutingSelectionStatus() {
    return customerContactRecordRoutingSelectionStatus;
  }

  public void setCustomerContactRecordRoutingSelectionStatus(String customerContactRecordRoutingSelectionStatus) {
    this.customerContactRecordRoutingSelectionStatus = customerContactRecordRoutingSelectionStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the servicing position - can be where an inbound contact is routed, or the source of an outbound contact request 
   * @return customerContactRecordServicingPositionReference
  **/

  public String getCustomerContactRecordServicingPositionReference() {
    return customerContactRecordServicingPositionReference;
  }

  public void setCustomerContactRecordServicingPositionReference(String customerContactRecordServicingPositionReference) {
    this.customerContactRecordServicingPositionReference = customerContactRecordServicingPositionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the servicing resource - can be to handle an inbound contact or the source of an outbound contact request 
   * @return customerContactRecordServicingResourceReference
  **/

  public String getCustomerContactRecordServicingResourceReference() {
    return customerContactRecordServicingResourceReference;
  }

  public void setCustomerContactRecordServicingResourceReference(String customerContactRecordServicingResourceReference) {
    this.customerContactRecordServicingResourceReference = customerContactRecordServicingResourceReference;
  }


  /**
   * Get customerContactRecordActivityRecord
   * @return customerContactRecordActivityRecord
  **/

  public CRCustomerContactOperatingSessionInitiateInputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecordActivityRecord getCustomerContactRecordActivityRecord() {
    return customerContactRecordActivityRecord;
  }

  public void setCustomerContactRecordActivityRecord(CRCustomerContactOperatingSessionInitiateInputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecordActivityRecord customerContactRecordActivityRecord) {
    this.customerContactRecordActivityRecord = customerContactRecordActivityRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Records the start and end date times for the contact 
   * @return customerContactRecordDuration
  **/

  public String getCustomerContactRecordDuration() {
    return customerContactRecordDuration;
  }

  public void setCustomerContactRecordDuration(String customerContactRecordDuration) {
    this.customerContactRecordDuration = customerContactRecordDuration;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Describes the interpreted result of the contact (e.g. completed, customer terminated, timed-out) 
   * @return customerContactRecordResult
  **/

  public String getCustomerContactRecordResult() {
    return customerContactRecordResult;
  }

  public void setCustomerContactRecordResult(String customerContactRecordResult) {
    this.customerContactRecordResult = customerContactRecordResult;
  }


}

