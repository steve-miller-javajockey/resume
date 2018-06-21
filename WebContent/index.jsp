<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
<s:url var="remoteUrl" value="jms/connection-detail" escapeAmp="false" />
<div style="position:absolute;top:100px;left:100px;font-size:24px"> TESTING3!!!! </div>
<div><a href='${remoteUrl}'/>SHOW</a></div>
<div><a href='${remoteUrl}!show?subType=1'/>SHOW ACTIVE MQ</a></div>
<div><a href='${remoteUrl}!show?subType=2'/>SHOW ARTEMIS</a></div>



</body>





</html>