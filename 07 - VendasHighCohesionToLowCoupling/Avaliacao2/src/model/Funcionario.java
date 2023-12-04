package model;

abstract class Funcionario {

	private String nome;
	private Cargo cargo;
	
	
public Funcionario (String nome, Cargo cargo) {
	
	this.nome = nome;
	this.cargo = cargo;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Cargo getCargo() {
	return cargo;
}

public void setCargo(Cargo cargo) {
	this.cargo = cargo;
}


}
