package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAuthenticationRetrieveOutputModelAuthenticationInstanceRecord
 */
public class BQAuthenticationRetrieveOutputModelAuthenticationInstanceRecord   {
  private Object authenticationTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The task updates the contact record authentication status field and handles the interaction with the Party Authentication service domain to get the required level of authentication for the contact 
   * @return authenticationTaskRecord
  **/

  public Object getAuthenticationTaskRecord() {
    return authenticationTaskRecord;
  }

  public void setAuthenticationTaskRecord(Object authenticationTaskRecord) {
    this.authenticationTaskRecord = authenticationTaskRecord;
  }


}

