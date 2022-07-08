package Aula18_lambdastream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.SplittableRandom;
import java.util.stream.Collectors;

public class LambdaStream {
	
	static int gerarIdade(int min,int max) {
		return new SplittableRandom().nextInt(min,max);
	}

	public static void main(String[] args) {
		System.out.println("Lista de nomes:");
		List<String> nomes = Arrays.asList("alice","pedro");
		nomes.forEach((n) -> System.out.println(n));
		
		//System.out.println(new SplittableRandom().nextInt(0,3));
		System.out.println("Lista de pessoas");
		List<Pessoa> pessoas = nomes.stream().map((n) -> new Pessoa(n, gerarIdade(15,30))).collect(Collectors.toList());
		pessoas.forEach((p) -> System.out.println(p.getNome() + " | " + p.getIdade()));
		
		System.out.println("Lista de pessoas maiores de idade:");
		List<Pessoa> pessoasMaioresDeIdade = pessoas.stream().filter((p) -> p.getIdade() >= 18).collect(Collectors.toList());
		pessoasMaioresDeIdade.forEach((pm) -> System.out.println(pm.getNome() + " | " + pm.getIdade()));
		
		System.out.println("Lista de pessoas ordenadas:");
		List<Pessoa> pessoasOrdenadas = pessoasMaioresDeIdade.stream().sorted((p1,p2) -> p1.getIdade() - p2.getIdade()).collect(Collectors.toList());
		pessoasOrdenadas.forEach(po -> System.out.println(po.getNome() +" | "+po.getIdade()));
		
		Integer total_idades = pessoasOrdenadas.stream().map(p -> p.getIdade()).reduce(0, (soma_idade,idade) ->  soma_idade += idade);
		System.out.println("Total: "+total_idades);
	}
}
