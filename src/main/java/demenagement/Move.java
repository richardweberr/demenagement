package demenagement;

public class Move {
    final int totalOfBoxes = 34;
    final int boxesPerMove = 9;

    public void moveBoxes() {
        int numberOfMoves = 0;
        int boxesRemaining = totalOfBoxes;
        int boxesCharged = 0;

        while (boxesRemaining > 0) {
            while ((boxesRemaining > 0) && (boxesCharged < boxesPerMove)) {
                boxesRemaining--;
                boxesCharged++;
                System.out.println("Camion n° " + numberOfMoves + ": 1 carton chargé; il reste " + boxesRemaining +
                        " cartons à charger; " + boxesCharged + "cartons sont déjà chargés dans le camion");
            }
            boxesCharged = 0;
            numberOfMoves++;
        }
    }
}