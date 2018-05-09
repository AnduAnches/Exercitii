package ro.siit.java;

import java.util.Arrays;

public class FunctionsExample {
    public static void main(String[] args) {
        String [] playerNames = new String[]{"Ion", "Matache", "Jesus", "Zoli", "Jiji"};
        int [] playerAppearances = new int[] {20, 21, 20, 4, 18};
        int [] playerGoals = new int[] {2, 0, 10, 4, 2};

        int maxAppearanceIndex = getMtUsedPlayer(playerAppearances);
        String mostUsedPlayer = playerNames[maxAppearanceIndex];
        System.out.println(mostUsedPlayer);

        int maxGoals = getTopScorer(playerGoals);
        String bestScorer = playerNames[maxGoals];
        System.out.println(bestScorer);

        int maxEfficient = getMaxEfficiency(playerAppearances, playerGoals);
        String mostEfficient = playerNames [maxEfficient];
        System.out.println(mostEfficient);
    }

    private static int getMaxEfficiency(int[] playerAppearances, int[] playerGoals) {
        double maxEfficiency = 0;
        int playerIndex = -1;
        double [] playerEfficiency = new double[5];
        for (int i = 0; i < playerGoals.length; i++){
            playerEfficiency [i] = playerGoals [i] / playerAppearances [i];
            if (playerEfficiency[i] > maxEfficiency) {
                maxEfficiency = playerEfficiency [i];
                playerIndex = i;
            }
        }
        return playerIndex;
    }

    private static int getMtUsedPlayer(int[] playerAppearances) {
        int maxAppearances = 0;
        int maxAppearanceIndex = -1;
        for (int i = 0; i < playerAppearances.length; i++){
            if (playerAppearances[i] > maxAppearances) {
                maxAppearances = playerAppearances [i];
                maxAppearanceIndex = i;
            }
        }
        return maxAppearanceIndex;
    }

    private static int getTopScorer(int[] playerGoals) {
        int maxGoals = 0;
        int playerIndex = -1;
        for (int i = 0; i < playerGoals.length; i++){
            if (playerGoals[i] > maxGoals) {
                maxGoals = playerGoals [i];
                playerIndex = i;
            }
        }
        return playerIndex;
    }
}
