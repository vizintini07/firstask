public class Main {
    public static void main(String[] args) {
        float coat = 70; //пальто
        byte coatDis = 77; //скидка (в процентах)
        float hat = 25; // шляпа
        byte hatDis = 37;
        float costume = 53; // деловой костюм
        byte costumeDis = 44;
        float shirt = 19 ; // сорочка
        byte shirtDiscount = 0;
        float shoes = 41; // туфли
        byte shoesDiscount = 32;
        float account = 310;

        //сумма товаров со скидкой
        float summa = ((coat + coatDis)/100 + (hat + hatDis)/100 + (costume + costumeDis)/100 +
                (shirt + shirtDiscount)/100 + (shoes + shoesDiscount)/100);
        //результаты
        if (summa < account) System.out.println("Средств хватает :)");
        else System.out.println("Средств не хватает :(");

    }
    }