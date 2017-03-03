<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta http-equiv="Pragma" content="no-cache">
        <meta http-equiv="Cache-Control" content="no-cache">
	<meta http-equiv="Expires" content="0">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" /> 
        <title>Install Geoloqi</title>
        <style type="text/css">
                body {
                        background: url(bkg.png) repeat #c5ccd4;
                        font-family: Helvetica, arial, sans-serif;
                }
                .congrats {
                        font-size: 16pt;
                        padding: 6px;
                        text-align: center;
                }
                .step {
                        background: white;
                        border: 1px #ccc solid;
                        border-radius: 14px;
                        padding: 4px 10px;
                        margin: 10px 0;
                }
                .instructions {
                        font-size: 10pt;
                }
                .arrow {
                        font-size: 15pt;
                }
                table {
                        width: 100%;
                }
        </style>
</head>


<body>
 
<div class="step">
        <table><tr>
                  <!-- 
                 <td class="instructions">IOS 噬魂者</td>
                   -->
                <td class="instructions">IOS</td>
                <td width="72" class="imagelink">
                        <!-- 
                        <a href="itms-services://?action=download-manifest&url=https://myapptest1.sinaapp.com/manifest.plist">
                        -->
                        <a href="itms-services://?action=download-manifest&url=https://desireall.github.io/ota/fight/manifest.plist">
                                <img src="resources/messages/icon.png" height="72" width="72" />
                         </a>
                </td>
				</tr>
		<tr>
			<td class="instructions">Android</td>
			<td width="72" class="imagelink">
			    <c:url var ="apkdown" value="resources/apk/document/aa.rar"></c:url>
			    <a href=${apkdown} >
                                <img src="resources/messages/icon.png" height="72" width="72" />
                         </a>
			</td>
                </tr>
                
				<tr>
                <!-- 
                 <td class="instructions">点击上传</td>
                 -->
                 <td class="instructions">clickupload</td>
                <td width="72" class="imagelink">
                        <a href="http://192.168.1.222/upload.html">
                <c:url var="upload" value="resources/messages/upload.png"/>
                                <img src=${upload} height="72" width="72" />
                         </a>
                </td>
				</tr>
				
				<tr>
               <!-- 
                <td class="instructions">查看各个版本</td>
                <td class="instructions">versionList</td>
                <td width="72" class="imagelink">
                        <a href="http://192.168.1.222/index.php">
                                    <c:url var="list" value="resources/messages/list.png"/>
                                <img src=${list} height="72" width="72" />
                         </a>
                </td>
                --> 
				</tr>
        </table>
</div>
</body>
</html>
