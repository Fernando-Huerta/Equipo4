package proyecto.demo.services.pdf;

import java.awt.Color;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Header;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

import proyecto.demo.entities.Film;

public class FilmPDFExporter {
	
	private Film  filmData;
	private List<String> categoria;
	private List<String> actores;
		
	public FilmPDFExporter(Film film, List<String> categoria, List<String> actores) {
		filmData=film;
		this.categoria=categoria;
		this.actores=actores;
		
	}
	
	public void export(HttpServletResponse response ) throws DocumentException, IOException {
	
		Document pdf= new Document(PageSize.LETTER);
		PdfWriter.getInstance(pdf, response.getOutputStream());
		pdf.open();
		Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        font.setSize(18);
        font.setColor(0, 107, 76);;
         
        
        Table data=new Table(2);
        data.addCell("ID: ");
        //Chunk id=new Chunk();
       // data.addCell();
        
        Paragraph T = new Paragraph(filmData.getTitle(), font);
        T.setAlignment(Paragraph.ALIGN_CENTER);
        pdf.add(T);
        pdf.add(data);
        
        
		pdf.close();
		
		
	}

	
}

