# FirstStrutsProject
In Udemy Course Section 1 : FirstStrutsProject

# Maven Dependencies 

		<dependency>
			<groupId>javax.servlet</groupId>
			<artifactId>javax.servlet-api</artifactId>
			<version>3.1.0</version>
		</dependency>
		<dependency>
			<groupId>org.apache.struts</groupId>
			<artifactId>struts2-core</artifactId>
			<version>2.5.12</version>
		</dependency>
		<dependency>
			<groupId>org.apache.struts</groupId>
			<artifactId>struts2-convention-plugin</artifactId>
			<version>2.5.12</version>
		</dependency>
    
    
# Struts 2 filter dispatcher 

    <!DOCTYPE web-app PUBLIC
    "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
    "http://java.sun.com/dtd/web-app_2_3.dtd" >
 
    And
 
   	<filter>
		<filter-name>struts2</filter-name>
		<filter-class>org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter</filter-class>
	</filter>
	<filter-mapping>
		<filter-name>struts2</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>
 
# struts.xml

<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE struts PUBLIC
    "-//Apache Software Foundation//DTD Struts Configuration 2.0//EN"
    "http://struts.apache.org/dtds/struts-2.0.dtd">
    
 <struts>
 
 
 <constant name="struts.devMode" value="true"/>
 
 
 <package name="default" namespace="/" extends="struts-default">
 
 	<action name="hello" method="execute" class="actions.HelloAction">
 		<result name="success">
 			/hello.jsp
 		</result>
 	</action>
 </package>
 
 </struts>
