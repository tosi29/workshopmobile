package jp.co.biglobe.workshopmobile.domain.plan;

import jp.co.biglobe.workshopmobile.domain.fee.MonthlyFee;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * エンタメフリーオプション
 */
@AllArgsConstructor
public enum EntameFreeOption {
    エンタメフリーなし(new MonthlyFee(0)),
    エンタメフリーあり(new MonthlyFee(1200));

    @Getter
    private final MonthlyFee monthlyFee;
}
