package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSessionExecuteInputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord;

import javax.validation.Valid;
  
/**
 * BQSessionExecuteInputModelCustomerContactOperatingSessionInstanceRecord
 */
public class BQSessionExecuteInputModelCustomerContactOperatingSessionInstanceRecord   {
  private BQSessionExecuteInputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord customerContactRecord = null;


  /**
   * Get customerContactRecord
   * @return customerContactRecord
  **/

  public BQSessionExecuteInputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord getCustomerContactRecord() {
    return customerContactRecord;
  }

  public void setCustomerContactRecord(BQSessionExecuteInputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
  }


}

