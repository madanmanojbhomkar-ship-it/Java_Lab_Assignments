/*8a. Build a servlet program to  create a cookie to get your name through text box and press submit button( through HTML)  to display the message by greeting Welcome back your name ! , you have visited this page n times
 *  ( n = number of your visit )  along with the list of cookies and demonstrate the expiry of cookie also.  */

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

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        int visitCount = 1;

        Cookie[] cookies = request.getCookies();

        Cookie visitCookie = null;

        // Read existing visit cookie
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitCount")) {
                    visitCookie = c;
                }
            }
        }

        // Increase visit count
        if (visitCookie != null) {
            visitCount = Integer.parseInt(visitCookie.getValue()) + 1;
        }

        // Create cookies
        Cookie nameCookie = new Cookie("username", name);
        Cookie countCookie = new Cookie("visitCount", String.valueOf(visitCount));

        // Cookie expiry (1 minute = 60 seconds)
        nameCookie.setMaxAge(60);
        countCookie.setMaxAge(60);

        response.addCookie(nameCookie);
        response.addCookie(countCookie);

        // Output
        out.println("<html><body>");

        out.println("<h2>Welcome back " + name + "!</h2>");
        out.println("<h3>You have visited this page " + visitCount + " times</h3>");

        out.println("<hr>");
        out.println("<h3>List of Cookies:</h3>");

        Cookie[] allCookies = request.getCookies();

        if (allCookies != null) {
            for (Cookie c : allCookies) {
                out.println("<p><b>" + c.getName() + "</b> = " + c.getValue() + "</p>");
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
