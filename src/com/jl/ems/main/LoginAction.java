package com.jl.ems.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

public class LoginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		LoginForm lf = (LoginForm) form;

		String username = lf.getUname();
		String pwd = lf.getPwd();
		String role = lf.getRole();

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1522:orcl", "system", "delfina");
		PreparedStatement ps = con.prepareStatement("select * from login where username=? and pwd=? and userrole=?"); 

		ps.setString(1, username);
		ps.setString(2, pwd);
		ps.setString(3, role);

		ActionForward af = mapping.findForward("success");

		ResultSet rs = ps.executeQuery();

		if (rs.next()) {
			if (role.equals("admin"))
				af = mapping.findForward("adminsuccess");
			if (role.equals("employee"))
				af = mapping.findForward("employeesuccess");
			if (role.equals("user"))
				af = mapping.findForward("usersuccess");
		} else {
			ActionMessages am = new ActionMessages();
			am.add("uname", new ActionMessage("msg3"));
			am.add("pwd", new ActionMessage("msg4"));
			addErrors(request, am);
			af = mapping.findForward("samepage");

		}

		return af;
	}

}
