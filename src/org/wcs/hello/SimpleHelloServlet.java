package org.wcs.hello;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SimpleHelloServlet", urlPatterns = {"/hello-form"})
public class SimpleHelloServlet extends HttpServlet{



    public static final String VUE          = "/WEB-INF/hello-form.jsp";
    public static final String CHAMP_NOM    = "nom";
    public static final String CHAMP_PRENOM   = "prenom";
    public static final String CHAMP_HEURE   = "heure";


    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        /* Affichage de la page d'inscription */
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
        String resultat;
        Map<String, String> erreurs = new HashMap<String, String>();

        /* Récupération des champs du formulaire. */
        String nom = request.getParameter(CHAMP_NOM);
        String prenom = request.getParameter(CHAMP_PRENOM);
        String heure = request.getParameter(CHAMP_HEURE);

        String[] parts = heure.split(":");
        double  HH = Integer.parseInt(parts[0]);
        double mm = Integer.parseInt(parts[1])/60;

        double heureDec = HH + mm;

        if(heureDec <12) {
            request.setAttribute("message", "Good morning " + prenom + " " + nom + "!");
        }
        else if(heureDec >= 12 && heureDec <18){
            request.setAttribute("message", "Good afternoon " + prenom + " " + nom + "!");
        }
        else {
            request.setAttribute("message", "Good night " + prenom + " " + nom + "!");
        }

        request.getRequestDispatcher("WEB-INF/custom-hello.jsp").forward(request,response);
    }
}