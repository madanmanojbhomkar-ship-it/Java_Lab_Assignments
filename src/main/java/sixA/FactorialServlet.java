/*6a. Build a servlet program to find the factorial of a number using HTML with step by step procedure. */

package sixA;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/factorial")
public class FactorialServlet extends HttpServlet {

    // Handles both GET and POST
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");

        try {
            String input = request.getParameter("num");

            if (input == null || input.isEmpty()) {
                out.println("<h3>Please enter a number.</h3>");
            } else {
                int num = Integer.parseInt(input);

                if (num < 0) {
                    out.println("<h3>Factorial not defined for negative numbers.</h3>");
                } else {
                    long fact = 1;
                    for (int i = 1; i <= num; i++) {
                        fact *= i;
                    }
                    out.println("<h2>Factorial of " + num + " is: " + fact + "</h2>");
                }
            }

        } catch (NumberFormatException e) {
            out.println("<h3>Invalid input. Please enter a valid integer.</h3>");
        }

        // Back button
        out.println("<br><a href='index.html'>Go Back</a>");
        out.println("</body></html>");
    }
}