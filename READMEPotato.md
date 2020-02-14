# ScalaTasks
Дано:
weight: BigDecimal  - вес имеющегося картофеля.
potatoWaterRatio: Double  - (0,1), доля воды в картофеле до того, как из него сделали чипсы.
crispsWaterRatio: Double - (0,1), доля воды в чипсах.
Найдите массу чипсов, которая получится.

Для этого реализуйте следующий метод:

def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal

Ответ нужно дать с точностью до пяти знаков после запятой.
Ничего считывать и выводить в консоль не нужно. Просто реализуйте метод.

 
Подсказка: у BigDecimal есть метод .setScale, позволяющий задавать точность числа и стратегию округления. Используйте стратегию округления HALF_UP
_______
