package web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.CreditMetierImpl;
import metier.ICreditMetier;

public class ServletCredit extends HttpServlet {
	private ICreditMetier metier;
	private CreditModel model; 
	
	@Override
	public void init() throws ServletException {
		metier = new CreditMetierImpl();
		model = new CreditModel();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double montant = Double.parseDouble(request.getParameter("montant"));
		int duree = Integer.parseInt(request.getParameter("duree"));
		double taux = Double.parseDouble(request.getParameter("taux"));
		
		if(metier != null && model != null && montant > 0 && duree>0 && taux > 0){
			model.setMontant(montant);
			model.setDuree(duree);
			model.setTaux(taux);
			model.setMensualitee(metier.calculMensualitee(montant, duree, taux));
			request.setAttribute("model", model);
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
	}

}
