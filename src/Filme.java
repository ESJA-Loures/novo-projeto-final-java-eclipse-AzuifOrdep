/*
  Adapta esta classe para aceitar o atributo ano
 */
public class Filme {
	private String titulo;
	public int ano;
	
	public Filme (String titulo,int ano) { // o construtor tem de aceitar o atributo ano
		this.titulo = titulo;
		this.ano = ano;
	}
	// Completa aqui o método Setter para alterar o título e o ano do filme
	public void setFilme(String titulo,int ano) {
		this.titulo = titulo;
		this.ano = ano;
	}
	// Completa aqui o método toString para apresentar o título e o ano do filme
	public String toString() {
		
		StringBuilder sb = new StringBuilder("");
		sb.append("Título: "+titulo+ "\n");
		sb.append("Ano: "+ano);
		return sb.toString();
	}
}
