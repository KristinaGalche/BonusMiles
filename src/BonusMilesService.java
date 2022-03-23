public class BonusMilesService {
    public int calculate(int cost) {
        int bonusValue = 20;
        int miles = cost / bonusValue;
        return miles;
    }
}
