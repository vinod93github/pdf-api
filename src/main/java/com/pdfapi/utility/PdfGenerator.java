package com.pdfapi.utility;

import java.io.File;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfGenerator {

	
	private static final String FILE_NAME = "D:\\pdf_generate_example\\pdfdocs\\sample5.pdf";

   

   public  void writeUsingIText() {

        Document document = new Document();

        try {

            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));

            //open
            document.open();

            Paragraph p = new Paragraph();
            p.add("Ticket");
            p.setAlignment(Element.ALIGN_CENTER);

            document.add(p);

           

            Font f = new Font();
            f.setStyle(Font.BOLD);
            f.setSize(8);

            document.add(new Paragraph("Ticket Details", f));

         

           

                PdfPTable table = new PdfPTable(2); // 3 columns.

                PdfPCell cell1 = new PdfPCell(new Paragraph("uid"));
                PdfPCell cell2 = new PdfPCell(new Paragraph("uname"));
                //PdfPCell cell3 = new PdfPCell(new Paragraph("Cell 3"));

                table.addCell(cell1);
                table.addCell(cell2);
               // table.addCell(cell3);

                document.add(table);
              //  table.setWidthPercentage(100);
               // table.setSpacingBefore(10f);

               // table.setSpacingAfter(10f);
            

                document.close();
            } catch(Exception e){

            }

            System.out.println("Done");
         
        

    }
}
