<%-- 1. Import the class so the tag knows what a "Dog" is --%>
<%@ tag import="com.example.models.Dog" %>

<%-- 2. Define the attribute using the class type --%>
<%@ attribute name="myDog" type="com.example.models.Dog" required="false" %>

<%-- 3. Use Expression Language (EL) to access Dog properties --%>
<div class="dog-card">
  <h3>Name: ${myDog.getName()}</h3>
  <p>Breed: ${myDog.breed}</p>
  
  <%-- Or use a Scriptlet for complex logic --%>
  <% 
      // Because of the import, 'Dog' is available as a type here
      Dog d = (Dog) jspContext.getAttribute("myDog");
      if (d.getAge() > 10) { 
  %>
      <span>Senior Dog</span>
  <% 
  } else {
  %>
    <span>Junior Dog</span>
  <% 
  }
  %>
</div>