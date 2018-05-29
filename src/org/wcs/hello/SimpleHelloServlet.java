package org.wcs.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleHelloServlet", urlPatterns = {"/hello-form","/custom-hello"})
public class SimpleHelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String param1 = request.getParameter("firstname");
        String param2 = request.getParameter("lastname");
        String param3 = request.getParameter("date");

       int date=  Integer.parseInt(param3);

       if (date<=12){
            param3 = "Good moring ";
       }
        if (date> 12 && date<20){
            param3 = "Good afternoon ";
        }
        else {
           param3 = " Good night ";
        }

        String message = param3 + param1 +"  "+ param2;
        request.setAttribute("sample", message);
        this.getServletContext().getRequestDispatcher("/custom-hello.jsp")
                .forward(request, response);



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {






    }
}
