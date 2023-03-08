# Desafio-POO-Dio

## Cálculo de área de retângulos e círculos, utilizando abstração, herança e polimorfismo conforme enunciado.

Você seleciona a quantidade de formas que deseja calcular, as medidas, e o programa retorna a área de acordo com os valores digitados.

Temos a classe abstrata "Forma" com o método calcularArea(), que pode ser utilizado pelas classes "Círculo" e "Retangulo" com uso do Polimorfismo. Sendo assim é possível criar outras classes com formas geométricas diferentes e realizar o cálculo de suas áreas utilizando o polimorfismo.

As classes "Circulo" e "Retangulo" utilizam herança e extendem da classe "Forma".

Utilizei também Enumeração para que os tipos "retângulo" e "círculo" fossem gravados na lista e exibidos no resultado.