package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRoutingRetrieveOutputModelRoutingInstanceAnalysis
 */
public class BQRoutingRetrieveOutputModelRoutingInstanceAnalysis   {
  private Object routingInstanceAnalysisRecord = null;

  private String routingInstanceAnalysisReportType = null;

  private String routingInstanceAnalysisParameters = null;

  private Object routingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return routingInstanceAnalysisRecord
  **/

  public Object getRoutingInstanceAnalysisRecord() {
    return routingInstanceAnalysisRecord;
  }

  public void setRoutingInstanceAnalysisRecord(Object routingInstanceAnalysisRecord) {
    this.routingInstanceAnalysisRecord = routingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return routingInstanceAnalysisReportType
  **/

  public String getRoutingInstanceAnalysisReportType() {
    return routingInstanceAnalysisReportType;
  }

  public void setRoutingInstanceAnalysisReportType(String routingInstanceAnalysisReportType) {
    this.routingInstanceAnalysisReportType = routingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return routingInstanceAnalysisParameters
  **/

  public String getRoutingInstanceAnalysisParameters() {
    return routingInstanceAnalysisParameters;
  }

  public void setRoutingInstanceAnalysisParameters(String routingInstanceAnalysisParameters) {
    this.routingInstanceAnalysisParameters = routingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return routingInstanceAnalysisReport
  **/

  public Object getRoutingInstanceAnalysisReport() {
    return routingInstanceAnalysisReport;
  }

  public void setRoutingInstanceAnalysisReport(Object routingInstanceAnalysisReport) {
    this.routingInstanceAnalysisReport = routingInstanceAnalysisReport;
  }


}

