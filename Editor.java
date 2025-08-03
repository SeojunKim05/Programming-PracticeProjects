package csc142;

import java.util.Random;

public class Editor {
	private String name;
    private String company;
    private int bonusSoFar;

    private int TYPO_BONUS_EDITION_GT_5 = 5;
    private int TYPO_BONUS_EDITION_LE_5 = 3;

    public Editor(String name, String company) {
        this.name = name;
        this.company = company;
        this.bonusSoFar = 0;
    }

    public void correctTypos(int edition, String timeOfDay) {
        int typos = 0;
        if (edition <= 5) {
            typos = generateRandomNumber(40, 100);
        } else {
            typos = generateRandomNumber(10, 30);
        }

        if (timeOfDay.equals("Afternoon") || timeOfDay.equals("Evening")) {
            typos = (int) Math.round(typos * 0.7);
        }

        int typoBonus;
        if (edition <= 5) {
            typoBonus = TYPO_BONUS_EDITION_LE_5;
        } else {
            typoBonus = TYPO_BONUS_EDITION_GT_5;
        }

        int bonus = typos * typoBonus;
        bonusSoFar += bonus;

        System.out.println("This " + timeOfDay + ", I found " + typos + " typos and made $" + bonus);
    }

    public int bonusSoFar() {
        return bonusSoFar;
    }

    private int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
