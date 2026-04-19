/*6b. Build a servlet program to create a cookie to get your name through text box and press submit button( through HTML) to 
 * display the message by greeting Welcome back your name ! , you have visited this page n times ( n = number of your visit ) 
 * and demonstrate the expiry of cookie also. 
 */
 


package sixthB;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cookieServlet")
public class CookieServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");
        int visitCount = 1;

        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {

                if ("visitCount".equals(c.getName())) {
                    try {
                        visitCount = Integer.parseInt(c.getValue());
                        visitCount++;
                    } catch (NumberFormatException e) {
                        visitCount = 1;
                    }
                }

                if ("username".equals(c.getName())) {
                    name = c.getValue();
                }
            }
        }

        // Create cookies
        Cookie nameCookie = new Cookie("username", name);
        Cookie countCookie = new Cookie("visitCount", String.valueOf(visitCount));

        // Expiry time (30 seconds for demo)
        nameCookie.setMaxAge(30);
        countCookie.setMaxAge(30);

        response.addCookie(nameCookie);
        response.addCookie(countCookie);

        // Output to browser
        out.println("<!DOCTYPE html>");
        out.println("<html><head><title>Result</title></head><body>");
        out.println("<h1>Welcome back " + name + "!</h1>");
        out.println("<h2>You have visited this page " + visitCount + " times</h2>");
        out.println("<p><b>Cookie expires in 30 seconds</b></p>");
        out.println("</body></html>");
    }
}
