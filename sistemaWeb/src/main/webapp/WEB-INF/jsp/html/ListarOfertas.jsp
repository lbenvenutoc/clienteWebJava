<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page import="quierescomprar.bean.Oferta"%>
<%@page import="java.util.List"%>
<html>
<head>

<script type="text/javascript">
	function buscar() {
		document.formularioCliente.accion.value = 'buscar';
		document.formularioCliente.submit();
	}
</script>
</head>
<body>

	<form name="formularioOfertas" method="post"
		action="<%=request.getContextPath()%>/listarOfertas.do">
		<input type="hidden" name="accion" value="" />

		<table>


			<tr>

				<td>

					<table>

						<tr>

							<td><input name="btnBuscar" type="submit" id="btnBuscar"
								onclick="javascript:buscar();" value="Listar Ofertas"></td>

						</tr>

					</table>

				</td>

			</tr>

			<tr>
			
				<td>
				
				<table width="100%" border="1">
                  <tr>
                   
                    <td width="18%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo56">Producto</span></td>
                    <td width="30%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo56">Precio </span></td>
                    <td width="14%" bgcolor="#CC0000" class="Estilo27"><span class="Estilo56">Precio Oferta</span></td>
                  
                  </tr>
                  <c:forEach items="${model.ofertas}" var="oferta">
	                  <tr>
	                    <td class="Estilo22" scope="row">${oferta.producto.desPro}</td>
	                    <td class="Estilo22">${oferta.producto.prePro}</td>
	                    <td class="Estilo22">${oferta.producto.prePro}*${oferta.porOfe}</td>
	                 
	                  </tr>                  	
                  </c:forEach>
              </table>
				
				
				</td>
			
			</tr>

		</table>

	</form>
</body>
</html>
