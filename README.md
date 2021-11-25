#### Сравнение производительности коллекций Java
____
__1. Сравнение MyLinkedList, LinkedList, ArrayList__

![-](pictures/1.png)
![-](pictures/2.png)
![-](pictures/3.png)
![-](pictures/4.png)

Исходя из результатов можно сделать вывод, что ArrayList во всём эффективнее, чем LinkedList. В этих тестах данных было достаточно много и индекс генерировался случайно с равномерным распределением. Таким образом создавались ситуации, в которых LinkedList был максимально неэффективен(например если индекс получался близким к середине), либо же, напротив, ArrayList(например индекс был маленьким в удалении)
Рассмотрим частные случаи:

![-](pictures/10.png)
![-](pictures/11.png)

ArrayList очень неэффективен при вставке и удалении в начале массива

__Вывод:__ LinkedList в большинстве случаев проигрывает ArrayList, но в частных случаях, если нужно, например, много данных удалять или вставлять в начало, определенно лучше LinkedList.
Также LinkedList стабильнее добавляет элементы, т.к. ArrayList нужно расширяться, что может произойти неожиданно и невовремя.

____

__2. Сравнение HashSet, LinkedHashSet, TreeSet__

![-](pictures/5.png)
![-](pictures/6.png)

__Вывод:__ Структуры отличаются хранением данных. Стоит выбирать LinkedHashMap/TreeSet если необходимо хранить данные в порядке добавления/отсортированно. В остальном подойдёт HashSet.

____

__3. Сравнение HashMap, LinkedHashMap, TreeMap__

![-](pictures/7.png)
![-](pictures/8.png)
![-](pictures/9.png)

__Вывод:__ Структуры хранят пару (ключ, значение). Выбор структуры абсолютно аналогичен структурам Set.

