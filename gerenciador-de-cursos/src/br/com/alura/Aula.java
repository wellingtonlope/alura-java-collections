package br.com.alura;

public class Aula implements Comparable<Aula> {
	
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}

	public String toString() {
		return "[aula: " + this.titulo + "," + this.tempo + "]";
	}

	//1<2 -, 1>2 + 1==2 0
	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	};

}
