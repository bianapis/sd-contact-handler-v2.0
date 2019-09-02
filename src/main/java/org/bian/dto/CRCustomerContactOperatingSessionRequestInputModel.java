package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactOperatingSessionRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerContactOperatingSessionRequestInputModel
 */
public class CRCustomerContactOperatingSessionRequestInputModel   {
  private String contactHandlerServicingSessionReference = null;

  private String customerContactOperatingSessionInstanceReference = null;

  private Object customerContactOperatingSessionRequestActionTaskRecord = null;

  private CRCustomerContactOperatingSessionRequestInputModelRequestRecordType requestRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return contactHandlerServicingSessionReference
  **/

  public String getContactHandlerServicingSessionReference() {
    return contactHandlerServicingSessionReference;
  }

  public void setContactHandlerServicingSessionReference(String contactHandlerServicingSessionReference) {
    this.contactHandlerServicingSessionReference = contactHandlerServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Contact Operating Session instance 
   * @return customerContactOperatingSessionInstanceReference
  **/

  public String getCustomerContactOperatingSessionInstanceReference() {
    return customerContactOperatingSessionInstanceReference;
  }

  public void setCustomerContactOperatingSessionInstanceReference(String customerContactOperatingSessionInstanceReference) {
    this.customerContactOperatingSessionInstanceReference = customerContactOperatingSessionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerContactOperatingSessionRequestActionTaskRecord
  **/

  public Object getCustomerContactOperatingSessionRequestActionTaskRecord() {
    return customerContactOperatingSessionRequestActionTaskRecord;
  }

  public void setCustomerContactOperatingSessionRequestActionTaskRecord(Object customerContactOperatingSessionRequestActionTaskRecord) {
    this.customerContactOperatingSessionRequestActionTaskRecord = customerContactOperatingSessionRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustomerContactOperatingSessionRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustomerContactOperatingSessionRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

