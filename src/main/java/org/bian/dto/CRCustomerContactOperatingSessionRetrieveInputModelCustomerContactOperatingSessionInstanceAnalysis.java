package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerContactOperatingSessionRetrieveInputModelCustomerContactOperatingSessionInstanceAnalysis
 */
public class CRCustomerContactOperatingSessionRetrieveInputModelCustomerContactOperatingSessionInstanceAnalysis   {
  private String customerContactOperatingSessionInstanceAnalysisReference = null;

  private String customerContactOperatingSessionInstanceAnalysisReportType = null;

  private String customerContactOperatingSessionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerContactOperatingSessionInstanceAnalysisReference
  **/

  public String getCustomerContactOperatingSessionInstanceAnalysisReference() {
    return customerContactOperatingSessionInstanceAnalysisReference;
  }

  public void setCustomerContactOperatingSessionInstanceAnalysisReference(String customerContactOperatingSessionInstanceAnalysisReference) {
    this.customerContactOperatingSessionInstanceAnalysisReference = customerContactOperatingSessionInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerContactOperatingSessionInstanceAnalysisParameters
  **/

  public String getCustomerContactOperatingSessionInstanceAnalysisParameters() {
    return customerContactOperatingSessionInstanceAnalysisParameters;
  }

  public void setCustomerContactOperatingSessionInstanceAnalysisParameters(String customerContactOperatingSessionInstanceAnalysisParameters) {
    this.customerContactOperatingSessionInstanceAnalysisParameters = customerContactOperatingSessionInstanceAnalysisParameters;
  }


}

