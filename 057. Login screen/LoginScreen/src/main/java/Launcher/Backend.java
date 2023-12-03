package Launcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

    public class Backend extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            String name = request.getParameter("name");
            String password = request.getParameter("password");
            String email = request.getParameter("email");

            // Process the data or perform any backend tasks
            // ...

            // Return a response back to the frontend
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h1>Data received successfully!</h1>");
        }
    }

