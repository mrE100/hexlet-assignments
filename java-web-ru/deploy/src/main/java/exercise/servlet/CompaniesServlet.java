package exercise.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;
import static exercise.Data.getCompanies;

public class CompaniesServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
                throws IOException, ServletException {

        // BEGIN
        PrintWriter out = response.getWriter();
        List<String> result = getCompanies();
        String filter = request.getParameter("search");
        if (!filter.isEmpty()) {
            result = new ArrayList();
            for (String company : getCompanies()) {
                if (company.contains(filter)) {
                    result.add(company);
                }
            }
            if (result.isEmpty()) {
                result.add("Companies not found");
            }
        }
        for (String str : result) {
            System.out.println(str);
            out.println(str);
        }

        // END
    }
}
