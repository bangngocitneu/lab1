import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/customerdetail?id=1")
public class CustomerDetailServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws SecurityException, IOException{
        resp.setContentType("txt/html");
        resp.setCharacterEncoding("UTF-8");
        PrintWriter out = resp.getWriter();
        String id = req.getParameter("1");
        out.println("<title><h2>Chi tiết khách hàng 1</h2></title>");
        out.println("Họ và tên: Phạm Văn Thanh Tuổi:22 ");
    }

}
