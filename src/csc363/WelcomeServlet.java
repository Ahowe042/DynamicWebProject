package csc363;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WelcomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String[] carImages = getCarImages();
		
		processRequestAndRespond(request, response, carImages);
	}

	/**
	 * @param request
	 * @param response
	 * @param carImages
	 * @throws ServletException
	 * @throws IOException
	 */
	private void processRequestAndRespond(HttpServletRequest request, HttpServletResponse response,
			String[] carImages) throws ServletException, IOException {
		String forwardingPage = "./Welcome.jsp";
		
		HttpSession mySession = request.getSession();
		mySession.setAttribute("CarImageSet", carImages);
		
		request.getRequestDispatcher(forwardingPage).forward(request, response);
	}

	/**
	 * @return
	 */
	private String[] getCarImages() {
		String[] carImages = new String[6];
		
		String c1 = "https://i.ebayimg.com/00/s/MzJYMzI=/z/8lQAAOSwKWpZdRO8/$_86.JPG";
		String c2 = "https://1.bp.blogspot.com/-fyJWRzvdmas/Vsp-vRXOZtI/AAAAAAAAAjM/Z3MzaUYf0H8/s640/1994-toyota-supra-for-sale-new-twin-turbo-specs-concept-engine-price-used-parts-wallpaper-cheap-mk3-rz-performance.jpg";
		String c3 = "http://s3.amazonaws.com/photos.ecarlist.com/AP/Z4/Rq/wG/4W/3P/IG/tj/5s/UW/uA_800.jpg";
		String c4 = "http://classiccardb.com/uploads/postfotos/nissan-300zx-turbo-coupe-5-speed-very-clean-built-engine-hks-arc-cusco-nismo-10.JPG";
		String c5 = "https://3bntxw295kc031i6zl2nl2wh-wpengine.netdna-ssl.com/wp-content/uploads/2010/04/05-Elise.jpg";
		String c6 = "https://3bntxw295kc031i6zl2nl2wh-wpengine.netdna-ssl.com/wp-content/uploads/2010/08/Honda-S2000_web.jpg";
		
		carImages[0] = c1;
		carImages[1] = c2;
		carImages[2] = c3;
		carImages[3] = c4;
		carImages[4] = c5;
		carImages[5] = c6;
		return carImages;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
