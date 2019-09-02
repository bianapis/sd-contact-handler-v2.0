package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactOperatingSessionRetrieveOutputModelCustomerContactOperatingSessionInstanceAnalysis;
import org.bian.dto.CRCustomerContactOperatingSessionRetrieveOutputModelCustomerContactOperatingSessionInstanceRecord;
import org.bian.dto.CRCustomerContactOperatingSessionRetrieveOutputModelCustomerContactOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerContactOperatingSessionRetrieveOutputModel
 */
public class CRCustomerContactOperatingSessionRetrieveOutputModel   {
  private CRCustomerContactOperatingSessionRetrieveOutputModelCustomerContactOperatingSessionInstanceRecord customerContactOperatingSessionInstanceRecord = null;

  private String customerContactOperatingSessionRetrieveActionTaskReference = null;

  private Object customerContactOperatingSessionRetrieveActionTaskRecord = null;

  private String customerContactOperatingSessionRetrieveActionResponse = null;

  private CRCustomerContactOperatingSessionRetrieveOutputModelCustomerContactOperatingSessionInstanceReportRecord customerContactOperatingSessionInstanceReportRecord = null;

  private CRCustomerContactOperatingSessionRetrieveOutputModelCustomerContactOperatingSessionInstanceAnalysis customerContactOperatingSessionInstanceAnalysis = null;


  /**
   * Get customerContactOperatingSessionInstanceRecord
   * @return customerContactOperatingSessionInstanceRecord
  **/

  public CRCustomerContactOperatingSessionRetrieveOutputModelCustomerContactOperatingSessionInstanceRecord getCustomerContactOperatingSessionInstanceRecord() {
    return customerContactOperatingSessionInstanceRecord;
  }

  public void setCustomerContactOperatingSessionInstanceRecord(CRCustomerContactOperatingSessionRetrieveOutputModelCustomerContactOperatingSessionInstanceRecord customerContactOperatingSessionInstanceRecord) {
    this.customerContactOperatingSessionInstanceRecord = customerContactOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Contact Operating Session instance retrieve service call 
   * @return customerContactOperatingSessionRetrieveActionTaskReference
  **/

  public String getCustomerContactOperatingSessionRetrieveActionTaskReference() {
    return customerContactOperatingSessionRetrieveActionTaskReference;
  }

  public void setCustomerContactOperatingSessionRetrieveActionTaskReference(String customerContactOperatingSessionRetrieveActionTaskReference) {
    this.customerContactOperatingSessionRetrieveActionTaskReference = customerContactOperatingSessionRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerContactOperatingSessionRetrieveActionResponse
  **/

  public String getCustomerContactOperatingSessionRetrieveActionResponse() {
    return customerContactOperatingSessionRetrieveActionResponse;
  }

  public void setCustomerContactOperatingSessionRetrieveActionResponse(String customerContactOperatingSessionRetrieveActionResponse) {
    this.customerContactOperatingSessionRetrieveActionResponse = customerContactOperatingSessionRetrieveActionResponse;
  }


  /**
   * Get customerContactOperatingSessionInstanceReportRecord
   * @return customerContactOperatingSessionInstanceReportRecord
  **/

  public CRCustomerContactOperatingSessionRetrieveOutputModelCustomerContactOperatingSessionInstanceReportRecord getCustomerContactOperatingSessionInstanceReportRecord() {
    return customerContactOperatingSessionInstanceReportRecord;
  }

  public void setCustomerContactOperatingSessionInstanceReportRecord(CRCustomerContactOperatingSessionRetrieveOutputModelCustomerContactOperatingSessionInstanceReportRecord customerContactOperatingSessionInstanceReportRecord) {
    this.customerContactOperatingSessionInstanceReportRecord = customerContactOperatingSessionInstanceReportRecord;
  }


  /**
   * Get customerContactOperatingSessionInstanceAnalysis
   * @return customerContactOperatingSessionInstanceAnalysis
  **/

  public CRCustomerContactOperatingSessionRetrieveOutputModelCustomerContactOperatingSessionInstanceAnalysis getCustomerContactOperatingSessionInstanceAnalysis() {
    return customerContactOperatingSessionInstanceAnalysis;
  }

  public void setCustomerContactOperatingSessionInstanceAnalysis(CRCustomerContactOperatingSessionRetrieveOutputModelCustomerContactOperatingSessionInstanceAnalysis customerContactOperatingSessionInstanceAnalysis) {
    this.customerContactOperatingSessionInstanceAnalysis = customerContactOperatingSessionInstanceAnalysis;
  }


}

