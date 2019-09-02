package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerContactOperatingSessionRetrieveOutputModelCustomerContactOperatingSessionInstanceReportRecord
 */
public class CRCustomerContactOperatingSessionRetrieveOutputModelCustomerContactOperatingSessionInstanceReportRecord   {
  private String customerContactOperatingSessionInstanceReportData = null;

  private String customerContactOperatingSessionInstanceReportType = null;

  private Object customerContactOperatingSessionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerContactOperatingSessionInstanceReportData
  **/

  public String getCustomerContactOperatingSessionInstanceReportData() {
    return customerContactOperatingSessionInstanceReportData;
  }

  public void setCustomerContactOperatingSessionInstanceReportData(String customerContactOperatingSessionInstanceReportData) {
    this.customerContactOperatingSessionInstanceReportData = customerContactOperatingSessionInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerContactOperatingSessionInstanceReportType
  **/

  public String getCustomerContactOperatingSessionInstanceReportType() {
    return customerContactOperatingSessionInstanceReportType;
  }

  public void setCustomerContactOperatingSessionInstanceReportType(String customerContactOperatingSessionInstanceReportType) {
    this.customerContactOperatingSessionInstanceReportType = customerContactOperatingSessionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerContactOperatingSessionInstanceReport
  **/

  public Object getCustomerContactOperatingSessionInstanceReport() {
    return customerContactOperatingSessionInstanceReport;
  }

  public void setCustomerContactOperatingSessionInstanceReport(Object customerContactOperatingSessionInstanceReport) {
    this.customerContactOperatingSessionInstanceReport = customerContactOperatingSessionInstanceReport;
  }


}

