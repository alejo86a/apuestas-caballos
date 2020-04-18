package servlet;

import model.Bettor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "BettorServlet")
public class BettorServlet extends HttpServlet {


    private ArrayList<Bettor> bettors = new ArrayList<>();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            System.out.println(request.getParameter("name")+","+request.getParameter("amount"));
            if (!request.getParameter("name").equals("") && !request.getParameter("amount").equals("")) {
                bettors.add(new Bettor(request.getParameter("name"), Double.parseDouble(request.getParameter("amount"))));
            }
            out.println("<table style= cellspacing='1' bgcolor='#0099cc'>");
            out.println("<tr>");
            out.println("<td style= rowspan='7' align='center' bgcolor='#f8f8f8'> # Caballo </td>");
            out.println("<td style= rowspan='7' align='center' bgcolor='#f8f8f8'>Nombre Caballo</td>");
            out.println("</tr>");
            for(int i=0; i<bettors.size(); i++){
                Bettor bettor = bettors.get(i);
                out.println("<tr>");
                out.println("<td style= rowspan='7' align='center' bgcolor='#f8f8f8'>"+bettor.getName()+"</td>");
                out.println("<td style= rowspan='7' align='center' bgcolor='#f8f8f8'>"+bettor.getAmount()+"</td>");
                out.println("</tr>");
            }
            out.println("</table>");

        } catch(Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
