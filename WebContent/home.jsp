<!DOCTYPE html>
<%@page import="web.CreditModel"%>
<html>
<%
	CreditModel model = (CreditModel)request.getAttribute("model");
	if(model == null){
		model = new CreditModel();
	}
%>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Simelateur Credit</title>
  </head>
  <body>
    <div align="center">
      <h1>Simelateur Credit JavaEE</h1>
    </div>
    <div align="center">
      <form action="calcul.do" method="post">
        <table>
          <tr>
            <td><label for="montant">Montant :</label></td>
            <td><input type="number" name="montant" id="montant"></td>
            <td>DHs</td>
          </tr>
          <tr>
            <td><label for="duree">Duree :</label></td>
            <td><input type="number" name="duree" id="duree"></td>
            <td>Mois</td>
          </tr>
          <tr>
            <td><label for="taux">Taux :</label></td>
            <td><input type="text" name="taux" id="taux"></td>
            <td>%</td>
          </tr>
        </table> 
        <button type="submit">Calculer</button>
      </form>
    </div>
    <% 
    if(model.getMensualitee() > 0){
    	out.println("<div align='center'>");
    	out.println("<h2>Mensualitee: " + model.getMensualitee() +"</h2>");
    	out.println("</div>");
    }
    
    %>
    
  </body>
</html>