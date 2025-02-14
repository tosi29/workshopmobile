package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.plan.EntameFreeOption;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
class Request {
    // プラン
    private PlanForm plan;

    // 動画・音楽楽しみ放題　エンタメフリー・オプション
    private boolean entame_free;

    @AllArgsConstructor
    enum PlanForm {
        g1(Plan._1ギガ), // 1ギガ(スタート)
        g3(Plan._3ギガ), // 3ギガ
        g30(Plan._30ギガ); // 30ギガ

        private final Plan plan;

        public Plan convertToDomainPlan() {
            return plan;
        }
    }

    public EntameFreeOption convertToDomainEntameFreeOption() {
        if (entame_free) {
            return EntameFreeOption.エンタメフリーあり;
        } else {
            return EntameFreeOption.エンタメフリーなし;
        }
    }

}
