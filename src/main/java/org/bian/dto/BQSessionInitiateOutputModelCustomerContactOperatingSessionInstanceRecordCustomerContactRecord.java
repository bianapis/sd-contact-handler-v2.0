package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSessionInitiateInputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecordActivityRecord;

import javax.validation.Valid;
  
/**
 * BQSessionInitiateOutputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord
 */
public class BQSessionInitiateOutputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord   {
  private String customerContactRecordAuthenticationStatus = null;

  private String customerContactRecordRoutingSelectionStatus = null;

  private BQSessionInitiateInputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecordActivityRecord customerContactRecordActivityRecord = null;

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
   * Get customerContactRecordActivityRecord
   * @return customerContactRecordActivityRecord
  **/

  public BQSessionInitiateInputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecordActivityRecord getCustomerContactRecordActivityRecord() {
    return customerContactRecordActivityRecord;
  }

  public void setCustomerContactRecordActivityRecord(BQSessionInitiateInputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecordActivityRecord customerContactRecordActivityRecord) {
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

