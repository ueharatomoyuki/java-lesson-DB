package jp.co.axiz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.entity.Product;
import jp.co.axiz.service.ProductService;
import jp.co.axiz.util.ParamUtil;

@WebServlet("/logindb")
public class LogindbServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 文字化け対策
        request.setCharacterEncoding("UTF-8");

        // ログインID、パスワードを取得
        String name = request.getParameter("name");
        String price = request.getParameter("price") ;
        // 入力値のチェック
        if (ParamUtil.isNullOrEmpty(name) && ParamUtil.isNullOrEmpty(price)) {
            // メッセージ設定
        	List<Product> list = ProductService.find();
            request.setAttribute("userList", list);
            // 次画面指定
            request.getRequestDispatcher("searchRsult.jsp").forward(request, response);
            return;
        }
//        int Pid = Integer.parseInt(id) ;
//        // ログインチェック
//        ProductService ProductService = new ProductService();
//         Product product= ProductService.authentication(Pid);
//
//        // 表示メッセージの受け渡し
//        if (product != null) {
//            // メッセージ設定
//            request.setAttribute("msg","product_id:"+product.getProductId());
//            request.setAttribute("msg1","product_name:"+product.getProductName());
//            request.setAttribute("msg2","price:"+product.getPrice());
//            // 次画面指定
//            request.getRequestDispatcher("searchResult.jsp").forward(request, response);
//        } else {
//            // メッセージ設定
//            request.setAttribute("msg", "ログインできませんでした。  ");
//
//            // 次画面指定
//            request.getRequestDispatcher("top.jsp").forward(request, response);
//        }
    }

}
