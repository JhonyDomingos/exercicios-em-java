package INSS;

public class CalculoINSS {
    double percent = 0.15, desconto, bruto, liquido;

    public void inss () {
        desconto = bruto * percent;
        liquido = bruto - desconto;

        System.out.println("Salário  Bruto é de : " + bruto + " reais");
        System.out.println("Dedução do INSS é de : " + desconto + " reais");
        System.out.println("Salário Líquido é de : " + liquido + " reais");
    }
}
