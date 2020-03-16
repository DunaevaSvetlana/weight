public class Weight {
    public static void main(String[] args) {
        final int racionDay = 1400;

        final int calories = 1800;
        final int chocolate = 340;
        final int porridge = 250;
        final int fat = 500;

        final int racion1 = calories + fat;
        final int racion2 = calories + chocolate;
        final int racion3 = calories + porridge;

        if (racion1 <= racionDay) {
            System.out.println("Ура! Ты можешь съесть сало!");
        } else if (racion2 <= racionDay) {
            System.out.println("Ура! Ты можешь съесть шоколад!");
        } else if (racion3 <= racionDay) {
            System.out.println("Ура! Ты можешь съесть кашу!");
        } else if ((racion1 > racionDay) || (racion2 > racionDay) || (racion3 > racionDay)) {
            System.out.println("Увы. Ничего нельзя съесть.");
        }
    }
}
