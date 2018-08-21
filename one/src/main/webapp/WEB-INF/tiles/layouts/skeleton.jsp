<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <title><tiles:insertAttribute name="title" /></title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
</head>
<body>
    <tiles:importAttribute name="currentPage" scope="request" />

  <!-- Menu -->
   <div>
    <tiles:insertAttribute name="menu" />
 </div>
    <!-- Main -->
    <tiles:insertAttribute name="content" />
 
    <!-- Footer -->
    <div>
        <tiles:insertAttribute name="footer" />
    </div>
</body>
</html>