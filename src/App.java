import java.util.Scanner;
import java.lang.Math;
//Exercicio 17: Faça um Programa para uma loja de tintas. O programa deverá
// pedir o tamanho em metros quadrados da área a ser pintada. Considere
// que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e
// que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou
// em galões de 3,6 litros, que custam R$ 25,00.
// Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
// (1) Comprar apenas latas de 18 litros;
// (2) Comprar apenas galões de 3,6 litros;
// (3) Misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
class Main {
  
  public static void main(String[] args) {
  //Declaração de variáveis
  double area;
  double litrosDeTinta; 
  double litrosDeTintaAjustado;
  double latasDeTinta;
  double galoesDeTinta;
  double custoTotalLatas;
  double custoTotalGaloes;
  double quantidadeDeTinta;
  double desperdicio;
  double custoTotal;
  Scanner teclado = new Scanner(System.in);

  //Passo 1: fazer a entrada dos dados
    System.out.println("Digite o tamanho da area a ser pintada em metros quadrados: ");
    //Digite a area a ser pintada
    area = teclado.nextDouble();

    //Passo 2: Fazer os calculos
    //Aplicando folga de 10% na quantidade de tinta
    litrosDeTintaAjustado = Math.ceil(area * 1.1 / 6);
    //Calculo de latas de tinta
    litrosDeTinta = area / 6;
    latasDeTinta = Math.ceil(litrosDeTinta / 18);
    galoesDeTinta = Math.ceil(litrosDeTinta / 3.6);
    custoTotalLatas = latasDeTinta * 80;
    custoTotalGaloes = galoesDeTinta * 25;
    
    latasDeTinta =  Math.ceil(litrosDeTintaAjustado / 18);
    if (litrosDeTintaAjustado %18 != 0) {
    latasDeTinta ++;  
    }
    //Calculo de galoes de tinta
    galoesDeTinta = Math.ceil(litrosDeTintaAjustado %18 / 3.6);
    if (litrosDeTintaAjustado %18 %3.6 != 0){
    galoesDeTinta ++;
    }
    //Calculo menor desperdicio misturando latas e galoes
    quantidadeDeTinta = latasDeTinta * 18.0 + galoesDeTinta * 3.6;
    desperdicio = quantidadeDeTinta - litrosDeTintaAjustado;
    //Calculo do custo total combinando latas e galoes
    custoTotal = latasDeTinta * 80.0 + galoesDeTinta * 25.0;
    
    //custoTotalLatas = latasDeTinta * 80 ;
    //custoTotalGaloes = galoesDeTinta * 25;
    
    //Passo 3: exibir a resposta pro usuário
    System.out.println("Situação 1 - Quantidade de latas de tinta");
    System.out.println("Litros: " + litrosDeTinta);
    System.out.println("Latas de 18 litros: " + latasDeTinta);
    System.out.println("Custo total: R$ " + custoTotalLatas);
    System.out.println("");
    System.out.println("Situação 2 - Quantidade de galões de tinta");
    System.out.println("Litros: " + litrosDeTinta);
    System.out.println("Galões de 3.6 litros: " + galoesDeTinta);
    System.out.println("Custo total: R$ " + custoTotalGaloes);
    System.out.println("");
       System.out.println("Situação 3 - Quantidade de tinta necessária com folga de 10%: ");
    System.out.println("Litros: " + litrosDeTintaAjustado);
    System.out.println("Latas de 18 litros: " + latasDeTinta);
    System.out.println("Galoes de 3.6 litros: " + galoesDeTinta);
    System.out.println("Desperdicio: " + desperdicio + " litros."); 
    System.out.println("Custo total: R$ " + custoTotal);
    teclado.close();
    
  }
  
}