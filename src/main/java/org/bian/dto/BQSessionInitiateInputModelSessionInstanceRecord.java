package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSessionInitiateInputModelSessionInstanceRecord
 */
public class BQSessionInitiateInputModelSessionInstanceRecord   {
  private Object sessionTaskRecord = null;

  private String sessionResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The task updates the contact record activity record fields and handles the interaction with the Contact Dialogue service domain to initiate the servicing session 
   * @return sessionTaskRecord
  **/

  public Object getSessionTaskRecord() {
    return sessionTaskRecord;
  }

  public void setSessionTaskRecord(Object sessionTaskRecord) {
    this.sessionTaskRecord = sessionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: An indicator of how the session was concluded (e.g. customer completed, hang-up, further servicing required) 
   * @return sessionResult
  **/

  public String getSessionResult() {
    return sessionResult;
  }

  public void setSessionResult(String sessionResult) {
    this.sessionResult = sessionResult;
  }


}

