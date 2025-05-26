package crud;

import java.io.*;
import java.util.*;

public class MaquiagemCrud {
	// arquivo onde as maquiagens vão ser salvas 
	private static final String ARQUIVO = "maquiagem.txt";
	
	//CRIAR - adiciona nova maquiagem 
	public static void criar(Maquiagem m) throws IOException {
		//abre o arquivo p adicionar no final (append = true)
		BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO, true));
		// Escreve a maquiagem como texto (usando toString)
		writer.write(m.toString());
		// pula para a proxima linha
		writer.newLine();
		// fecha o arquivo 
		writer.close();
	}
	
	//READ - retornar todas as maquiagens  
	public static List<Maquiagem> lerMaquiagens() throws IOException {
		List<Maquiagem> lista = new ArrayList<>();
		File file = new File(ARQUIVO);
		if (!file.exists()) return lista;
		
		BufferedReader reader = new BufferedReader(new FileReader(ARQUIVO));
		String linha;
		while ((linha = reader.readLine()) !=null) {
			lista.add(Maquiagem.fromString(linha));
		}
		reader.close();
		return lista;
	}
	
	//UPDATE -atualiza uma maquiagem com base no ID
	public static void atualizarMaquiagem(int id, Maquiagem nova) throws IOException {
	    List<Maquiagem> lista = lerMaquiagens();
	    for (int i = 0; i < lista.size(); i++) {
	        if (lista.get(i).getId() == id) {
	            lista.set(i, nova);
	            break;
	        }
	    }
	    salvarLista(lista);
	}
	
	
	
	//DELETE: apaga uma maquiagem com base no ID
	public static void deletarMaquiagem(int id) throws IOException {
		//le todas as maquiagens
		List<Maquiagem> lista = lerMaquiagens();
		//remove da lista quem tem esse id
		lista.removeIf(m -> m.getId() == id);
		//salva a nova lista sem a maquiagem removida
		salvarLista(lista);
		
	}
	
//  reescreve todo o arquivo com a lista atualizada
	private static void salvarLista(List<Maquiagem> lista) throws IOException{
		// o BufferedWriter serve para escrever no arquivo
        // sem o "true", ele apaga o arquivo antes de escrever
		BufferedWriter writer = new BufferedWriter(new FileWriter(ARQUIVO));
		
		 // escreve cada maquiagem na lista
		for (Maquiagem m : lista) {
			writer.write(m.toString());
			writer.newLine();
		}
		writer.close();
	}
	
	//gera o próximo ID (um número a mais que o maior ID atual)
	public static int gerarProximoId() throws IOException {
	    List<Maquiagem> lista = lerMaquiagens();
	    int maxId = 0;
	 // verifica qual é o maior ID atual
	    for (Maquiagem m : lista) {
	        if (m.getId() > maxId) {
	            maxId = m.getId();
	        }
	    }
	 // retorna o próximo ID (um a mais)
	    return maxId + 1;
	}
	
}
