package csc363;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProjectServlet
 */
@WebServlet("/ProjectServlet")
public class ProjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProjectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		usedcar[] usedCars = getUsedCars();
		
		processRequestAndRespond(request, response, usedCars);
	}

	/**
	 * @param request
	 * @param response
	 * @param usedCars
	 * @throws ServletException
	 * @throws IOException
	 */
	private void processRequestAndRespond(HttpServletRequest request, HttpServletResponse response,
			usedcar[] usedCars) throws ServletException, IOException {
		String forwardingPage = "./Project.jsp";
		HttpSession mySession = request.getSession();
		String pName = (String)request.getParameter("username");
		String pPass = (String)request.getParameter("password");
		String sCarNum = (String)request.getParameter("carNum");
		int pCarNum = Integer.parseInt(sCarNum);
		
		mySession.setAttribute("AvailableCars", usedCars);
		
		if (pCarNum == 0) {
		  if (pName == null || pName == "" || pPass == null || pPass == "") {
			if (mySession.getAttribute("UserName") == null) {
				forwardingPage = "./Welcome.jsp";
				mySession.setAttribute("hasUName", false);
			}
		  } else {
			   forwardingPage = "./Project.jsp";
			   mySession.setAttribute("UserName", pName);
		  }
		} else {
			forwardingPage = "./ProjectDetail.jsp";
			mySession.setAttribute("currentCar", usedCars[pCarNum-1]);
		}
		
		request.getRequestDispatcher(forwardingPage).forward(request, response);
	}

	/**
	 * @return
	 */
	private usedcar[] getUsedCars() {
		usedcar[] usedCars = new usedcar[6];
		
		usedcar car1 = new usedcar();
		car1.setID(1);
		car1.setImgPath("http://autohouseusa.com/uimages/vehicle/3225677/full/2014-Nissan-Maxima-3-5-SV-w-Premium-Pkg-1N4AA5AP7EC444367-5780.jpeg");
		car1.setMakeModelName("2014 Nissan Maxima");
		car1.setPrice(25900);
		car1.setTotalMileage(31990);
		car1.setIntColor("Black");
		car1.setExtColor("Black");
		car1.setMPG("19 MPG City - 26 MPG Hwy");
		
		usedcar car2 = new usedcar();
		car2.setID(2);
		car2.setImgPath("http://2-photos7.motorcar.com/used-2016-bmw-m5-4drsedan-10007-16379204-14-1024.jpg");
		car2.setMakeModelName("2016 BMW M5");
		car2.setPrice(25900);
		car2.setTotalMileage(31990);
		car2.setIntColor("White");
		car2.setExtColor("Black");
		car2.setMPG("14 MPG City - 26 MPG Hwy");
		
        usedcar car3 = new usedcar();
        car3.setID(3);
        car3.setImgPath("http://saugusautomall.com/uimages/vehicle/2806211/full/2008-Acura-TL-Type-S-19UUA76538A040106-2036.jpeg");
		car3.setMakeModelName("2008 Acura TL Type-S");
		car3.setPrice(13750);
		car3.setTotalMileage(47580);
		car3.setIntColor("Black");
		car3.setExtColor("Black");
		car3.setMPG("19 MPG City - 23 MPG Hwy");
		
		usedcar car4 = new usedcar();
		car4.setID(4);
		car4.setImgPath("http://www.quattrodaily.com/wp-content/uploads/2016/05/img_0969-1024x768.jpg");
		car4.setMakeModelName("2017 Audi RS7");
		car4.setPrice(65900);
		car4.setTotalMileage(15990);
		car4.setIntColor("Red");
		car4.setExtColor("Black");
		car4.setMPG("16 MPG City - 21 MPG Hwy");
		
		usedcar car5 = new usedcar();
		car5.setID(5);
		car5.setImgPath("https://i.ytimg.com/vi/IWr4XWMKOXU/maxresdefault.jpg");
		car5.setMakeModelName("2017 Lexus IS350 F-Sport");
		car5.setPrice(35900);
		car5.setTotalMileage(11990);
		car5.setIntColor("Black");
		car5.setExtColor("White");
		car5.setMPG("19 MPG City - 27 MPG Hwy");
		
		usedcar car6 = new usedcar();
		car6.setID(6);
		car6.setImgPath("https://s.aolcdn.com/dims-global/dims3/GLOB/legacy_thumbnail/788x525/quality/85/https://s.aolcdn.com/commerce/autodata/images/USC40MBC793B021001_2.jpg");
		car6.setMakeModelName("2016 Mercedes-Benz E63 AMG");
		car6.setPrice(65750);
		car6.setTotalMileage(9760);
		car6.setIntColor("Black");
		car6.setExtColor("Black");
		car6.setMPG("19 MPG City - 27 MPG Hwy");

		usedCars[0] = car1;
		usedCars[1] = car2;
		usedCars[2] = car3;
		usedCars[3] = car4;
		usedCars[4] = car5;
		usedCars[5] = car6;
		return usedCars;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
