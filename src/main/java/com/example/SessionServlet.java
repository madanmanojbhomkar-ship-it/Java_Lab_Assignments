/*9.a Build a Session Management using Servlet program set with one minute session  to show Session 
Tracking Information, Session ID,Session Creation Time,Last Access Time,Visit Count 
 
*/



package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/SessionServlet")
public class SessionServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        HttpSession session = request.getSession(true);

        // Set session timeout = 1 minute (60 seconds)
        session.setMaxInactiveInterval(60);

        // Visit count logic
        Integer visitCount = (Integer) session.getAttribute("visitCount");

        if (visitCount == null) {
            visitCount = 1;
        } else {
            visitCount++;
        }

        session.setAttribute("visitCount", visitCount);
        session.setAttribute("username", name);

        // Session details
        String sessionId = session.getId();
        long creationTime = session.getCreationTime();
        long lastAccessTime = session.getLastAccessedTime();

        out.println("<html><body>");

        out.println("<h2>Welcome " + name + "</h2>");

        out.println("<h3>Session Tracking Information</h3>");

        out.println("<p><b>Session ID:</b> " + sessionId + "</p>");
        out.println("<p><b>Session Creation Time:</b> " + new Date(creationTime) + "</p>");
        out.println("<p><b>Last Access Time:</b> " + new Date(lastAccessTime) + "</p>");
        out.println("<p><b>Visit Count:</b> " + visitCount + "</p>");

        out.println("<hr>");
        out.println("<p><b>Session will expire in 1 minute of inactivity</b></p>");

        out.println("</body></html>");
    }
}
