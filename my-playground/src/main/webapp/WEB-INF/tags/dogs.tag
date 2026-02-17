<%@ tag import="com.example.models.Dog, java.util.ArrayList" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="myDogs" type="java.util.List" required="false" %>


<c:forEach items="${myDogs}" var="thisDog" >
  <t:dog myDog="${thisDog}" />
</c:forEach>