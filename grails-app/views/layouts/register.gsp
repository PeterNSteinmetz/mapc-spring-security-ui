<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<title><g:layoutTitle default='User Registration'/></title>

<link rel="shortcut icon" href="${resource(dir:'images',file:'favicon.ico')}" type="image/x-icon"/>
<g:javascript library='jquery' plugin='jquery' />

<link rel="stylesheet" media="screen" href="${resource(dir:'css',file:'reset.css',plugin:'mapc-spring-security-ui')}"/>
<link rel="stylesheet" media="screen" href="${resource(dir:'css',file:'spring-security-ui.css',plugin:'mapc-spring-security-ui')}"/>
<jqui:resources />
<link rel="stylesheet" media="screen" href="${resource(dir:'css/smoothness',file:'jquery-ui-1.8.2.custom.css',plugin:'mapc-spring-security-ui')}"/>
<link rel="stylesheet" media="screen" href="${resource(dir:'css',file:'jquery.jgrowl.css',plugin:'mapc-spring-security-ui')}"/>
<link rel="stylesheet" media="screen" href="${resource(dir:'css',file:'jquery.safari-checkbox.css',plugin:'mapc-spring-security-ui')}"/>
<link rel="stylesheet" media="screen" href="${resource(dir:'css',file:'auth.css',plugin:'mapc-spring-security-ui')}"/>

<g:layoutHead/>

</head>

<body>

<g:javascript src='jquery/jquery.jgrowl.js' plugin='mapc-spring-security-ui'/>
<g:javascript src='jquery/jquery.checkbox.js' plugin='mapc-spring-security-ui'/>
<g:javascript src='spring-security-ui.js' plugin='mapc-spring-security-ui'/>
<g:layoutBody/>

<s2ui:showFlash/>

</body>
</html>
