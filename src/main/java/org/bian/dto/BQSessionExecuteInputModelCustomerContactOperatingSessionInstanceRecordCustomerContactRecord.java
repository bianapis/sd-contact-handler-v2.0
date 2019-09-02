package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSessionExecuteInputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord
 */
public class BQSessionExecuteInputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord   {
  private String customerContactRecordAuthenticationStatus = null;


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


}

