/*10.a Build an Application to get Username,Email and Designation through JSP called index.jsp with
 *  client sided validation and submit to the servlet called UserDataServlet and process all the fields with server sided validation and display all the data through result.jsp with a link to move to the client side 
 */
 


import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/UserDataServlet")
public class userDataServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String designation = request.getParameter("designation");

        // Server-side validation
        if (username == null || email == null || designation == null ||
            username.trim().isEmpty() || email.trim().isEmpty() || designation.trim().isEmpty()) {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h3>All fields are required!</h3>");
            out.println("<a href='index.jsp'>Go Back</a>");
            return;
        }

        if (!email.matches("^[^ ]+@[^ ]+\\.[a-z]{2,}$")) {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h3>Invalid Email Format!</h3>");
            out.println("<a href='index.jsp'>Go Back</a>");
            return;
        }

        // Pass data to JSP
        request.setAttribute("username", username);
        request.setAttribute("email", email);
        request.setAttribute("designation", designation);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}