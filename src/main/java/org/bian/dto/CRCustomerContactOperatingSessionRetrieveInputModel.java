package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactOperatingSessionRetrieveInputModelCustomerContactOperatingSessionInstanceAnalysis;
import org.bian.dto.CRCustomerContactOperatingSessionRetrieveInputModelCustomerContactOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerContactOperatingSessionRetrieveInputModel
 */
public class CRCustomerContactOperatingSessionRetrieveInputModel   {
  private Object customerContactOperatingSessionRetrieveActionTaskRecord = null;

  private String customerContactOperatingSessionRetrieveActionRequest = null;

  private CRCustomerContactOperatingSessionRetrieveInputModelCustomerContactOperatingSessionInstanceReportRecord customerContactOperatingSessionInstanceReportRecord = null;

  private CRCustomerContactOperatingSessionRetrieveInputModelCustomerContactOperatingSessionInstanceAnalysis customerContactOperatingSessionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerContactOperatingSessionRetrieveActionTaskRecord
  **/

  public Object getCustomerContactOperatingSessionRetrieveActionTaskRecord() {
    return customerContactOperatingSessionRetrieveActionTaskRecord;
  }

  public void setCustomerContactOperatingSessionRetrieveActionTaskRecord(Object customerContactOperatingSessionRetrieveActionTaskRecord) {
    this.customerContactOperatingSessionRetrieveActionTaskRecord = customerContactOperatingSessionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerContactOperatingSessionRetrieveActionRequest
  **/

  public String getCustomerContactOperatingSessionRetrieveActionRequest() {
    return customerContactOperatingSessionRetrieveActionRequest;
  }

  public void setCustomerContactOperatingSessionRetrieveActionRequest(String customerContactOperatingSessionRetrieveActionRequest) {
    this.customerContactOperatingSessionRetrieveActionRequest = customerContactOperatingSessionRetrieveActionRequest;
  }


  /**
   * Get customerContactOperatingSessionInstanceReportRecord
   * @return customerContactOperatingSessionInstanceReportRecord
  **/

  public CRCustomerContactOperatingSessionRetrieveInputModelCustomerContactOperatingSessionInstanceReportRecord getCustomerContactOperatingSessionInstanceReportRecord() {
    return customerContactOperatingSessionInstanceReportRecord;
  }

  public void setCustomerContactOperatingSessionInstanceReportRecord(CRCustomerContactOperatingSessionRetrieveInputModelCustomerContactOperatingSessionInstanceReportRecord customerContactOperatingSessionInstanceReportRecord) {
    this.customerContactOperatingSessionInstanceReportRecord = customerContactOperatingSessionInstanceReportRecord;
  }


  /**
   * Get customerContactOperatingSessionInstanceAnalysis
   * @return customerContactOperatingSessionInstanceAnalysis
  **/

  public CRCustomerContactOperatingSessionRetrieveInputModelCustomerContactOperatingSessionInstanceAnalysis getCustomerContactOperatingSessionInstanceAnalysis() {
    return customerContactOperatingSessionInstanceAnalysis;
  }

  public void setCustomerContactOperatingSessionInstanceAnalysis(CRCustomerContactOperatingSessionRetrieveInputModelCustomerContactOperatingSessionInstanceAnalysis customerContactOperatingSessionInstanceAnalysis) {
    this.customerContactOperatingSessionInstanceAnalysis = customerContactOperatingSessionInstanceAnalysis;
  }


}

