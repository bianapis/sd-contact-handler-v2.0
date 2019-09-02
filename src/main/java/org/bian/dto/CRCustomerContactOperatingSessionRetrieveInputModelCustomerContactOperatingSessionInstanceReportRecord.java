package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerContactOperatingSessionRetrieveInputModelCustomerContactOperatingSessionInstanceReportRecord
 */
public class CRCustomerContactOperatingSessionRetrieveInputModelCustomerContactOperatingSessionInstanceReportRecord   {
  private String customerContactOperatingSessionInstanceReportReference = null;

  private String customerContactOperatingSessionInstanceReportType = null;

  private String customerContactOperatingSessionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerContactOperatingSessionInstanceReportReference
  **/

  public String getCustomerContactOperatingSessionInstanceReportReference() {
    return customerContactOperatingSessionInstanceReportReference;
  }

  public void setCustomerContactOperatingSessionInstanceReportReference(String customerContactOperatingSessionInstanceReportReference) {
    this.customerContactOperatingSessionInstanceReportReference = customerContactOperatingSessionInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerContactOperatingSessionInstanceReportParameters
  **/

  public String getCustomerContactOperatingSessionInstanceReportParameters() {
    return customerContactOperatingSessionInstanceReportParameters;
  }

  public void setCustomerContactOperatingSessionInstanceReportParameters(String customerContactOperatingSessionInstanceReportParameters) {
    this.customerContactOperatingSessionInstanceReportParameters = customerContactOperatingSessionInstanceReportParameters;
  }


}

