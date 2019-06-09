package jp.co.biglobe.workshopmobile.domain.plan;

import jp.co.biglobe.workshopmobile.domain.fee.MonthlyFee;
import lombok.Value;

@Value
public class Contract {
    private final Plan plan;
    private final EntameFreeOption entameFreeOption;

    public Contract(Plan plan, EntameFreeOption entameFreeOption) {
        if (plan.equals(Plan._1ギガ) && entameFreeOption.equals(EntameFreeOption.エンタメフリーあり)) {
            throw new RuntimeException("無効な組み合わせが指定されました");
        }

        this.plan = plan;
        this.entameFreeOption = entameFreeOption;
    }

    public MonthlyFee calculateMonthlyFee() {
        return (plan.getMonthlyFee().add(entameFreeOption.getMonthlyFee()));
    }
}
