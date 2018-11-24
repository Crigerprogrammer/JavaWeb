/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Cliente;
import modelo.Conexion;

/**
 *
 * @author SINFORMATICAA
 */
@WebServlet(name = "Ingreso", urlPatterns = {"/ingreso.do"})
public class Ingreso extends HttpServlet {

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
        

       String nit = request.getParameter("txtNit");
       String nombre = request.getParameter("txtNombre");
       String edad   = request.getParameter("txtEdad");

        if (nit.equals("") || nombre.equals("") || edad.equals(""))  {
            String error = "No ha ingresado datos...";
            request.getSession().setAttribute("error",error);    
            request.getRequestDispatcher("error.jsp").forward(request, response);
            }      
        else {
            int ed = 0;
            
            try {
                ed = Integer.parseInt(edad);
                
            }
            catch (NumberFormatException ex){
                String error = "Ingrese solo numeros";
                request.getSession().setAttribute("error", error);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
            
            Cliente c1 = new Cliente (nit,nombre,ed);
            Conexion cn = new Conexion();
            
            if (cn.insertar(c1) > 0){
                request.getRequestDispatcher("exito.jsp").forward(request, response);
            }
            else {
                String error = "No se puede insertar";
                request.getSession().setAttribute("error", error);
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
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
