<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
   <link type="text/css" href="../css/ui-lightness/jquery-ui-1.8.1.custom.css" rel="Stylesheet" />   
   <script type="text/javascript" src="../js/jquery-1.4.2.min.js"></script>
   <script type="text/javascript" src="../js/jquery-ui-1.8.1.custom.min.js"></script>
   <s:url namespace="/jsonexample" action="getJSONResult.action" var="jsonResult"/>
   <script>
		$(document).ready(function(){
			
			var arrayValoresAutocompletar = [
			                                "�lava",
			                                "Albacete",
			                                "Alicante",
			                                "Almer�a",
			                                "Asturias",
			                                "Avila",
			                                "Badajoz",
			                                "Barcelona",
			                                "Burgos",
			                                "C�ceres",
			                                "C�diz",
			                                "Cantabria",
			                                "Castell�n",
			                                "Ceuta",
			                                "Ciudad Real",
			                                "C�rdoba",
			                                "Cuenca",
			                                "Gerona",
			                                "Granada",
			                                "Guadalajara",
			                                "Guip�zcoa",
			                                "Huelva",
			                                "Huesca",
			                                "Islas Baleares",
			                                "Ja�n",
			                                "La Coru�a",
			                                "La Rioja",
			                                "Las Palmas",
			                                "Le�n",
			                                "L�rida",
			                                "Lugo",
			                                "Madrid",
			                                "M�laga",
			                                "Melilla",
			                                "Murcia",
			                                "Navarra",
			                                "Orense",
			                                "Palencia",
			                                "Pontevedra",
			                                "Salamanca",
			                                "Segovia",
			                                "Sevilla",
			                                "Soria",
			                                "Tarragona",
			                                "Tenerife",
			                                "Teruel",
			                                "Toledo",
			                                "Valencia",
			                                "Valladolid",
			                                "Vizcaya",
			                                "Zamora",
			                                "Zaragoza"
			                             ];
			                             
										 /* $("#autoc1").autocomplete({
			                                source: arrayValoresAutocompletar
			                             }); */
			                             
			 $("#autoc1").autocomplete({
			 	source: '${jsonResult}',
				minLength: 2
			});
   			
		});
</script>
</head>
<body>

	<h1>Probando el plugin autocomplete de jQuery UI</h1>
   
   <form>
      Escribe una provincia de Espa�a: <input type="text" size="20" id="autoc1">
      <br>
      * Pon al menos una letra para que salgan opciones.
      <br>
      * Puedes escribir algo como "ma" para que salgan sugerencias como "Madrid", "Salamanca", etc.
   </form>

</body>
</html>