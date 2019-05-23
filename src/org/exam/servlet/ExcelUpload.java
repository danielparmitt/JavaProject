package org.exam.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


@WebServlet("/excelupload")
public class ExcelUpload extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ExcelUpload() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Part filepart = request.getPart("file");
		String filename = Paths.get(filepart.getSubmittedFileName()).getFileName().toString();
		InputStream is = filepart.getInputStream();
		System.out.println(filename + is);
	}

}
