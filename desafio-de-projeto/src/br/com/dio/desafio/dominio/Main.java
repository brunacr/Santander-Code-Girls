package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descri��o do curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descri��o do curso JavaScript");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Descri��o da mentoria de Java");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootacmp Java Developer");
		bootcamp.setDescricao("Descri��o do Bootacmp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos inscritos Camila: " + devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("-");
		System.out.println("Conte�dos inscritos Camila: " + devCamila.getConteudosInscritos());
		System.out.println("Conte�dos conclu�dos Camila: " + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXp());
		
		System.out.println("-----------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("Jo�o");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos inscritos Jo�o: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conte�dos inscritos Jo�o: " + devJoao.getConteudosInscritos());
		System.out.println("Conte�dos conclu�dos Jo�o: " + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
		
		
	}

}
