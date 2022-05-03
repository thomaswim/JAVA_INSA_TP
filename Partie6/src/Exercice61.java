import partie4.Voiture34;
import com.itextpdf.text.Document;
public class Exercice61 {


	public static void main(String[] args) {
		Voiture34 maVoiture = new Voiture34();
		maVoiture.accelere(50);
		System.out.println(maVoiture.getVitesse());
		Document document = new Document();
		//document.addAuthor("moi");
	}

}
