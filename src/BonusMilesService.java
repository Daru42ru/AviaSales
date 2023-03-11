public class BonusMilesService {
    public int calculate(int price) {
        int result;
        if (price > 10_000) {
            result = 500;
        } else {
            result = price / 20;
        }
        return result;
    }
}
