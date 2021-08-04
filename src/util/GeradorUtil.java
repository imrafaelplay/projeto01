/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author silvio.junior
 */
public class GeradorUtil {

    /**
     * Retorna um valor String conforme a quantidade de número solicitado
     *
     * @param qtde
     * @return
     */
    public String gerarNumero(int qtde) {
        String senha = "";
        int numero;
        for (int i = 0; i < qtde; i++) {
            numero = (int)(Math.random() * 10);
            senha = senha + numero;
        }
        return senha;
    }
    
    public String gerarCpf(){
        return gerarNumero(3) + "." + gerarNumero(3) + "." + gerarNumero(3) + "-" 
                + gerarNumero(2);
    }

    public double gerarSalario() {
        int numero = (int) (Math.random() * 100000);
        return numero;
    }

    public String gerarcnpj(){
        return gerarNumero(2) + "." + gerarNumero(3) + "." + gerarNumero(3) + "/0001-" + gerarNumero(2);
    }
   
    public String gerarcep(){
        return gerarNumero(5) + "-" + gerarNumero(3);
    }
   
    public String gerartelefonefixo(){
        return "(48)3" + gerarNumero(3) + "-" + gerarNumero(4);
    }
    
    public String gerartelefonecelular(){
        return "(48)9" + gerarNumero(4) + "-" + gerarNumero(4);
    }
    public String gerarnome(){
        String [] nomes = { "Rafael", "Arli", "João", "Ana", "lucas", "Luan", "Leonardo", "Giovana", "Rodrigo", 
            "Renan", "Francieli", "Diego", "Marcelo", "Jenifer", "Luiz", "Maria", "Pedro", "Matheus", "Gilherme", "Vinicius" };
        int tamanholista = nomes.length;
        int indice = (int) (Math.random() * tamanholista);
        String nome = nomes[indice];        
        return nomes[indice] + " " + gerarsobrenome();
    }
    private String gerarsobrenome(){
        String [] sobrenomes = { "Silva", "Motto", "Mota", "Oliveira", "Abravaneu", "Rocha", "Pereira", "Pires", "Percicotte", 
            "Santos", "Souza", "Zem", "Stark", "Peixes", "Fischer", "Smitch", "Tango", "Carvalho", "Peixoto", "Alves" };
        int tamanholista = sobrenomes.length;
        int indice = (int) (Math.random() * tamanholista);
        String sobrenome = sobrenomes[indice];
        return sobrenome;
    }
    
    
    public static void main(String[] args) {
        GeradorUtil util = new GeradorUtil();
        String nome = util.gerarnome();
        System.out.println("Nome: " + nome);
    }
}
