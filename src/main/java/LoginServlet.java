import DomæneObjekter.Konto;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String navn = request.getParameter("navn");
        String kode = request.getParameter("kode");

        Map<String, Konto> kontoMap = (Map<String, Konto>) getServletContext().getAttribute("konti");

        Konto konto = kontoMap.getOrDefault(navn,null);

        if(konto == null){
            request.setAttribute("fejl","kontoen fandtes ikke :(");
            request.getRequestDispatcher("index.jsp").forward(request,response);
        }

        if(!konto.getKode().equals(kode)){
            request.setAttribute("fejl","Forkert kodeord");
            request.getRequestDispatcher("index.jsp").forward(request,response);

        }
        // det når vi hvis det lykkedes

        HttpSession session = request.getSession();
        session.setAttribute("konto", konto);
        request.getRequestDispatcher("WEB-INF/BrugerSide.jsp").forward(request,response);




    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
