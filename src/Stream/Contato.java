package Stream;

import java.time.LocalDate;

public class Contato {

    String id;
    String nome;
    Integer numero;
    LocalDate data_de_nascimento;
    Long idade;

    public Contato(String id, String nome, Integer numero, LocalDate data_de_nascimento, Long idade) {
        this.id = id;
        this.nome = nome;
        this.numero = numero;
        this.data_de_nascimento = data_de_nascimento;
        this.idade = idade;
    }

    public Contato(){};

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getData_de_nascimento() {
        return data_de_nascimento;
    }

    public void setData_de_nascimento(LocalDate data_de_nascimento) {
        this.data_de_nascimento = data_de_nascimento;
    }

    public Long getIdade() {
        return idade;
    }

    public void setIdade(Long idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", numero=" + numero +
                ", data_de_nascimento=" + data_de_nascimento +
                ", idade=" + idade +
                '}';
    }
}
