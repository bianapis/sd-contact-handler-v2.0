package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRoutingRetrieveOutputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecordActivityRecord;

import javax.validation.Valid;
  
/**
 * BQRoutingRetrieveOutputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord
 */
public class BQRoutingRetrieveOutputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord   {
  private String customerContactRecordCustomerReference = null;

  private String customerContactRecordContactDevice = null;

  private String customerContactRecordAuthenticationStatus = null;

  private String customerContactRecordRoutingSelectionStatus = null;

  private String customerContactRecordMenuSelection = null;

  private String customerContactRecordServicingRequest = null;

  private String customerContactRecordServicingEventHistory = null;

  private BQRoutingRetrieveOutputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecordActivityRecord customerContactRecordActivityRecord = null;


  /**
   * `status: Registered`  iso-link: https://www.iso20022.org/standardsrepository/public/wqt/Description/mx/dico/bc/_EteNwcTGEeChad0JzLk7QA_-980814386  bian-reference:   general-info: The customer reference as provided by the contacting party and verified by the authentication function 
   * @return customerContactRecordCustomerReference
  **/

  public String getCustomerContactRecordCustomerReference() {
    return customerContactRecordCustomerReference;
  }

  public void setCustomerContactRecordCustomerReference(String customerContactRecordCustomerReference) {
    this.customerContactRecordCustomerReference = customerContactRecordCustomerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The contact device can be determined by the channel operations facilities (e.g. URL/ANI-phone number) 
   * @return customerContactRecordContactDevice
  **/

  public String getCustomerContactRecordContactDevice() {
    return customerContactRecordContactDevice;
  }

  public void setCustomerContactRecordContactDevice(String customerContactRecordContactDevice) {
    this.customerContactRecordContactDevice = customerContactRecordContactDevice;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested service from a menu option can be indicated by the customer when initiating or during contact 
   * @return customerContactRecordMenuSelection
  **/

  public String getCustomerContactRecordMenuSelection() {
    return customerContactRecordMenuSelection;
  }

  public void setCustomerContactRecordMenuSelection(String customerContactRecordMenuSelection) {
    this.customerContactRecordMenuSelection = customerContactRecordMenuSelection;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The customer may provide details of servicing resource request when initiating or during contact 
   * @return customerContactRecordServicingRequest
  **/

  public String getCustomerContactRecordServicingRequest() {
    return customerContactRecordServicingRequest;
  }

  public void setCustomerContactRecordServicingRequest(String customerContactRecordServicingRequest) {
    this.customerContactRecordServicingRequest = customerContactRecordServicingRequest;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Contact Handler can reference recent servicing activity for routing, security and servicing purposes (obtained from Service Domain Channel Activity History) 
   * @return customerContactRecordServicingEventHistory
  **/

  public String getCustomerContactRecordServicingEventHistory() {
    return customerContactRecordServicingEventHistory;
  }

  public void setCustomerContactRecordServicingEventHistory(String customerContactRecordServicingEventHistory) {
    this.customerContactRecordServicingEventHistory = customerContactRecordServicingEventHistory;
  }


  /**
   * Get customerContactRecordActivityRecord
   * @return customerContactRecordActivityRecord
  **/

  public BQRoutingRetrieveOutputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecordActivityRecord getCustomerContactRecordActivityRecord() {
    return customerContactRecordActivityRecord;
  }

  public void setCustomerContactRecordActivityRecord(BQRoutingRetrieveOutputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecordActivityRecord customerContactRecordActivityRecord) {
    this.customerContactRecordActivityRecord = customerContactRecordActivityRecord;
  }


}

