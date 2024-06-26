import java.util.Date;

public class PessoaJuridica extends Cliente {

    String cnpj;
    int numFuncionarios;
    String setor;

    public PessoaJuridica(String nome,  String endereco, String cnpj, int numFuncionarios, String setor){
         super(nome, endereco, new Date());
         this.cnpj = cnpj;
         this.numFuncionarios = numFuncionarios;
         this.setor = setor;
         
    }

    public String toString(){
        return 
        "\n==== Cliente PJ ===="+
        "\nNome: " + this.nome+
        "\nSetor: " + this.setor+
        "\nNumero de funcionários: " + this.numFuncionarios+
        "\nEndereco: " + this.endereco+
        "\nCNPJ: " + this.cnpj+
        "\n================";
    }

    @Override
    public boolean autenticar(String key){
        return key == cnpj;
    }

    @Override
    public boolean equals(Object obj) {
        PessoaJuridica pessoa = (PessoaJuridica) obj;
        return cnpj.equals(pessoa.cnpj);
    }

}