package Controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ArquivosController implements IarquivosController {
	String espaco="                                 ";
	@Override
	public void read(String path) throws IOException {
		File arq = new File(path);
		 if (!arq.exists()) {
	            System.out.println("Arquivo não encontrado.");
	            return;
	        }

	        try (BufferedReader buffer = new BufferedReader(new FileReader(arq))) {
	        	 String Linha = buffer.readLine();
			
			System.out.println("FOOD NAME\t\t"+espaco+"SCIENTIFIC NAME\t\t" +espaco+"SUBGROUP");
           System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

			while((Linha = buffer.readLine())!=null) {
				  String [] fruta= Linha.split(",");
	                String foodName = fruta[0];
	                String scientificName = fruta[1];
	                String subgroup = fruta[3];
	                String espaco="                            ";

	                if(subgroup.equalsIgnoreCase("tropical fruits" )) {
	                    System.out.println(foodName+"\t\t"+espaco+"      "+scientificName+ "\t\t"+espaco+"    "+subgroup);
	                }
	            
			}

			
		}catch (IOException e) {
	            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
	        }
	}
}


