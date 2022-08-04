package com.example.StoredProcedurePractice.modal;

import javax.persistence.ColumnResult;

import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
//import javax.persistence.Table;

@Entity
//@Table(name="CustomerMaster")
@SqlResultSetMapping(name = "CustomerMaster1" , classes = @ConstructorResult(targetClass = Movies.class ,columns = {
	//	@ColumnResult(name = "CustGuId"  , type = String.class),
//		@ColumnResult(name = "IdentityGuId" , type = String.class),
//		@ColumnResult(name = "SocialClientId" , type = String.class),
//		@ColumnResult(name = "FirstName" , type = Integer.class),
//		@ColumnResult(name = "MiddleName" , type = String.class),
//		@ColumnResult(name = "LastName" , type = String.class),
//		@ColumnResult(name = "Gender" , type = String.class),
//		@ColumnResult(name = "DateOfBirth" , type = String.class),
//		@ColumnResult(name = "EmailId" , type = String.class),
//		@ColumnResult(name = "MobileNo" , type = String.class),
//		@ColumnResult(name = "CurrencyGuId" , type = String.class),
//		@ColumnResult(name = "Language" , type = String.class),
//		@ColumnResult(name = "SourceGuId" , type = String.class),
//		@ColumnResult(name = "ExpiryDate" , type = String.class),
//		@ColumnResult(name = "CreatedBy" , type = String.class),
//		@ColumnResult(name = "CreatedOnDate" , type = String.class),
//		@ColumnResult(name = "isActive" , type = Integer.class),
//		@ColumnResult(name = "MFUcc" , type = String.class),
//		@ColumnResult(name = "isUcc" , type = Integer.class),
//		@ColumnResult(name = "MaritalStatus" , type = String.class),
//		@ColumnResult(name = "IncomeGroup" , type = String.class),
//		@ColumnResult(name = "TradingExperience" , type = String.class),
//		@ColumnResult(name = "EsignStatus" , type = String.class),
//		@ColumnResult(name = "ResidentialStatus" , type = String.class),
//		@ColumnResult(name = "CitizenShip" , type = String.class),
//		@ColumnResult(name = "EsignDate" , type = Integer.class),
//		@ColumnResult(name = "EsignPdfName" , type = String.class),
//		@ColumnResult(name = "IsKra" , type = Integer.class),
//		@ColumnResult(name = "FatherName" , type = String.class),
//		@ColumnResult(name = "MotherName" , type = String.class),
//		@ColumnResult(name = "SpouseName" , type = String.class),
//		@ColumnResult(name = "PanName" , type = String.class),
//		@ColumnResult(name = "AadharStatus" , type = String.class),
//		@ColumnResult(name = "NATIONALITY" , type = String.class),
//		@ColumnResult(name = "CustomerPanName" , type = String.class),
//		@ColumnResult(name = "FatherFirstName" , type = String.class),
//		@ColumnResult(name = "FatherMiddleName" , type = String.class),
//		@ColumnResult(name = "FatherLastName" , type = String.class),
//		@ColumnResult(name = "Occupation" , type = String.class),
//		@ColumnResult(name = "DboRefNo" , type = String.class),
//		@ColumnResult(name = "MFucc1" , type = String.class),
//		@ColumnResult(name = "IsUcc1" , type = Integer.class),
//		@ColumnResult(name = "SpouseFirstName" , type = String.class),
//		@ColumnResult(name = "SpouseMiddleName" , type = String.class),
}))


public class Movies {
	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String IdentityGuId;
	private String SocialClientId;
	private String FirstName;
	private String MiddleName;
	private String LastName;
	private String Gender;
	private String DateOfBirth;
	private String EmailId;
	private int MobileNo;
	private String CurrencyGuId;
	private String Language;
	private String SourceGuId;
	private String ExpiryDate;
	private String CreatedBy;
	private String CreatedOnDate;
	private int isActive;
	private String MFUcc;
	private int isUcc;
	private String MaritalStatus;
	private String IncomeGroup;
	private String TradingExperience;
	private String EsignStatus;
	private String ResidentialStatus;
	private String CitizenShip;
	private int EsignDate;
	private String EsignPdfName;
	private int IsKra;
	private String FatherName;
	private String MotherName;
	private String SpouseName;
	private String PanName;
	private String AadharStatus;
	private String NATIONALITY;
	private String CustomerPanName;
	private String FatherFirstName;
	private String FatherMiddleName;
	private String FatherLastName;
	private String Occupation;
	private String DboRefNo;
	private String MFucc1;
	private int IsUcc1;
	private String SpouseFirstName;
	private String SpouseMiddleName;
	private String SpouseLastName;
	private String MotherFirstName;
	private String MotherMiddleName;
	private String MotherLastName;
	
	@Override
	public String toString() {
		return "Movies [CustGuId=" + CustGuId + ", IdentityGuId=" + IdentityGuId + ", SocialClientId=" + SocialClientId
				+ ", FirstName=" + FirstName + ", MiddleName=" + MiddleName + ", LastName=" + LastName + ", Gender="
				+ Gender + ", DateOfBirth=" + DateOfBirth + ", EmailId=" + EmailId + ", MobileNo=" + MobileNo
				+ ", CurrencyGuId=" + CurrencyGuId + ", Language=" + Language + ", SourceGuId=" + SourceGuId
				+ ", ExpiryDate=" + ExpiryDate + ", CreatedBy=" + CreatedBy + ", CreatedOnDate=" + CreatedOnDate
				+ ", isActive=" + isActive + ", MFUcc=" + MFUcc + ", isUcc=" + isUcc + ", MaritalStatus="
				+ MaritalStatus + ", IncomeGroup=" + IncomeGroup + ", TradingExperience=" + TradingExperience
				+ ", EsignStatus=" + EsignStatus + ", ResidentialStatus=" + ResidentialStatus + ", CitizenShip="
				+ CitizenShip + ", EsignDate=" + EsignDate + ", EsignPdfName=" + EsignPdfName + ", IsKra=" + IsKra
				+ ", FatherName=" + FatherName + ", MotherName=" + MotherName + ", SpouseName=" + SpouseName
				+ ", PanName=" + PanName + ", AadharStatus=" + AadharStatus + ", NATIONALITY=" + NATIONALITY
				+ ", CustomerPanName=" + CustomerPanName + ", FatherFirstName=" + FatherFirstName
				+ ", FatherMiddleName=" + FatherMiddleName + ", FatherLastName=" + FatherLastName + ", Occupation="
				+ Occupation + ", DboRefNo=" + DboRefNo + ", MFucc1=" + MFucc1 + ", IsUcc1=" + IsUcc1
				+ ", SpouseFirstName=" + SpouseFirstName + ", SpouseMiddleName=" + SpouseMiddleName
				+ ", SpouseLastName=" + SpouseLastName + ", MotherFirstName=" + MotherFirstName + ", MotherMiddleName="
				+ MotherMiddleName + ", MotherLastName=" + MotherLastName + "]";
	}
	@Id

	private String CustGuId;
public String getCustGuId() {
		return CustGuId;
	}
	public void setCustGuId(String custGuId) {
		CustGuId = custGuId;
	}
	public String getIdentityGuId() {
		return IdentityGuId;
	}
	public void setIdentityGuId(String identityGuId) {
		IdentityGuId = identityGuId;
	}
	public String getSocialClientId() {
		return SocialClientId;
	}
	public void setSocialClientId(String socialClientId) {
		SocialClientId = socialClientId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getMiddleName() {
		return MiddleName;
	}
	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public int getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(int mobileNo) {
		MobileNo = mobileNo;
	}
	public String getCurrencyGuId() {
		return CurrencyGuId;
	}
	public void setCurrencyGuId(String currencyGuId) {
		CurrencyGuId = currencyGuId;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	public String getSourceGuId() {
		return SourceGuId;
	}
	public void setSourceGuId(String sourceGuId) {
		SourceGuId = sourceGuId;
	}
	public String getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		ExpiryDate = expiryDate;
	}
	public String getCreatedBy() {
		return CreatedBy;
	}
	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}
	public String getCreatedOnDate() {
		return CreatedOnDate;
	}
	public void setCreatedOnDate(String createdOnDate) {
		CreatedOnDate = createdOnDate;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	public String getMFUcc() {
		return MFUcc;
	}
	public void setMFUcc(String mFUcc) {
		MFUcc = mFUcc;
	}
	public int getIsUcc() {
		return isUcc;
	}
	public void setIsUcc(int isUcc) {
		this.isUcc = isUcc;
	}
	public String getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public String getIncomeGroup() {
		return IncomeGroup;
	}
	public void setIncomeGroup(String incomeGroup) {
		IncomeGroup = incomeGroup;
	}
	public String getTradingExperience() {
		return TradingExperience;
	}
	public void setTradingExperience(String tradingExperience) {
		TradingExperience = tradingExperience;
	}
	public String getEsignStatus() {
		return EsignStatus;
	}
	public void setEsignStatus(String esignStatus) {
		EsignStatus = esignStatus;
	}
	public String getResidentialStatus() {
		return ResidentialStatus;
	}
	public void setResidentialStatus(String residentialStatus) {
		ResidentialStatus = residentialStatus;
	}
	public String getCitizenShip() {
		return CitizenShip;
	}
	public void setCitizenShip(String citizenShip) {
		CitizenShip = citizenShip;
	}
	public int getEsignDate() {
		return EsignDate;
	}
	public void setEsignDate(int esignDate) {
		EsignDate = esignDate;
	}
	public String getEsignPdfName() {
		return EsignPdfName;
	}
	public void setEsignPdfName(String esignPdfName) {
		EsignPdfName = esignPdfName;
	}
	public int getIsKra() {
		return IsKra;
	}
	public void setIsKra(int isKra) {
		IsKra = isKra;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public String getMotherName() {
		return MotherName;
	}
	public void setMotherName(String motherName) {
		MotherName = motherName;
	}
	public String getSpouseName() {
		return SpouseName;
	}
	public void setSpouseName(String spouseName) {
		SpouseName = spouseName;
	}
	public String getPanName() {
		return PanName;
	}
	public void setPanName(String panName) {
		PanName = panName;
	}
	public String getAadharStatus() {
		return AadharStatus;
	}
	public void setAadharStatus(String aadharStatus) {
		AadharStatus = aadharStatus;
	}
	public String getNATIONALITY() {
		return NATIONALITY;
	}
	public void setNATIONALITY(String nATIONALITY) {
		NATIONALITY = nATIONALITY;
	}
	public String getCustomerPanName() {
		return CustomerPanName;
	}
	public void setCustomerPanName(String customerPanName) {
		CustomerPanName = customerPanName;
	}
	public String getFatherFirstName() {
		return FatherFirstName;
	}
	public void setFatherFirstName(String fatherFirstName) {
		FatherFirstName = fatherFirstName;
	}
	public String getFatherMiddleName() {
		return FatherMiddleName;
	}
	public void setFatherMiddleName(String fatherMiddleName) {
		FatherMiddleName = fatherMiddleName;
	}
	public String getFatherLastName() {
		return FatherLastName;
	}
	public void setFatherLastName(String fatherLastName) {
		FatherLastName = fatherLastName;
	}
	public String getOccupation() {
		return Occupation;
	}
	public void setOccupation(String occupation) {
		Occupation = occupation;
	}
	public String getDboRefNo() {
		return DboRefNo;
	}
	public void setDboRefNo(String dboRefNo) {
		DboRefNo = dboRefNo;
	}
	public String getMFucc1() {
		return MFucc1;
	}
	public void setMFucc1(String mFucc1) {
		MFucc1 = mFucc1;
	}
	public int getIsUcc1() {
		return IsUcc1;
	}
	public void setIsUcc1(int isUcc1) {
		IsUcc1 = isUcc1;
	}
	public String getSpouseFirstName() {
		return SpouseFirstName;
	}
	public void setSpouseFirstName(String spouseFirstName) {
		SpouseFirstName = spouseFirstName;
	}
	public String getSpouseMiddleName() {
		return SpouseMiddleName;
	}
	public void setSpouseMiddleName(String spouseMiddleName) {
		SpouseMiddleName = spouseMiddleName;
	}
	public String getSpouseLastName() {
		return SpouseLastName;
	}
	public void setSpouseLastName(String spouseLastName) {
		SpouseLastName = spouseLastName;
	}
	public String getMotherFirstName() {
		return MotherFirstName;
	}
	public void setMotherFirstName(String motherFirstName) {
		MotherFirstName = motherFirstName;
	}
	public String getMotherMiddleName() {
		return MotherMiddleName;
	}
	public void setMotherMiddleName(String motherMiddleName) {
		MotherMiddleName = motherMiddleName;
	}
	public String getMotherLastName() {
		return MotherLastName;
	}
	public void setMotherLastName(String motherLastName) {
		MotherLastName = motherLastName;
	}
	//	@Override
//	public String toString() {
//		return "Movies [CustGuId=" + CustGuId + ", IdentityGuId=" + IdentityGuId + ", SocialClientId=" + SocialClientId
//				+ ", FirstName=" + FirstName + ", MiddleName=" + MiddleName + ", LastName=" + LastName + ", Gender="
//				+ Gender + ", DateOfBirth=" + DateOfBirth + ", EmailId=" + EmailId + ", MobileNo=" + MobileNo
//				+ ", CurrencyGuId=" + CurrencyGuId + ", Language=" + Language + ", SourceGuId=" + SourceGuId
//				+ ", ExpiryDate=" + ExpiryDate + ", CreatedBy=" + CreatedBy + ", CreatedOnDate=" + CreatedOnDate
//				+ ", isActive=" + isActive + ", MFUcc=" + MFUcc + ", isUcc=" + isUcc + ", MaritalStatus="
//				+ MaritalStatus + ", IncomeGroup=" + IncomeGroup + ", TradingExperience=" + TradingExperience
//				+ ", EsignStatus=" + EsignStatus + ", ResidentialStatus=" + ResidentialStatus + ", CitizenShip="
//				+ CitizenShip + ", EsignDate=" + EsignDate + ", EsignPdfName=" + EsignPdfName + ", IsKra=" + IsKra
//				+ ", FatherName=" + FatherName + ", MotherName=" + MotherName + ", SpouseName=" + SpouseName
//				+ ", PanName=" + PanName + ", AadharStatus=" + AadharStatus + ", NATIONALITY=" + NATIONALITY
//				+ ", CustomerPanName=" + CustomerPanName + ", FatherFirstName=" + FatherFirstName
//				+ ", FatherMiddleName=" + FatherMiddleName + ", FatherLastName=" + FatherLastName + ", Occupation="
//				+ Occupation + ", DboRefNo=" + DboRefNo + ", MFucc1=" + MFucc1 + ", IsUcc1=" + IsUcc1
//				+ ", SpouseFirstName=" + SpouseFirstName + ", SpouseMiddleName=" + SpouseMiddleName
//				+ ", SpouseLastName=" + SpouseLastName + ", MotherFirstName=" + MotherFirstName + ", MotherMiddleName="
//				+ MotherMiddleName + ", MotherLastName=" + MotherLastName + "]";
//	}
//	public Movies() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public String getCustGuId() {
//		return CustGuId;
//	}
//	public void setCustGuId(String custGuId) {
//		CustGuId = custGuId;
//	}
//	public String getIdentityGuId() {
//		return IdentityGuId;
//	}
//	public void setIdentityGuId(String identityGuId) {
//		IdentityGuId = identityGuId;
//	}
//	public String getSocialClientId() {
//		return SocialClientId;
//	}
//	public void setSocialClientId(String socialClientId) {
//		SocialClientId = socialClientId;
//	}
//	public String getFirstName() {
//		return FirstName;
//	}
//	public void setFirstName(String firstName) {
//		FirstName = firstName;
//	}
//	public String getMiddleName() {
//		return MiddleName;
//	}
//	public void setMiddleName(String middleName) {
//		MiddleName = middleName;
//	}
//	public String getLastName() {
//		return LastName;
//	}
//	public void setLastName(String lastName) {
//		LastName = lastName;
//	}
//	public String getGender() {
//		return Gender;
//	}
//	public void setGender(String gender) {
//		Gender = gender;
//	}
//	public String getDateOfBirth() {
//		return DateOfBirth;
//	}
//	public void setDateOfBirth(String dateOfBirth) {
//		DateOfBirth = dateOfBirth;
//	}
//	public String getEmailId() {
//		return EmailId;
//	}
//	public void setEmailId(String emailId) {
//		EmailId = emailId;
//	}
//	public String getMobileNo() {
//		return MobileNo;
//	}
//	public void setMobileNo(String mobileNo) {
//		MobileNo = mobileNo;
//	}
//	public String getCurrencyGuId() {
//		return CurrencyGuId;
//	}
//	public void setCurrencyGuId(String currencyGuId) {
//		CurrencyGuId = currencyGuId;
//	}
//	public String getLanguage() {
//		return Language;
//	}
//	public void setLanguage(String language) {
//		Language = language;
//	}
//	public String getSourceGuId() {
//		return SourceGuId;
//	}
//	public void setSourceGuId(String sourceGuId) {
//		SourceGuId = sourceGuId;
//	}
//	public String getExpiryDate() {
//		return ExpiryDate;
//	}
//	public void setExpiryDate(String expiryDate) {
//		ExpiryDate = expiryDate;
//	}
//	public String getCreatedBy() {
//		return CreatedBy;
//	}
//	public void setCreatedBy(String createdBy) {
//		CreatedBy = createdBy;
//	}
//	public String getCreatedOnDate() {
//		return CreatedOnDate;
//	}
//	public void setCreatedOnDate(String createdOnDate) {
//		CreatedOnDate = createdOnDate;
//	}
//	public String getIsActive() {
//		return isActive;
//	}
//	public void setIsActive(String isActive) {
//		this.isActive = isActive;
//	}
//	public String getMFUcc() {
//		return MFUcc;
//	}
//	public void setMFUcc(String mFUcc) {
//		MFUcc = mFUcc;
//	}
//	public String getIsUcc() {
//		return isUcc;
//	}
//	public void setIsUcc(String isUcc) {
//		this.isUcc = isUcc;
//	}
//	public String getMaritalStatus() {
//		return MaritalStatus;
//	}
//	public void setMaritalStatus(String maritalStatus) {
//		MaritalStatus = maritalStatus;
//	}
//	public String getIncomeGroup() {
//		return IncomeGroup;
//	}
//	public void setIncomeGroup(String incomeGroup) {
//		IncomeGroup = incomeGroup;
//	}
//	public String getTradingExperience() {
//		return TradingExperience;
//	}
//	public void setTradingExperience(String tradingExperience) {
//		TradingExperience = tradingExperience;
//	}
//	public String getEsignStatus() {
//		return EsignStatus;
//	}
//	public void setEsignStatus(String esignStatus) {
//		EsignStatus = esignStatus;
//	}
//	public String getResidentialStatus() {
//		return ResidentialStatus;
//	}
//	public void setResidentialStatus(String residentialStatus) {
//		ResidentialStatus = residentialStatus;
//	}
//	public String getCitizenShip() {
//		return CitizenShip;
//	}
//	public void setCitizenShip(String citizenShip) {
//		CitizenShip = citizenShip;
//	}
//	public String getEsignDate() {
//		return EsignDate;
//	}
//	public void setEsignDate(String esignDate) {
//		EsignDate = esignDate;
//	}
//	public String getEsignPdfName() {
//		return EsignPdfName;
//	}
//	public void setEsignPdfName(String esignPdfName) {
//		EsignPdfName = esignPdfName;
//	}
//	public String getIsKra() {
//		return IsKra;
//	}
//	public void setIsKra(String isKra) {
//		IsKra = isKra;
//	}
//	public String getFatherName() {
//		return FatherName;
//	}
//	public void setFatherName(String fatherName) {
//		FatherName = fatherName;
//	}
//	public String getMotherName() {
//		return MotherName;
//	}
//	public void setMotherName(String motherName) {
//		MotherName = motherName;
//	}
//	public String getSpouseName() {
//		return SpouseName;
//	}
//	public void setSpouseName(String spouseName) {
//		SpouseName = spouseName;
//	}
//	public String getPanName() {
//		return PanName;
//	}
//	public void setPanName(String panName) {
//		PanName = panName;
//	}
//	public String getAadharStatus() {
//		return AadharStatus;
//	}
//	public void setAadharStatus(String aadharStatus) {
//		AadharStatus = aadharStatus;
//	}
//	public String getNATIONALITY() {
//		return NATIONALITY;
//	}
//	public void setNATIONALITY(String nATIONALITY) {
//		NATIONALITY = nATIONALITY;
//	}
//	public String getCustomerPanName() {
//		return CustomerPanName;
//	}
//	public void setCustomerPanName(String customerPanName) {
//		CustomerPanName = customerPanName;
//	}
//	public String getFatherFirstName() {
//		return FatherFirstName;
//	}
//	public void setFatherFirstName(String fatherFirstName) {
//		FatherFirstName = fatherFirstName;
//	}
//	public String getFatherMiddleName() {
//		return FatherMiddleName;
//	}
//	public void setFatherMiddleName(String fatherMiddleName) {
//		FatherMiddleName = fatherMiddleName;
//	}
//	public String getFatherLastName() {
//		return FatherLastName;
//	}
//	public void setFatherLastName(String fatherLastName) {
//		FatherLastName = fatherLastName;
//	}
//	public String getOccupation() {
//		return Occupation;
//	}
//	public void setOccupation(String occupation) {
//		Occupation = occupation;
//	}
//	public String getDboRefNo() {
//		return DboRefNo;
//	}
//	public void setDboRefNo(String dboRefNo) {
//		DboRefNo = dboRefNo;
//	}
//	public String getMFucc1() {
//		return MFucc1;
//	}
//	public void setMFucc1(String mFucc1) {
//		MFucc1 = mFucc1;
//	}
//	public String getIsUcc1() {
//		return IsUcc1;
//	}
//	public void setIsUcc1(String isUcc1) {
//		IsUcc1 = isUcc1;
//	}
//	public String getSpouseFirstName() {
//		return SpouseFirstName;
//	}
//	public void setSpouseFirstName(String spouseFirstName) {
//		SpouseFirstName = spouseFirstName;
//	}
//	public String getSpouseMiddleName() {
//		return SpouseMiddleName;
//	}
//	public void setSpouseMiddleName(String spouseMiddleName) {
//		SpouseMiddleName = spouseMiddleName;
//	}
//	public String getSpouseLastName() {
//		return SpouseLastName;
//	}
//	public void setSpouseLastName(String spouseLastName) {
//		SpouseLastName = spouseLastName;
//	}
//	public String getMotherFirstName() {
//		return MotherFirstName;
//	}
//	public void setMotherFirstName(String motherFirstName) {
//		MotherFirstName = motherFirstName;
//	}
//	public String getMotherMiddleName() {
//		return MotherMiddleName;
//	}
//	public void setMotherMiddleName(String motherMiddleName) {
//		MotherMiddleName = motherMiddleName;
//	}
//	public String getMotherLastName() {
//		return MotherLastName;
//	}
//	public void setMotherLastName(String motherLastName) {
//		MotherLastName = motherLastName;
//	}
	
	
	//start
	
//	public Movies() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Movies(int id, String MovieName, String crew, int ratings) {
//		super();
//		this.id = id;
//		this.MovieName = MovieName;
//		this.crew = crew;
//		this.ratings =ratings;
//	}
//	
//	//end
//
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
//	public String getMovieName() {
//		return MovieName;
//	}
//	public void setMovieName(String movieName) {
//		MovieName = movieName;
//	}
//	public String getCrew() {
//		return crew;
//	}
//	public void setCrew(String crew) {
//		this.crew = crew;
//	}
//	public int getRatings() {
//		return ratings;
//	}
//	public void setRatings(int ratings) {
//		this.ratings = ratings;
//	}
//	
//	@Override
//	public String toString() {
//		return "Movies [id=" + id + ", MovieName=" + MovieName + ", crew=" + crew + ", ratings=" + ratings + "]";
//	}

}
