package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRoutingRetrieveInputModelRoutingInstanceAnalysis
 */
public class BQRoutingRetrieveInputModelRoutingInstanceAnalysis   {
  private String routingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return routingInstanceAnalysisReference
  **/

  public String getRoutingInstanceAnalysisReference() {
    return routingInstanceAnalysisReference;
  }

  public void setRoutingInstanceAnalysisReference(String routingInstanceAnalysisReference) {
    this.routingInstanceAnalysisReference = routingInstanceAnalysisReference;
  }


}

