package proyecto.demo.services.pdf;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

import proyecto.demo.entities.Film;
import proyecto.demo.entities.Language;

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
        font.setColor(0, 107, 76);
        
         
        
        Table data=new Table(2);
        data.setPadding(5);
        data.addCell("ID: ");
        Integer id = filmData.getFilmId();
        data.addCell(id.toString());
        Float rentPrice= filmData.getRentalRate();
        data.addCell("Precio de Renta:");
        data.addCell("$ " + rentPrice.toString());
        data.addCell("Lanzamiento:");
        data.addCell("2026");
        data.addCell("Duracion:");
        Short duration=filmData.getLength();
        data.addCell(duration.toString() + " min.");
        data.addCell("Categoria:");
        data.addCell(categoria.toString());
        data.addCell("Lenguaje:");
        Language lang=filmData.getLanguage();
        data.addCell(lang.getName());
        data.addCell("Clasificacion:");
        data.addCell(filmData.getRating());
        data.addCell("Descripcion:");
        data.addCell(filmData.getDescription());
        data.addCell("Actores:");
        data.addCell(actores.toString());
        
        
        
        Paragraph T = new Paragraph(filmData.getTitle(), font);
        T.setAlignment(Paragraph.ALIGN_CENTER);
        pdf.add(T);
        pdf.add(data);
        
        
		pdf.close();
		
		
	}

	
}

