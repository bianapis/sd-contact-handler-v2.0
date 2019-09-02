package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQRoutingRetrieveOutputModelRoutingInstanceRecord
 */
public class BQRoutingRetrieveOutputModelRoutingInstanceRecord   {
  private Object routingTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The task updates the contact record routing selection field and handles the interaction with the Contact Routing service domain to identify the servicing position/resource 
   * @return routingTaskRecord
  **/

  public Object getRoutingTaskRecord() {
    return routingTaskRecord;
  }

  public void setRoutingTaskRecord(Object routingTaskRecord) {
    this.routingTaskRecord = routingTaskRecord;
  }


}

