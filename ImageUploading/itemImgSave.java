

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.itemImage.itemImageDao;

/**
 * Servlet implementation class itemImgSave
 */
@WebServlet("/itemImgSave")
@MultipartConfig(maxFileSize=16177216)
public class itemImgSave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public itemImgSave() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession ss = request.getSession(false);
		
		if(ss != null)
		{
		
		String usl = "jdbc:mysql://localhost:3306/brassdata";
		String user = "root";
		String pass = "";
		
		int ITID =  itemImageDao.getITID(request.getParameter("iname"));
		int imgID = itemImageDao.getImgID(ITID);
		int idetail = itemImageDao.getItemDetailID(request.getParameter("itdetail"));
		
		Part p = request.getPart("image");
		
		int r = 0;
		Connection con = null;
		
		if(p != null)
		{
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(usl, user, pass);
				PreparedStatement ps = con.prepareStatement("INSERT INTO `tbl_item_image`(`Img_ID`, `IT_ID`, `Item_ID`, `Item_Img_Data`, `Item_Img_IsAct`) VALUES (?,?,?,?,?)");
				InputStream io = p.getInputStream();
				ps.setInt(1, imgID);
				ps.setInt(2, ITID);
				ps.setInt(3, idetail);
				ps.setBlob(4,io);
				ps.setString(5, "true");
				
				r = ps.executeUpdate();
				
				if(r>0)
				{
					response.sendRedirect("imgItem.jsp?id="+ITID);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		}
		else
		{
			response.sendRedirect("adminlogin.jsp");
		}
	}

}
