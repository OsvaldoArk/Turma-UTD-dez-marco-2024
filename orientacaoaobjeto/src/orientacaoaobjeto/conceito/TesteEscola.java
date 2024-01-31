package orientacaoaobjeto.conceito;

import java.util.ArrayList;
import java.util.List;

public class TesteEscola {
	
	
	public static void main(String[] args) {
		
		
		Aluno a01 = new Aluno("123.123.123.66","Paulo",21,"(85)987871818","Meireles","Turma");
		
		List<String> disciplinas = new ArrayList<>();
		
		disciplinas.add("Java");
		disciplinas.add("Javascript");
		
		Professor professor = new Professor("999.888.777-33","Jéssica",38,"(85)966554433","Parquelândia",disciplinas);
		
		System.out.println(professor);
		
		professor.mostraDisciplinas();
		
		System.out.println(a01);
	}
	
}
