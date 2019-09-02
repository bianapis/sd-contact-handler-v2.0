package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSessionInitiateOutputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord;

import javax.validation.Valid;
  
/**
 * BQSessionInitiateOutputModelCustomerContactOperatingSessionInstanceRecord
 */
public class BQSessionInitiateOutputModelCustomerContactOperatingSessionInstanceRecord   {
  private BQSessionInitiateOutputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord customerContactRecord = null;


  /**
   * Get customerContactRecord
   * @return customerContactRecord
  **/

  public BQSessionInitiateOutputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord getCustomerContactRecord() {
    return customerContactRecord;
  }

  public void setCustomerContactRecord(BQSessionInitiateOutputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
  }


}

