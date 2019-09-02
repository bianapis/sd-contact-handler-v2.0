package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQRoutingRetrieveInputModelRoutingInstanceAnalysis;
import org.bian.dto.BQRoutingRetrieveInputModelRoutingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQRoutingRetrieveInputModel
 */
public class BQRoutingRetrieveInputModel   {
  private Object routingRetrieveActionTaskRecord = null;

  private String routingRetrieveActionRequest = null;

  private BQRoutingRetrieveInputModelRoutingInstanceReport routingInstanceReport = null;

  private BQRoutingRetrieveInputModelRoutingInstanceAnalysis routingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return routingRetrieveActionTaskRecord
  **/

  public Object getRoutingRetrieveActionTaskRecord() {
    return routingRetrieveActionTaskRecord;
  }

  public void setRoutingRetrieveActionTaskRecord(Object routingRetrieveActionTaskRecord) {
    this.routingRetrieveActionTaskRecord = routingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return routingRetrieveActionRequest
  **/

  public String getRoutingRetrieveActionRequest() {
    return routingRetrieveActionRequest;
  }

  public void setRoutingRetrieveActionRequest(String routingRetrieveActionRequest) {
    this.routingRetrieveActionRequest = routingRetrieveActionRequest;
  }


  /**
   * Get routingInstanceReport
   * @return routingInstanceReport
  **/

  public BQRoutingRetrieveInputModelRoutingInstanceReport getRoutingInstanceReport() {
    return routingInstanceReport;
  }

  public void setRoutingInstanceReport(BQRoutingRetrieveInputModelRoutingInstanceReport routingInstanceReport) {
    this.routingInstanceReport = routingInstanceReport;
  }


  /**
   * Get routingInstanceAnalysis
   * @return routingInstanceAnalysis
  **/

  public BQRoutingRetrieveInputModelRoutingInstanceAnalysis getRoutingInstanceAnalysis() {
    return routingInstanceAnalysis;
  }

  public void setRoutingInstanceAnalysis(BQRoutingRetrieveInputModelRoutingInstanceAnalysis routingInstanceAnalysis) {
    this.routingInstanceAnalysis = routingInstanceAnalysis;
  }


}

