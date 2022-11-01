public class BonusMilesService {
    public int calculate(int cost) {
        int amountPerMile = 20;
        int bonus = cost / amountPerMile;

        return bonus;
    }
}
