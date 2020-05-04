

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@WebServlet("/unirest_api")
public class unirest_api extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			HttpResponse<String> response1 = Unirest.get("https://indianrailways.p.rapidapi.com/index.php?pnr=1234567890")
					.header("x-rapidapi-host", "indianrailways.p.rapidapi.com")
					.header("x-rapidapi-key", "aa825c625amsh2ec4231e4ca33d9p16f572jsn413bcf0ef10d")
					.asString();
			System.out.println(response1);
			String st = request.getParameter("name");
			System.out.println(st);
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
