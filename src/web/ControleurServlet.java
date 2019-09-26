package web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.CreditMetier;

import java.io.IOException;

import javax.servlet.ServletException;

@SuppressWarnings("serial")
public class ControleurServlet extends HttpServlet {
	private CreditMetier metier;
	@Override
	public void init() throws ServletException{
		setMetier(new CreditMetier());
	}
	@Override
	protected void doGet (HttpServletRequest request,
			HttpServletResponse response )
		throws ServletException ,IOException {
		request.setAttribute("mod",new CreditModel()); 
		request.getRequestDispatcher("VueCredit.jsp").forward
	(request, response);
		
	}
	public CreditMetier getMetier() {
		return metier;
	}
	public void setMetier(CreditMetier metier) {
		this.metier = metier;
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException ,IOException {
		double montant=Double.parseDouble(request.getParameter("montant"));
		double taux=Double.parseDouble(request.getParameter("taux"));
		int duree=Integer.parseInt(request.getParameter("duree"));
		CreditModel model=new CreditModel();
		model.setMontant(montant);
		model.setTaux(taux);
		model.setDuree(duree );
		double res=metier.calculMensulatie(montant, duree, taux);
		model.setMensualte(res);
		request.setAttribute("mod", model);
		request.getRequestDispatcher("VueCredit.jsp").forward(request, response);
	
	
	}

}
