/*6c. Build a servlet program to check the given number is prime number or not using HTML with step by step procedure. */

package com.prime;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

@WebServlet("/primeServlet")
public class PrimeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        int num = Integer.parseInt(request.getParameter("num"));
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output
        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>Result</title></head><body>");

        out.println("<h2>Entered Number: " + num + "</h2>");

        if (isPrime) {
            out.println("<h1 style='color:green;'>" + num + " is a Prime Number</h1>");
        } else {
            out.println("<h1 style='color:red;'>" + num + " is NOT a Prime Number</h1>");
        }

        out.println("</body></html>");
    }
}
