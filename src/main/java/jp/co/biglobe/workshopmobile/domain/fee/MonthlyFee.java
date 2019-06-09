package jp.co.biglobe.workshopmobile.domain.fee;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 月額料金
 */
@AllArgsConstructor
public class MonthlyFee {
    @Getter
    private final int value;

    public MonthlyFee add(MonthlyFee arg) {
        return new MonthlyFee(value + arg.value);
    }
}
