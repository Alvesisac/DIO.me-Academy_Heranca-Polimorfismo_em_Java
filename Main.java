import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        exibirDadosColaborador(new Gerente());
        exibirDadosColaborador(new Vendedor());
    
    }

    public static void exibirDadosColaborador(Colaborador colaborador) {
        
        System.out.printf("=======%s=======\n", colaborador.getClass().getCanonicalName());
        switch (colaborador) {
            case Gerente gerente -> {
                gerente.setCodigo("123");
                gerente.setNome("Joao");
                gerente.setSalario(5000);
                gerente.setLogin("joao");
                gerente.setSenha("123456");
                gerente.setComissao(0.2);
                

                System.out.println(gerente.getCodigo());
                System.out.println(gerente.getSalario());
                System.out.println(gerente.getNome());
                System.out.println(gerente.getLogin());
                System.out.println(gerente.getSenha());
                System.out.println(gerente.getComissao());
                System.out.println(gerente.getValorVendido(500));
            } 
            case Vendedor vendedor -> {
                vendedor.setCodigo("456");
                vendedor.setNome("Maria");
                vendedor.setSalario(3000);
                vendedor.setPorcentagemVendas(10);
                vendedor.setValorVendido(1000);

                System.out.println(vendedor.getCodigo());
                System.out.println(vendedor.getSalario());
                System.out.println(vendedor.getNome());
                System.out.println(vendedor.getPorcentagemVendas());
                System.out.println(vendedor.getValorVendido());

            } 
        }
        colaborador.obterSalarioIntegral();
        System.out.println("Salário Integral: " + colaborador.obterSalarioIntegral());
    }
}