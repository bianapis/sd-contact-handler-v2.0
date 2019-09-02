package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSessionRetrieveOutputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord;

import javax.validation.Valid;
  
/**
 * BQSessionRetrieveOutputModelCustomerContactOperatingSessionInstanceRecord
 */
public class BQSessionRetrieveOutputModelCustomerContactOperatingSessionInstanceRecord   {
  private BQSessionRetrieveOutputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord customerContactRecord = null;


  /**
   * Get customerContactRecord
   * @return customerContactRecord
  **/

  public BQSessionRetrieveOutputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord getCustomerContactRecord() {
    return customerContactRecord;
  }

  public void setCustomerContactRecord(BQSessionRetrieveOutputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
  }


}

