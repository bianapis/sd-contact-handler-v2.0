package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQHistoryUpdateInputModelHistoryInstanceRecord
 */
public class BQHistoryUpdateInputModelHistoryInstanceRecord   {
  private Object historyTaskRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The task updates the channel activity history to reflect the contact 
   * @return historyTaskRecord
  **/

  public Object getHistoryTaskRecord() {
    return historyTaskRecord;
  }

  public void setHistoryTaskRecord(Object historyTaskRecord) {
    this.historyTaskRecord = historyTaskRecord;
  }


}

