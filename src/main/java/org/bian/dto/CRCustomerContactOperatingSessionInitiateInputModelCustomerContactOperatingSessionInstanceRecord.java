package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerContactOperatingSessionInitiateInputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerContactOperatingSessionInitiateInputModelCustomerContactOperatingSessionInstanceRecord
 */
public class CRCustomerContactOperatingSessionInitiateInputModelCustomerContactOperatingSessionInstanceRecord   {
  private String customerContactInboundorOutboundIndicator = null;

  private String eBranchOperatingSessionReference = null;

  private String advancedVoiceServiceOperatingSessionReference = null;

  private String customerContactRecordReference = null;

  private CRCustomerContactOperatingSessionInitiateInputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord customerContactRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Indicates whether this is an inbound or outbound contact (inbound is customer initiated, outbound is servicing resource initiated) 
   * @return customerContactInboundorOutboundIndicator
  **/

  public String getCustomerContactInboundorOutboundIndicator() {
    return customerContactInboundorOutboundIndicator;
  }

  public void setCustomerContactInboundorOutboundIndicator(String customerContactInboundorOutboundIndicator) {
    this.customerContactInboundorOutboundIndicator = customerContactInboundorOutboundIndicator;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active network operating session used to access customer 
   * @return eBranchOperatingSessionReference
  **/

  public String getEBranchOperatingSessionReference() {
    return eBranchOperatingSessionReference;
  }

  public void setEBranchOperatingSessionReference(String eBranchOperatingSessionReference) {
    this.eBranchOperatingSessionReference = eBranchOperatingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active voice network used to access customer 
   * @return advancedVoiceServiceOperatingSessionReference
  **/

  public String getAdvancedVoiceServiceOperatingSessionReference() {
    return advancedVoiceServiceOperatingSessionReference;
  }

  public void setAdvancedVoiceServiceOperatingSessionReference(String advancedVoiceServiceOperatingSessionReference) {
    this.advancedVoiceServiceOperatingSessionReference = advancedVoiceServiceOperatingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the contact record assembled during the customer contact 
   * @return customerContactRecordReference
  **/

  public String getCustomerContactRecordReference() {
    return customerContactRecordReference;
  }

  public void setCustomerContactRecordReference(String customerContactRecordReference) {
    this.customerContactRecordReference = customerContactRecordReference;
  }


  /**
   * Get customerContactRecord
   * @return customerContactRecord
  **/

  public CRCustomerContactOperatingSessionInitiateInputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord getCustomerContactRecord() {
    return customerContactRecord;
  }

  public void setCustomerContactRecord(CRCustomerContactOperatingSessionInitiateInputModelCustomerContactOperatingSessionInstanceRecordCustomerContactRecord customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
  }


}

