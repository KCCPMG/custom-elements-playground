<%@ page import="com.example.models.Dog, com.example.models.TableColumn, 
com.example.models.TableColumns, java.util.ArrayList, org.json.JSONObject,
org.json.JSONArray" %>
<%@ taglib prefix="r" uri="http://mywebsite.com/tags" %>
<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<html> 
<body>
  <h2>Hello from Maven + Jetty!</h2>
  <p>Current Time: <%= new java.util.Date() %></p>
  <r:greet user="Developer" />
  <t:basicTag />
  <t:childRenderingTag>
    We're children we're children
  </t:childRenderingTag>
  <%
    Dog mainDog = new Dog("Mongo", "Golden Retriever", 7);
    request.setAttribute("mainDog", mainDog);
  %>
  <%-- <t:dog myDog="${mainDog}" />
  <%
    ArrayList alDogs = new ArrayList();
    alDogs.add(new Dog("Mongo 1", "Golden Retriever", 7));
    alDogs.add(new Dog("Mongo 2", "Silver Retriever", 7));
    alDogs.add(new Dog("Mongo 3", "Bronze Retriever", 7));
    request.setAttribute("alDogs", alDogs);
  %>
  <t:dogs myDogs="${alDogs}" /> --%>
  <% 
    // initialize alColumns and jsonData
    ArrayList<TableColumn> alColumns = new ArrayList<TableColumn>();
    JSONArray dogData = new JSONArray();

    // populate tableData
    JSONObject spot = new JSONObject();
    JSONObject spike = new JSONObject();
    JSONObject spud = new JSONObject();
    
    spot.put("name", "Spot");
    spot.put("breed", "Dalmatian");
    spot.put("age", 1);

    spike.put("name", "Spike");
    spike.put("breed", "Bulldog");
    spike.put("age", 2);

    spud.put("name", "Spud");
    spud.put("breed", "Bloodhound");
    spud.put("age", 3);

    dogData.put(spot);
    dogData.put(spike);
    dogData.put(spud);

    // populate alColumns
    alColumns.add(new TableColumn(new JSONObject(
            "{'strHeaderText': 'Name'," + 
            "'strDetailJSONKey': 'name'}"
    )));
    alColumns.add(new TableColumn(new JSONObject(
            "{'strHeaderText': 'Breed'," + 
            "'strDetailJSONKey': 'breed'}"
    )));
    alColumns.add(new TableColumn(new JSONObject(
            "{'strHeaderText': 'Age'," + 
            "'strDetailJSONKey': 'age'}"
    )));
    TableColumns tableColumns = new TableColumns(alColumns);

    // populate request
    request.setAttribute("columns", tableColumns);
    request.setAttribute("dogData", dogData);
  %>
  <t:sortableTable 
    tableColumns="${columns}"
    tableData="${dogData}"
  />
</body>
</html>