<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<h1>ADMIN SUCCESS & CHANGE PASSWORD</h1>

<html:form action="adminupdate">

<pre>
OLD_UNNAME:	<html:text property="ouname"></html:text>	
NEW_UNNAME:	<html:text property="nuname"></html:text>

OLD_PWD:	<html:password property="opwd"></html:password>
NEW_PWD:	<html:password property="npwd"></html:password>

			<html:submit value="ADMIN_UPDATE">
			</html:submit>
</pre>

</html:form>