<%-- 
    Document   : insert_customer
    Created on : 12/05/2017, 01:40:44 PM
    Author     : Zeii
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
        <title>Ingresar cliente</title>
    </head>
    <body background="Images/background-image.gif">
        <i>
            <marquee <b><font color="lightgreen" size="8">Ingreso de Clientes al Sistema </font></b>
            </marquee>
        </i>
    <center>
        <font color="lightgreen">
        <h2> Formulario de ingreso de clientes </h2>
        </font>
        <form action="CustomerInfoServlet" method="get">

            <table align="center">
                <tr>
                    <td> <font size="5" color="lightgreen"><b> <label>Identificación: </label> </b></font></td>

                    <td><input type="text" name="identification" size="30"></td>
                </tr>
                <tr>
                    <td> <font size="5" color="lightgreen"><b> <label>Nombre: </label> </b></font></td>

                    <td><input type="text" name="name" size="30"></td>
                </tr>
                <tr>
                    <td><font size="5" color="lightgreen"><b> <label>Correo: </label> </b></font></td>
                    <td><input type="text" name="email" size="30"></td>
                </tr>
                <tr>
                    <td> <font size="5" color="lightgreen"><b> <label>Teléfono: </label> </b></font></td>
                    <td><input type="text" name="phone" size="30"></td>
                </tr>
                <tr>
                    <td><font size="5" color="lightgreen"><b> <label>Username: </label> </b></font></td>
                    <td><input type="text" name="username" size="30"></td>
                </tr>
                <tr>
                    <td><font size="5" color="lightgreen"><b> <label>Password: </label> </b></font></td>
                    <td><input type="text" name="password" size="30"></td>
                </tr>

                <tr>
                    <td><font size="5" color="lightgreen"><b> <label>Discapacidad: </label> </b></font></td>

                    <td><font color="lightgreen" size="3"><input type="radio" name="disabilityPresented" value="true"> Sí<br></font>
                   <font color="lightgreen" size="3"><input type="radio" name="disabilityPresented" value="false"> No<br></font></td>

                </tr>
            </table>
            <input type="submit" value="Guardar cliente" />
            <input type="reset" value="Cancelar" />
        </form>
    </center>

</body>
</html>
