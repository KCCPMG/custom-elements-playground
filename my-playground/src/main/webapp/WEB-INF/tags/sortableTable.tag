<%@ tag import="com.example.models.TableColumn, org.json.JSONArray" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ attribute name="tableColumns" 
  type="com.example.models.TableColumns" 
  required="true" 
%>
<%@ attribute name="tableData"
  type="org.json.JSONArray"
  required="true"
%>


<hr />
<table>
  <thead>
    <c:forEach var="column" items="${tableColumns.getTableColumns()}">
      <th>${column.getStrHeaderText()}</th>
    </c:forEach>
  </thead>
  <tbody>
    <c:forEach var="row" items="${tableData.toList()}">
      <tr>
        <c:forEach var="column" items="${tableColumns.getTableColumns()}">
          <td>${row.get(column.getStrDetailJSONKey())}</td>
        </c:forEach>
      </tr>
    </c:forEach>
  </tbody>
</table>