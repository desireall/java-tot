<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="UTF-8">
<!-- 
 <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
 -->
</head>
<body>
<h2>Hello World!</h2>

	<div id="fileuploadContent">
		<h2>File Upload</h2>
		<!--
		    File Uploads must include CSRF in the URL.
		    See http://docs.spring.io/spring-security/site/docs/3.2.x/reference/htmlsingle/#csrf-multipart
		-->
		<c:url var="actionUrl" value="fileupload"/>
		<!-- <form id="fileuploadForm" action="${actionUrl}" method="POST" enctype="multipart/form-data" class="cleanform"> -->
		<form id="fileuploadForm" action="${actionUrl}" method="POST" enctype="multipart/form-data" class="cleanform">
			<div class="header">
		  		<h2>Form</h2>
		  		<c:if test="${not empty message}">
					<div id="message" class="success">${message}</div>	  		
		  		</c:if>
			</div>
			<label for="file">File</label>
			<input id="file" type="file" name="file" />
			<p><button type="submit">Upload</button></p>		
		</form>
		
        
		<!-- 
		<script type="text/javascript">
			$(document).ready(function() {
				$('<input type="hidden" name="ajaxUpload" value="true" />').insertAfter($("#file"));
				$("#fileuploadForm").ajaxForm({ success: function(html) {
						$("#fileuploadContent").replaceWith(html);
					}
				});
			});
		</script>	
		 -->
		
	</div>

     <c:url var="downUrl" value="fileupload/list"/>
	 <!-- 
	  <a href=${downUrl}> download </a>
	  -->
	 <a href=${downUrl}>下载 </a>

</body>
</html>
