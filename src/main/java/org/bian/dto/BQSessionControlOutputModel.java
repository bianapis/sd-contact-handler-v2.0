package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSessionControlOutputModel
 */
public class BQSessionControlOutputModel   {
  private String sessionControlActionTaskReference = null;

  private Object sessionControlActionTaskRecord = null;

  private String sessionControlActionResponse = null;

  private String sessionInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Session instance control processing service call 
   * @return sessionControlActionTaskReference
  **/

  public String getSessionControlActionTaskReference() {
    return sessionControlActionTaskReference;
  }

  public void setSessionControlActionTaskReference(String sessionControlActionTaskReference) {
    this.sessionControlActionTaskReference = sessionControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return sessionControlActionTaskRecord
  **/

  public Object getSessionControlActionTaskRecord() {
    return sessionControlActionTaskRecord;
  }

  public void setSessionControlActionTaskRecord(Object sessionControlActionTaskRecord) {
    this.sessionControlActionTaskRecord = sessionControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return sessionControlActionResponse
  **/

  public String getSessionControlActionResponse() {
    return sessionControlActionResponse;
  }

  public void setSessionControlActionResponse(String sessionControlActionResponse) {
    this.sessionControlActionResponse = sessionControlActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Session instance (e.g. initialised, pending, active) 
   * @return sessionInstanceStatus
  **/

  public String getSessionInstanceStatus() {
    return sessionInstanceStatus;
  }

  public void setSessionInstanceStatus(String sessionInstanceStatus) {
    this.sessionInstanceStatus = sessionInstanceStatus;
  }


}

