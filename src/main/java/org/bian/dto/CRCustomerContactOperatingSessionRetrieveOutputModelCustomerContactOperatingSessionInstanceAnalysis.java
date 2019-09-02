package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerContactOperatingSessionRetrieveOutputModelCustomerContactOperatingSessionInstanceAnalysis
 */
public class CRCustomerContactOperatingSessionRetrieveOutputModelCustomerContactOperatingSessionInstanceAnalysis   {
  private String customerContactOperatingSessionInstanceAnalysisData = null;

  private String customerContactOperatingSessionInstanceAnalysisReportType = null;

  private Object customerContactOperatingSessionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerContactOperatingSessionInstanceAnalysisData
  **/

  public String getCustomerContactOperatingSessionInstanceAnalysisData() {
    return customerContactOperatingSessionInstanceAnalysisData;
  }

  public void setCustomerContactOperatingSessionInstanceAnalysisData(String customerContactOperatingSessionInstanceAnalysisData) {
    this.customerContactOperatingSessionInstanceAnalysisData = customerContactOperatingSessionInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerContactOperatingSessionInstanceAnalysisReportType
  **/

  public String getCustomerContactOperatingSessionInstanceAnalysisReportType() {
    return customerContactOperatingSessionInstanceAnalysisReportType;
  }

  public void setCustomerContactOperatingSessionInstanceAnalysisReportType(String customerContactOperatingSessionInstanceAnalysisReportType) {
    this.customerContactOperatingSessionInstanceAnalysisReportType = customerContactOperatingSessionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerContactOperatingSessionInstanceAnalysisReport
  **/

  public Object getCustomerContactOperatingSessionInstanceAnalysisReport() {
    return customerContactOperatingSessionInstanceAnalysisReport;
  }

  public void setCustomerContactOperatingSessionInstanceAnalysisReport(Object customerContactOperatingSessionInstanceAnalysisReport) {
    this.customerContactOperatingSessionInstanceAnalysisReport = customerContactOperatingSessionInstanceAnalysisReport;
  }


}

