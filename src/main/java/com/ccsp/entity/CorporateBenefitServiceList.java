package com.ccsp.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CorporateBenefitServiceList generated by hbm2java
 */
@Entity
@Table(name = "CorporateBenefitServiceList")
public class CorporateBenefitServiceList implements java.io.Serializable {


  private int corporateBenefitServiceId;
  private String coreporateBenefitServiceCode;
  private String corporateBenefitServiceName;
  private String corporateBenefitServiceDescription;

  public CorporateBenefitServiceList() {}

  public CorporateBenefitServiceList(int corporateBenefitServiceId,
      String coreporateBenefitServiceCode, String corporateBenefitServiceName,
      String corporateBenefitServiceDescription) {
    this.corporateBenefitServiceId = corporateBenefitServiceId;
    this.coreporateBenefitServiceCode = coreporateBenefitServiceCode;
    this.corporateBenefitServiceName = corporateBenefitServiceName;
    this.corporateBenefitServiceDescription = corporateBenefitServiceDescription;
  }

  @Id


  @Column(name = "CorporateBenefitServiceID", unique = true, nullable = false)
  public int getCorporateBenefitServiceId() {
    return this.corporateBenefitServiceId;
  }

  public void setCorporateBenefitServiceId(int corporateBenefitServiceId) {
    this.corporateBenefitServiceId = corporateBenefitServiceId;
  }


  @Column(name = "CoreporateBenefitServiceCode", nullable = false)
  public String getCoreporateBenefitServiceCode() {
    return this.coreporateBenefitServiceCode;
  }

  public void setCoreporateBenefitServiceCode(String coreporateBenefitServiceCode) {
    this.coreporateBenefitServiceCode = coreporateBenefitServiceCode;
  }


  @Column(name = "CorporateBenefitServiceName", nullable = false)
  public String getCorporateBenefitServiceName() {
    return this.corporateBenefitServiceName;
  }

  public void setCorporateBenefitServiceName(String corporateBenefitServiceName) {
    this.corporateBenefitServiceName = corporateBenefitServiceName;
  }


  @Column(name = "CorporateBenefitServiceDescription", nullable = false)
  public String getCorporateBenefitServiceDescription() {
    return this.corporateBenefitServiceDescription;
  }

  public void setCorporateBenefitServiceDescription(String corporateBenefitServiceDescription) {
    this.corporateBenefitServiceDescription = corporateBenefitServiceDescription;
  }



}


