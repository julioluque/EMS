package com.jl.ems.admin;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class AdminUSERUpdate extends ActionForm {

	private String ouname;
	private String nuname;
	private String opwd;
	private String npwd;
	public String getOuname() {
		return ouname;
	}
	public void setOuname(String ouname) {
		this.ouname = ouname;
	}
	public String getNuname() {
		return nuname;
	}
	public void setNuname(String nuname) {
		this.nuname = nuname;
	}
	public String getOpwd() {
		return opwd;
	}
	public void setOpwd(String opwd) {
		this.opwd = opwd;
	}
	public String getNpwd() {
		return npwd;
	}
	public void setNpwd(String npwd) {
		this.npwd = npwd;
	}
	
}
