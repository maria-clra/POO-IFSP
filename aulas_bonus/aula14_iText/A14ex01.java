import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class A14ex01 {
    public static void main(String[] args) {
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream("doc.pdf"));
            document.open();
            document.add(new Paragraph("hello world"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
    }
}