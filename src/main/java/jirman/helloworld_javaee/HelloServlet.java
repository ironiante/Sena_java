package jirman.helloworld_javaee;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Obtener parámetros del formulario
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        response.setContentType("text/html");

        // Generar respuesta HTML
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        if ("admin".equals(username) && "1234".equals(password)) { // Simulando validación simple
            out.println("<h1>Bienvenido, " + username + "!</h1>");
        } else {
            out.println("<h1>Usuario o contraseña incorrectos.</h1>");
        }
        out.println("</body></html>");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}