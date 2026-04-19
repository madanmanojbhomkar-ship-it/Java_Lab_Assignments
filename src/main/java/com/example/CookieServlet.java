/*8b. Build a servlet program to  create a cookie to get your name through text box and press submit button( through HTML)  to display the message by greeting Welcome back your name ! , you have visited this page n times ( n = number of your visit )  along with the list
 *  of cookies and its setvalues and demonstrate the expiry of cookie also.  */


package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        int visitCount = 1;

        Cookie[] cookies = request.getCookies();

        Cookie nameCookie = null;
        Cookie visitCookie = null;

        // Read existing cookies
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("username")) {
                    nameCookie = c;
                }
                if (c.getName().equals("visitCount")) {
                    visitCookie = c;
                }
            }
        }

        // Calculate visit count
        if (visitCookie != null) {
            visitCount = Integer.parseInt(visitCookie.getValue()) + 1;
        }

        // Create cookies
        Cookie c1 = new Cookie("username", name);
        Cookie c2 = new Cookie("visitCount", String.valueOf(visitCount));

        // Set expiry (60 seconds demonstration)
        c1.setMaxAge(60);
        c2.setMaxAge(60);

        response.addCookie(c1);
        response.addCookie(c2);

        // Output page
        out.println("<html><body>");

        out.println("<h2>Welcome back " + name + "!</h2>");
        out.println("<h3>You have visited this page " + visitCount + " times</h3>");

        out.println("<hr>");
        out.println("<h3>List of Cookies (Name = Value):</h3>");

        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("<p>" + c.getName() + " = " + c.getValue() + "</p>");
            }
        } else {
            out.println("<p>No cookies found</p>");
        }

        out.println("<hr>");
        out.println("<h3>Cookie Expiry Demonstration</h3>");
        out.println("<p>Cookies will expire in <b>60 seconds</b></p>");

        out.println("</body></html>");
    }
}
