<%@taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<h1>LOGIN FORM</h1>

<html:form action="login">

<pre>
USERNAME:	<html:text property="uname" /><html:errors property="uname"/>
PASSWORD:	<html:password property="pwd" /><html:errors property="pwd"/>
ROLE:		<html:select property="role"><html:errors property="role"/>
				<html:option value="admin">ADMIN</html:option>
				<html:option value="employee">EMPLOYEE</html:option>
				<html:option value="user">USER</html:option>
			</html:select>
			<html:submit value="LOGIN.."/>

</pre>

</html:form>