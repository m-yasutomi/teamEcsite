package com.internousdev.neptune.action;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.neptune.dao.MCategoryDAO;
import com.internousdev.neptune.dto.MCategoryDTO;
import com.internousdev.neptune.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;


public class CreateDestinationConfirmAction extends ActionSupport implements SessionAware{
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private String userAddress;
	private String telNumber;
	private String email;
	private Map<String, Object> session;
	private List<MCategoryDTO> mCategoryDTOList = new ArrayList<MCategoryDTO>();
	private String categoryId;
	private List<String> familyNameErrorMessageList=new ArrayList<String>();
	private List<String> firstNameErrorMessageList=new ArrayList<String>();
	private List<String> familyNameKanaErrorMessageList=new ArrayList<String>();
	private List<String> firstNameKanaErrorMessageList=new ArrayList<String>();
	private List<String> userAddressErrorMessageList=new ArrayList<String>();
	private List<String> telNumberErrorMessageList=new ArrayList<String>();
	private List<String> emailErrorMessageList=new ArrayList<String>();

	public String execute(){
		if(session.isEmpty()){
			return "sessionErr";
		}
		String result=ERROR;
		InputChecker inputChecker=new InputChecker();

		familyNameErrorMessageList=inputChecker.doCheck("姓",familyName,1,16, true, true, true, false, false, false, false);
		firstNameErrorMessageList=inputChecker.doCheck("名",firstName,1,16,true, true, true, false,false, false, false);
		familyNameKanaErrorMessageList=inputChecker.doCheck("姓ふりがな",familyNameKana,1,16,false, false, true, false, false, false, false);
		firstNameKanaErrorMessageList=inputChecker.doCheck("名ふりがな", firstNameKana, 1, 16, false, false, true, false, false, false, false);
		userAddressErrorMessageList=inputChecker.doCheck("住所", userAddress, 10, 50, true, true, true, true, false, true, false);
		telNumberErrorMessageList=inputChecker.doCheck("電話番号",telNumber, 10, 13, false, false, false, true, false, false, false);
		emailErrorMessageList=inputChecker.doCheck("メールアドレス",email, 10, 32, true, false, false, true, true, false, false);	
		
		if(familyNameErrorMessageList.size()==0
		&& firstNameErrorMessageList.size()==0
		&& familyNameKanaErrorMessageList.size()==0
		&& firstNameKanaErrorMessageList.size()==0
		&& userAddressErrorMessageList.size()==0
		&& telNumberErrorMessageList.size()==0
		&& emailErrorMessageList.size()==0){
		result=SUCCESS;
		}
		if(!session.containsKey("mCategoryList")) {
			MCategoryDAO mCategoryDAO = new MCategoryDAO();
			mCategoryDTOList = mCategoryDAO.getMCategoryList();
			session.put("mCategoryDTOList", mCategoryDTOList);
		}
		return result;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyNameKana() {
		return familyNameKana;
	}

	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}

	public String getFirstNameKana() {
		return firstNameKana;
	}

	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getFamilyNameErrorMessageList() {
		return familyNameErrorMessageList;
	}

	public void setFamilyNameErrorMessageList(List<String> familyNameErrorMessageList) {
		this.familyNameErrorMessageList = familyNameErrorMessageList;
	}

	public List<String> getFirstNameErrorMessageList() {
		return firstNameErrorMessageList;
	}

	public void setFirstNameErrorMessageList(List<String> firstNameErrorMessageList) {
		this.firstNameErrorMessageList = firstNameErrorMessageList;
	}

	public List<String> getFamilyNameKanaErrorMessageList() {
		return familyNameKanaErrorMessageList;
	}

	public void setFamilyNameKanaErrorMessageList(List<String> familyNameKanaErrorMessageList) {
		this.familyNameKanaErrorMessageList = familyNameKanaErrorMessageList;
	}

	public List<String> getFirstNameKanaErrorMessageList() {
		return firstNameKanaErrorMessageList;
	}

	public void setFirstNameKanaErrorMessageList(List<String> firstNameKanaErrorMessageList) {
		this.firstNameKanaErrorMessageList = firstNameKanaErrorMessageList;
	}

	public List<String> getUserAddressErrorMessageList() {
		return userAddressErrorMessageList;
	}

	public void setUserAddressErrorMessageList(List<String> userAddressErrorMessageList) {
		this.userAddressErrorMessageList = userAddressErrorMessageList;
	}

	public List<String> getTelNumberErrorMessageList() {
		return telNumberErrorMessageList;
	}

	public void setTelNumberErrorMessageList(List<String> telNumberErrorMessageList) {
		this.telNumberErrorMessageList = telNumberErrorMessageList;
	}

	public List<String> getEmailErrorMessageList() {
		return emailErrorMessageList;
	}

	public void setEmailErrorMessageList(List<String> emailErrorMessageList) {
		this.emailErrorMessageList = emailErrorMessageList;
	}

	public List<MCategoryDTO> getMCategoryDTOList() {
		return mCategoryDTOList;
	}

	public void setMCategoryDTOList(List<MCategoryDTO> mCategoryDTOList) {
		this.mCategoryDTOList = mCategoryDTOList;
	}
	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}