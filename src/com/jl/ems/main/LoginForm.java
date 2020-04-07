package com.jl.ems.main;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class LoginForm extends ActionForm {

	private String uname;
	private String pwd;
	private String role;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
			
		ActionErrors ae = new ActionErrors();
		
		if (uname.equals("")) {
			ae.add("uname", new ActionMessage("msg1"));
		}
		if (pwd.equals("")) {
			ae.add("pwd", new ActionMessage("msg2"));
		}
		
		return ae;
	}
	
}
