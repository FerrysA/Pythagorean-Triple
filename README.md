# Pythagorean-Triple
# 07.10.22
# метод pythagoreanTriple возвращает 1 если целые a,b,c являются прифагоровыми тройками
# [ссылка на задание](https://www.codewars.com/kata/5951d30ce99cf2467e000013)
реализация :
* public static int pythagoreanTriple(int[] triple){

        int a = triple[0];
        int b = triple[1];
        int c = triple[2];
        if (c*c==a*a+b*b){return 1;}
        if (a*a==b*b+c*c){return 1;}
        if (b*b==a*a+c*c){return 1;}
    return 0;
    }
