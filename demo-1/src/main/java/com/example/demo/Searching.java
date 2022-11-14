import java.sql.*;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Searching extends HttpServlet {
		private static final long serialVersionUID = 1L;
    
    public Searching() {
        super();
    }

    /**
     * jspから値を受け取って、結果を返却する
     */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); // 文字化け防止
		// 1.jspから送られてきた値を受け取る
		String[] tags = request.getParameterValues("zairyou");

		// 2.次の画面(jsp)に値を渡す
		request.setAttribute("languages", tags);
		
		// 3.次の画面に遷移
		request.getRequestDispatcher("/Result.jsp").forward(request, response);
	}
	
//	public static void main(String args[]) {
//		String url = "";
//		String sql = "select * from recipe_table where 1 = 1;";
//		
//		if (tag != null && tag.length >= 0) {
//			sql += "and recipe_table.Tag like '%' || ? || '%'";
//		}
//	}
}