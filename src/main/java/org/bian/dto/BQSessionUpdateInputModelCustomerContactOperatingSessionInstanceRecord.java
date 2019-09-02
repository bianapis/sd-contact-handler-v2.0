package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSessionUpdateInputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord;

import javax.validation.Valid;
  
/**
 * BQSessionUpdateInputModelCustomerContactOperatingSessionInstanceRecord
 */
public class BQSessionUpdateInputModelCustomerContactOperatingSessionInstanceRecord   {
  private BQSessionUpdateInputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord customerContactRecord = null;


  /**
   * Get customerContactRecord
   * @return customerContactRecord
  **/

  public BQSessionUpdateInputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord getCustomerContactRecord() {
    return customerContactRecord;
  }

  public void setCustomerContactRecord(BQSessionUpdateInputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
  }


}

