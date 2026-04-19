package com.register;
import java.sql.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static final String url = "jdbc:mysql://localhost:3306/my_database";
    private static final String user = "root";
    private static final String password = "admin";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String ageString = request.getParameter("age");
        int age = Integer.parseInt(ageString);
        
        
        String sql = "INSERT INTO users (name, email, age) VALUES (?, ?, ?)";
        
        
        
        

            try (Connection conn = DriverManager.getConnection(url , user , password);
                 PreparedStatement pstmt = conn.prepareStatement(sql)) {

                pstmt.setString(1, name);
                pstmt.setString(2, email);
                pstmt.setInt(3, age);

                int rowsAffected = pstmt.executeUpdate();

                if (rowsAffected > 0) {
                    out.println("<h3>Registration Successful!</h3>");
                    out.println("<p>Welcome, " + name + ".</p>");
                } else {
                    out.println("<h3>Registration Failed. Please try again.</h3>");
                }
            }
         catch (Exception e) {
            e.printStackTrace();
            out.println("<h3>Error occurred: " + e.getMessage() + "</h3>");
        }
    }
		
	
}
