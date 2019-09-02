package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRoutingRetrieveOutputModelRoutingInstanceReport
 */
public class BQRoutingRetrieveOutputModelRoutingInstanceReport   {
  private Object routingInstanceReportRecord = null;

  private String routingInstanceReportType = null;

  private String routingInstanceReportParameters = null;

  private Object routingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return routingInstanceReportRecord
  **/

  public Object getRoutingInstanceReportRecord() {
    return routingInstanceReportRecord;
  }

  public void setRoutingInstanceReportRecord(Object routingInstanceReportRecord) {
    this.routingInstanceReportRecord = routingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return routingInstanceReportType
  **/

  public String getRoutingInstanceReportType() {
    return routingInstanceReportType;
  }

  public void setRoutingInstanceReportType(String routingInstanceReportType) {
    this.routingInstanceReportType = routingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return routingInstanceReportParameters
  **/

  public String getRoutingInstanceReportParameters() {
    return routingInstanceReportParameters;
  }

  public void setRoutingInstanceReportParameters(String routingInstanceReportParameters) {
    this.routingInstanceReportParameters = routingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return routingInstanceReport
  **/

  public Object getRoutingInstanceReport() {
    return routingInstanceReport;
  }

  public void setRoutingInstanceReport(Object routingInstanceReport) {
    this.routingInstanceReport = routingInstanceReport;
  }


}

