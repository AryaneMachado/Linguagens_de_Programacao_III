import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Produto {
    private String nome;
    private double precoCusto;
    private List<String> impostos;
    private double margemLucro;

    public Produto(String nome, double precoCusto, List<String> impostos, double margemLucro) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.impostos = impostos;
        this.margemLucro = margemLucro;
    }

    public double calcularPrecoVenda(Map<String, Double> impostoValores) {
        double totalImpostos = 0;
        for (String imposto : impostos) {
            totalImpostos += impostoValores.get(imposto);
        }

        double precoCustoFinal = precoCusto + totalImpostos;
        double precoVenda = precoCustoFinal * (1 + margemLucro / 100);

        return precoVenda;
    }

    public String getNome() {
        return nome;
    }
}

public class Main {
    public static void main(String[] args) {
        Map<String, Double> impostoValores = new HashMap<>();
        impostoValores.put("ICMS", 0.07);
        impostoValores.put("Confins", 0.12);
        impostoValores.put("IPI", 0.08);
        impostoValores.put("ISS", 0.05);
        impostoValores.put("Cide", 0.10);
        impostoValores.put("CSLL", 0.04);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(new Produto("Arroz", 7.00, List.of("Confins", "ICMS", "ISS"), 0.20));
        produtos.add(new Produto("Feijão", 7.00, List.of("Confins", "ICMS", "ISS"), 0.25));
        produtos.add(new Produto("Carne", 7.00, List.of("Confins", "ICMS", "IPI"), 0.35));
        produtos.add(new Produto("Cerveja", 7.00, List.of("Confins", "ICMS", "ISS", "IPI"), 0.30));
        produtos.add(new Produto("Gás", 7.00, List.of("Confins", "ICMS", "IPI"), 0.15));
        produtos.add(new Produto("Gasolina", 7.00, List.of("Confins", "ICMS", "Cide"), 0.15));

        for (Produto produto : produtos) {
            double precoVenda = produto.calcularPrecoVenda(impostoValores);
            System.out.println("Produto: " + produto.getNome() + " | Preço de Venda: R$" + precoVenda);
        }
        
    }
    
}