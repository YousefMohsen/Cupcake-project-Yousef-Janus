/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Controller.Controller;
import Data.DB;
import entity.CupCake;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Yousinho
 */
@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    Controller con = new Controller();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String origin = request.getParameter("origin");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            HttpSession session = request.getSession();

            //login
            switch (origin) {

                case "login":

                    if (con.checkLogin(username, password)) {

                        session.setAttribute("toppings", con.getToppings());
                        session.setAttribute("bottoms", con.getBottoms());

                        session.setAttribute("totalPrice", con.totalPrice());
                        session.setAttribute("balance", con.getCurrentuser().getBalance());
                        session.setAttribute("currentUser", con.getCurrentuser().getUsername());
                        response.sendRedirect("ShopPage.jsp");

                    } else {
                        response.sendRedirect("Login.jsp");
                    }

                    break;
                case "register":
                    con.register(username, password);
                     con.checkLogin(username, password);
                    try {
                        //Form data:
                        String usersave = con.getCurrentuser().getUsername();
                        String passwsave = con.getCurrentuser().getPassword();

                        String sql = "INSERT INTO login (username, password) VALUES (?, ?)";
                        Connection conn = DB.getConnection();
                        PreparedStatement pstmt = conn.prepareStatement(sql);
                        pstmt.setString(1, usersave);
                        pstmt.setString(2, passwsave);
                        pstmt.executeUpdate();

                    } catch (SQLException ex) {
                        System.out.println("catch");
                        ex.printStackTrace();
                    }

                    // PrintWriter out = response.getWriter();  
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Congratulations! You are now registered in our database! You have to login to continue');");
                    out.println("location='Login.jsp';");
                    out.println("</script>");

                    //out.println("hej" +con.getCurrentuser().getUsername());
                    break;

                case "toppingsForm":

                    String selectedButton = request.getParameter("bottoms").toString();
                    String selectedtopping = request.getParameter("toppings").toString();
                    int count = Integer.parseInt(request.getParameter("count"));

                    con.addToCart(new CupCake(con.getTopping(selectedtopping), con.getButtom(selectedButton), count));
                    session.setAttribute("cartToString", con.cartToString());
                    session.setAttribute("totalPrice", con.totalPrice());
                    session.setAttribute("cart", con.getCart());
                    response.sendRedirect("ShopPage.jsp");

                    break;

                case "placeOrder":

                    con.placeOrder();
                    session.setAttribute("totalPrice", con.totalPrice());
                    session.setAttribute("balance", con.getCurrentuser().getBalance());

                    response.sendRedirect("ShopPage.jsp");

                    break;

                case "clearCart":
                    con.clearCart();
                    session.setAttribute("cartToString", con.cartToString());
                    session.setAttribute("totalPrice", con.totalPrice());

                    response.sendRedirect("ShopPage.jsp");

                    break;

                default:
                    response.sendRedirect("Login.jsp");

            }

//    HttpSession session = request.getSession();
//    session.setAttribute("userlist", con.getUsers());
            //if(origin.equals("login")){}
            //request.setAttribute("userlist", con.getUsers());
            // response.sendRedirect("index.html");
            // request.getRequestDispatcher("index.html").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
